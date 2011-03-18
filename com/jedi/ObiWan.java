package com.jedi;

import org.jruby.Ruby;
import org.jruby.RubyObject;
import org.jruby.javasupport.util.RuntimeHelpers;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.javasupport.JavaUtil;
import org.jruby.RubyClass;


public class ObiWan extends RubyObject  {
    private static final Ruby __ruby__ = Ruby.getGlobalRuntime();
    private static final RubyClass __metaclass__;

    static {
        String source = new StringBuilder("require 'java'\n" +
            "\n" +
            "java_package 'com.jedi'\n" +
            "\n" +
            "class Jedi\n" +
            "\n" +
            "  java_signature 'Jedi(String name, String lightsaber_color)'\n" +
            "  def initialize(name, lightsaber_color)\n" +
            "    @name= name\n" +
            "    @lightsaber_color= lightsaber_color\n" +
            "  end\n" +
            "\n" +
            "  # Note: using explicit readers for now to add java_signature\n" +
            "\n" +
            "  java_signature 'String name()'\n" +
            "  def name\n" +
            "    @name\n" +
            "  end\n" +
            "\n" +
            "  java_signature 'String lightsaber_color()'\n" +
            "  def lightsaber_color\n" +
            "    @lightsaber_color\n" +
            "  end\n" +
            "\n" +
            "end\n" +
            "\n" +
            "class ObiWan < Jedi\n" +
            "\n" +
            "  java_signature 'ObiWan()'\n" +
            "  def initialize\n" +
            "    super('Obi Wan Kenobi', 'blue')\n" +
            "  end\n" +
            "\n" +
            "end\n" +
            "\n" +
            "class LukeSkyWalker < Jedi\n" +
            "\n" +
            "  java_signature 'LukeSkywalker()'\n" +
            "  def initialize\n" +
            "    super('Luke Skywalker', 'green')\n" +
            "  end\n" +
            "\n" +
            "end\n" +
            "\n" +
            "#obi = ObiWan.new\n" +
            "#luke = LukeSkyWalker.new\n" +
            "#\n" +
            "#\n" +
            "#jedis = java.util.ArrayList.new\n" +
            "#jedis << obi\n" +
            "#jedis << luke\n" +
            "#\n" +
            "#jedis.each do |j|\n" +
            "#  puts \"-------Jedi-----------------------------\"\n" +
            "#  puts \"name: #{j.name}\"\n" +
            "#  puts \"lightsaber_color: #{j.lightsaber_color}\"\n" +
            "#  puts \"----------------------------------------\"\n" +
            "#end\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "").toString();
        __ruby__.executeScript(source, "obi_wan.rb");
        RubyClass metaclass = __ruby__.getClass("ObiWan");
        metaclass.setRubyStaticAllocator(ObiWan.class);
        if (metaclass == null) throw new NoClassDefFoundError("Could not load Ruby class: ObiWan");
        __metaclass__ = metaclass;
    }

    /**
     * Standard Ruby object constructor, for construction-from-Ruby purposes.
     * Generally not for user consumption.
     *
     * @param ruby The JRuby instance this object will belong to
     * @param metaclass The RubyClass representing the Ruby class of this object
     */
    private ObiWan(Ruby ruby, RubyClass metaclass) {
        super(ruby, metaclass);
    }

    /**
     * A static method used by JRuby for allocating instances of this object
     * from Ruby. Generally not for user comsumption.
     *
     * @param ruby The JRuby instance this object will belong to
     * @param metaclass The RubyClass representing the Ruby class of this object
     */
    public static IRubyObject __allocate__(Ruby ruby, RubyClass metaClass) {
        return new ObiWan(ruby, metaClass);
    }

    
    public  ObiWan() {
        this(__ruby__, __metaclass__);

        RuntimeHelpers.invoke(__ruby__.getCurrentContext(), this, "initialize");

    }

}
