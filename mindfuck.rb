include Java
require 'jedi.jar'

java_import 'com.jedi.Destroyer'
#java_import 'com.jedi.Jedi'

obi_wan = Java::ComJedi::Jedi.new 'ObiWan', 'blue'
destroyer = Destroyer.new obi_wan

puts obi_wan.to_s
puts obi_wan.class
puts destroyer.showJedi
