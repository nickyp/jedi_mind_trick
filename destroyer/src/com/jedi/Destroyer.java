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


}
