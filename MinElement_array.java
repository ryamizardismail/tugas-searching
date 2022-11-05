/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;

/**
 *
 * @author Iis
 */
public class MinElement_array {
    public static void main(String[] args){
        int[]arr = new int [] {44,23,55,76,21,100};
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Bilangan terkecil adalah = "+min);
    }
}
