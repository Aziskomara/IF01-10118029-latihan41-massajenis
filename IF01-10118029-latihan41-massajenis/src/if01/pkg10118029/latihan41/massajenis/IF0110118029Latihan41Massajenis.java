/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Massa jenis
 */
public class IF0110118029Latihan41Massajenis {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        kubus kubus = new kubus();
        
        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kubus.setSisi(scanner.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scanner.nextInt());
        
        System.out.println("\n"+"========Hasil Perhitungan========");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), 
                            kubus.hitungVolume(kubus.getSisi())));
    }
    
}
