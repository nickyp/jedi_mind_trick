package com.jedi;

public class Destroyer {

//    public static void main(String[] args) {
//        System.out.println("Destroyer is ready for destroying");
//
//        Jedi j = new Jedi("Jawa", "doesnt have a lightsaber");
//        Destroyer d = new Destroyer(j);
//        d.showJedi();
//    }

    public Jedi getJedi() {
        return jedi;
    }

    public void setJedi(Jedi jedi) {
        this.jedi = jedi;
    }

    public Jedi jedi;

    public Destroyer(Jedi jedi) {
        this.setJedi(jedi);
    }

    public void showJedi() {
        System.out.println(this.getJedi().name());
    }

    public void showBytes(byte [] data) {
        System.out.println(BytesToHexString(data));
    }

    public byte[] getBytes() {
        byte[] bytes = {(byte) 0x9E, (byte) 0x87, (byte) 0x42};
        return bytes;
    }

    public static String BytesToHexString(byte[] array) {
        String s, out = "";
        int lng = array.length;
        // The length stored at [0] is include in the array lng information
        for (int i = 0; i < lng; i++)
        {
            s = "OX";
            s += Integer.toHexString((byte) array[i] & 0xFF);
            if (s.length() == 1)
            {
                s = "0" + s; // A => 0x0A
            }
            s += "\n";
            out += s.toUpperCase();
        }
        return (out);
    }


}
