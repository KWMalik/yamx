require 'rubygems'
require 'sinatra'
require 'haml'
require 'yaml'

get "/" do
  haml :index
end

post "/" do
  "Success"
end

