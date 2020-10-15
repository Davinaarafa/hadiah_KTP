/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;
import java. util. Scanner;
/**
 *
 * @author MOKLET-02
 */
public class KTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nama,ttl, kelamin, darah, alamat, kelurahan, kecamatan, agama, pekerjaan, perkawinan, kewarganegaraan;
       int NIK, rtrw;
       
      Scanner Input = new Scanner(System.in);
      
      System.out.println(" PROVINSI JAWA TIMUR ");
      System.out.println("  KABUPATEN MALANG ");
      System.out.print(" NIK : ");
      NIK = Input.nextInt();
      System.out.print(" Nama : ");
      nama = Input.next();
      System.out.print(" Tempat/Tgl Lahir : ");
      ttl = Input.next();
      System.out.print(" Jenis Kelamin : " );
      kelamin = Input.next();
      System.out.print(" Gol. Darah : " );
      darah = Input.next();
      System.out.print(" Alamat :  ");
      alamat = Input.next();
         System.out.print(" RT/RW :  ");
      rtrw = Input.nextInt();
      System.out.print(" Kel/Desa :  ");
      kelurahan= Input.next();
      System.out.print(" Kecamatan :  ");
      alamat = Input.next();
      System.out.print(" Agama :  ");
      agama = Input.next();
      System.out.print(" Status Perkawinan :  ");
      perkawinan = Input.next();
      System.out.print(" Kewarganegaraan :  ");
      kewarganegaraan = Input.next();
       
       
       
    }
    
}
