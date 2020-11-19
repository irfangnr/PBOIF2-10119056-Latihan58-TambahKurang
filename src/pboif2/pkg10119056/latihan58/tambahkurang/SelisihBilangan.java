/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan58.tambahkurang;

/**
 *
 * @author ACER
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        int a,b;
        a=getX();
        b=getY();
        System.out.println("Hasil Selisih "+a+" - "+b+" = "+(a-b));
    }
}
