task :default => [:compile]

task :compile do
  puts "Compiling..."
  sh 'jrubyc obiwan.rb'
end

task :run do
  puts "Running..."
  sh 'java -cp .:/Users/tarkin/.rvm/rubies/jruby-1.6.0/lib/jruby.jar obi_wan'
end
