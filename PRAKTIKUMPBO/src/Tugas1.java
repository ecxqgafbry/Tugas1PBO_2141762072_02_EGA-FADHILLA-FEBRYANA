/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public class Tugas1 {
    public static void main(String[]args){
        int []nim = {2, 1, 4, 1, 7, 6, 2, 0, 7, 2};
        int index = 0;
        int i=0;
        do{
            int j = i;
            do{
                System.out.print(" ");
                j++;
            }while(j<nim.length);
            int k=0;
            do{
                System.out.print(nim[index]+" ");
                index++;
                k++;
            }while(k<=i);
            System.out.println();
            i++;
        }while (i <4);
    }
}