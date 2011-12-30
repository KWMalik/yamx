# Require the necessary init.rb file
require 'yamxserver'

set :run, false
set :environment, :production

# deploy httpd server
run Sinatra::Application
