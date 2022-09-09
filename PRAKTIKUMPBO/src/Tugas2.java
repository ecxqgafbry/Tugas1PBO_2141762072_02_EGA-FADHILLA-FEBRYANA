/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Tugas2 {
    public static void main(String[] args){
        int jumlah=0;
        int []nim = {2, 1, 4, 1, 7, 6, 2, 0, 7, 2};
        for(int i=0; i<nim.length; i++){
            jumlah+=nim[i];
        }
        System.out.println("Hasil dari nim diatas adalah "+ jumlah);
  }
}
