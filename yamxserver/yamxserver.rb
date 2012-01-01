require 'rubygems'
require 'sinatra'
require 'haml'
require 'yaml'
require 'data_mapper'

require 'lib/yamx.pb.rb'

DataMapper::Logger.new($stdout, :debug)

DataMapper.setup(:default, "sqlite://#{Dir.pwd}/yamx.db")


class Monitorable
  include DataMapper::Resource

  property :id,         Serial 
  property :app_name,   String, :required => true   
  property :hostname,   String, :required => true
  property :ipaddr,     String, :required => true
  property :sys_type,   String
  property :os,         String
  property :created_at, DateTime
  property :last_heartbeat_at, DateTime 
end

DataMapper.finalize
DataMapper.auto_upgrade!

get "/" do
  @list = Monitorable.all
  p @list
  p @list.count
  haml :index
end

post "/" do
  request.body.rewind

  si = Com::Srikanthps::Yamx::Proto::SysInfo.new
  p si.parse_from_string(request.body.read)
  
  m = Monitorable.new (
    :app_name => si.appName,
    :hostname => si.hostname,
    :ipaddr => si.ipAddr,
    :sys_type => si.systemType,
    :os => si.osinfo,
    :created_at => Time.now,
    :last_heartbeat_at => Time.now
  )

  p m
  if m.save!
    "Success"
  else
    msg = "Errors occurred:"
    m.errors.each { |e|
      msg += "#{e}, "
    }
    msg
  end

end

