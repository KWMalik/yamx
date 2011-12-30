# Disable Rake-environment-task framework detection by uncommenting/setting to false
# Warbler.framework_detection = false

# Warbler web application assembly configuration file
Warbler::Config.new do |config|

  # Application directories to be included in the webapp.
  config.dirs = %w(config lib views tmp)

  # Additional files/directories to include, above those in config.dirs
  config.includes = FileList["website.rb"]

  config.gems += ["sinatra", "haml"]
  config.gems -= ["rails"]
  config.gem_dependencies = true	

end
