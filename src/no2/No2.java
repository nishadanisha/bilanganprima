/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no2;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class No2 {
    
    public static void main(String[] args) {
        boolean nemu=true;
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan angka awal : ");
        int awal = angka.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int akhir = angka.nextInt();
        System.out.print("Deret bilangan prima antara : ");
        for (int i = awal; i<=akhir; i++) {
            if(i==2) {
                nemu=true;
            }
            else
                for (int j = 2; j<i; j++) {
            if(i%j==0) {
                nemu=false;
                break;
        }
            else
                nemu=true;
    }
if(nemu){
    System.out.print(i+",");
        }
    }
}
}