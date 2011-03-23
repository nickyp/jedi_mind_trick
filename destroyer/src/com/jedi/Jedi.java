package com.jedi;

/**
 * The interface our Ruby implementations should respect
 */
public interface Jedi {

    public String name();
    public String lightsaber_color();
    public String showBytes(byte [] data);

}
