/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;

/**
 *
 * @author Iis
 */
public class MinMaxExample {
    //Method mendapatkan nilai Max
   public static int getMax(int[] inputArray){
       int max = inputArray[0];
       for(int i=1; i<inputArray.length; i++){
           if(inputArray[i]>max){
           max = inputArray[i];
       }   
       }
       return max;
   }
   
   //Method mendapatkan nilai Min
   public static int getMin(int[] inputArray){
       int min = inputArray[0];
       for(int i=1; i<inputArray.length; i++){
           if(inputArray[i]<min){
               min = inputArray[i];
           }
       }
       return min;
   }
   
   //Memanggil fungsi Min dan Max
    public static void main(String[] args){
        int arr[] = new int []{44,23,55,76,21,100};
        
        int max = getMax(arr);
        System.out.println("Bilangan terbesar adalah = "+max);
        int min = getMin(arr);
        System.out.println("Bilangan terkecil adalah = "+min);
    }
}
