/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package sifrelihaberlesme;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Rabia
 */
public class Rsa {
    
    public int p = 11;
    public int q = 17;
    int n = p*q;
    int fonk = (p-1)*(q-1);
    Random rand = new Random();
    int e = rand.nextInt(fonk);
    
    public void sifreli(ArrayList list, int e) {
        for(int i = 0 ; i<=list.size() ; i++ ){
            e = 3;
            int dizi[] = null;
            int a = (int) list.get(i);
            dizi[i] = (int) Math.pow(a,e);
            System.out.println("çalıştı");
        }
    }
}
