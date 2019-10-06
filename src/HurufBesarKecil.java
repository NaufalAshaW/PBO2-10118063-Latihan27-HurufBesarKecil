/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class HurufBesarKecil {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          
          System.out.print("Masukkan Kalimat : ");
          String kalimat = scanner.nextLine();
          
          System.out.println("=====Hasil Formatting=====");
          System.out.println("Huruf Besar : " +kalimat.toUpperCase());
          System.out.println("Huruf Kecil : " +kalimat.toLowerCase()); 
    }
}
