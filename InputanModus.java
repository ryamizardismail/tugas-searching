/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;

import java.util.Scanner;

/**
 *
 * @author Iis
 */
public class InputanModus {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Inputkan jumlah data");
    int n=sc.nextInt(),c;
    int [] a=new int[n];
    int [] b=new int[n];
    System.out.println("Masukkan "+n+" data");
    double sum=0;
    for(int i=0;i<n;i++) {
        a[i]=sc.nextInt();
    }
    {
    for(int i=0;i<n;i++) {
    c=1;
    if(a[i]==-1)
       b[i]=0;
    else {
    for(int j=i+1;j<n;j++) {
        if(a[i]==a[j]) {
        c++;
        a[j]=-1;
        }
    }
    b[i]=c;
    }
    }
    int m=b[0];
    for(int i=1;i<n;i++) {
        if(b[i]>=m)
        m=b[i];
    }
    
    System.out.println("modus:");
    for(int i=0;i<n;i++) {
        if(b[i]==m)
        System.out.println(a[i]);

    }
    }
    }
}
