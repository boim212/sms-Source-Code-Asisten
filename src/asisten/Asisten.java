/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asisten;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Asisten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double ipk;
        String nama;
        int angkatan;
        
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------PROGRAM ASISTEN-------------------");
        System.out.println("---------------------------------------------------");
        System.out.print  ("Masukkan Nama Asisten = " );
        nama = input.nextLine();
        System.out.print  ("Masukkan Nilai IPK  = " );
        ipk = input.nextDouble();
        System.out.print  ("Masukkan Angkatan = " );
        angkatan = input.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------PROGRAM ASISTEN-------------------");
        System.out.println("---------------------------------------------------");
        if ( ipk > 3.5 && (angkatan > 2016 && angkatan < 2019)){
            System.out.println("");
            System.out.println("---------------------------------------------------");
            System.out.println("-----------------PROGRAM ASISTEN-------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("Nama Asisten = " + nama);
            System.out.println("Nilai IP Komulatif = " + ipk);
            System.out.println("Selamat, Anda Layak Untuk Menjadi Asisten");
            System.out.println("---------------------------------------------------");
            System.out.println("--------PROGRAM ASISTEN BY SKUY DEVELOPER---------");
            System.out.println("---------------------------------------------------");
        }
        else{
            System.out.println("");
            System.out.println("---------------------------------------------------");
            System.out.println("-----------------PROGRAM ASISTEN-------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("Nama Asisten = " + nama);
            System.out.println("Nilai IP Komulatif = " + ipk);
            System.out.println("Maaf, Anda Tidak Layak Untuk Menjadi Asisten");
            System.out.println("---------------------------------------------------");
            System.out.println("--------PROGRAM ASISTEN BY SKUY DEVELOPER---------");
            System.out.println("---------------------------------------------------");
        }
    }
    
}
