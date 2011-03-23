include Java
require 'Destroyer.jar'

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

  java_signature 'String showBytes(byte [] data)'
  def show_bytes(data)
    puts String.from_java_bytes(data)
  end

end

java_import 'com.jedi.Destroyer'

obi_wan = ObiWan.new 'ObiWan', 'blue'
destroyer = Destroyer.new obi_wan

puts destroyer.getJedi().lightsaber_color
puts destroyer.showJedi
puts

puts "Java bytes:\n\n"

bytes = destroyer.getBytes()
puts bytes.inspect
bytes.each_with_index do |b,i|
  puts "#{i} => #{b} -> %#X" % b
end

puts

puts "Ruby bytes:\n\n"

ruby_bytes = bytes.to_a
puts ruby_bytes.inspect

ruby_bytes.to_a.each_with_index do |b,i|
  puts "#{i} => #{b} -> %#X" % b
end

puts
puts "Ruby bytes given to Java to print\n\n"
destroyer.showBytes(bytes)

puts "Serialization:"
puts

packed = ruby_bytes.pack("C*").unpack("H*")
puts "Packed: " + packed.first

unpacked = packed.pack("H*").unpack("c*")
puts "Unpacked: " + unpacked.inspect
puts

puts "Unpacked bytes given to java to print"

destroyer.showBytes(unpacked)


