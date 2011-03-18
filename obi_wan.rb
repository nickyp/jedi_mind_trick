puts "go go power ranger"

include Java
require 'jedi.jar'

#require 'java'
#
#java_package 'com.jedi'

#class Jedi
#
#  java_signature 'Jedi(String name, String lightsaber_color)'
#  def initialize(name, lightsaber_color)
#    @name= name
#    @lightsaber_color= lightsaber_color
#  end
#
#  # Note: using explicit readers for now to add java_signature
#
#  java_signature 'String name()'
#  def name
#    @name
#  end
#
#  java_signature 'String lightsaber_color()'
#  def lightsaber_color
#    @lightsaber_color
#  end
#
#end
#
#class ObiWan < Jedi
#
#  java_signature 'ObiWan()'
#  def initialize
#    super('Obi Wan Kenobi', 'blue')
#  end
#
#end
#
#class LukeSkyWalker < Jedi
#
#  java_signature 'LukeSkywalker()'
#  def initialize
#    super('Luke Skywalker', 'green')
#  end
#
#end

#obi = ObiWan.new
#luke = LukeSkyWalker.new
#
#
#jedis = java.util.ArrayList.new
#jedis << obi
#jedis << luke
#
#jedis.each do |j|
#  puts "-------Jedi-----------------------------"
#  puts "name: #{j.name}"
#  puts "lightsaber_color: #{j.lightsaber_color}"
#  puts "----------------------------------------"
#end

class ObiWan
  include Java::ComJedi::Jedi

  def initialize(name, lightsaber_color)
    @name= name
    @lightsaber_color= lightsaber_color
  end

  java_signature 'String name()'
  def name
    @name + " is NOT the best"
  end

  java_signature 'String lightsaber_color()'
  def lightsaber_color
    @lightsaber_color
  end

end

java_import 'com.jedi.Destroyer'
#java_import 'com.jedi.Jedi'

obi_wan = ObiWan.new 'ObiWan', 'blue'
destroyer = Destroyer.new obi_wan

puts destroyer.getJedi().lightsaber_color
puts destroyer.showJedi



