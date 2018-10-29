/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan62_livingthing;

/**
 *
 * @author Geo Syah Alkausar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan apa yang dilakukan manusia
 */
public class PBO2_10117081_Latihan62_LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human a = new Human();
        a.setNama("Geo Syah Alkausar");
        a.walk(a.getNama());
        a.breath(a.getNama());
        a.eat(a.getNama());
    }
    
}
