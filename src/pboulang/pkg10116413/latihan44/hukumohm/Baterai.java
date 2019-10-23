/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan44.hukumohm;

/**
 *
 * @author Lenovo
 */
public class Baterai {

    private final float kuatArus;
    private final float hambatan = (float) 12.0;

    public Baterai() {
        this.kuatArus = (float) 3.0;

    }

    public float getKuatArus() {
        System.out.println("kuat Arus : " + kuatArus + " Ampere ");
        return kuatArus;
    }

    public float getHambatan() {
        System.out.println("Hambatan : " + hambatan + " ohm ");
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }

}


