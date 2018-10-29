/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan62_livingthing;

/**
 *
 * @author Geo Syah Alkautsar
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " bernapas");
    }
    public void eat(String nama) {
        System.out.println(nama + " makan");
    }
    
}
