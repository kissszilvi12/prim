/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author szkis
 */
public class Main {   
    public static void main(String[] args) throws IOException{        
        int count = 1;        //2 is added
        //Read n from console 
        System.out.println("Szam: "); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        //vg
        //calculate
        if(n < 2) count--;        //2 is removed
        for(int i= 3; i < n; i=i+2){
            count+=isPrime(i, 2);
            System.out.println(i + ": " + isPrime(i, 2));
        }
        System.out.println("Eredmény: " + count);      //write result to console
    }
    
    public static int isPrime(int n, int i){
        if(i * i > n) return 1;
        if(n % i == 0) return 0;
        return isPrime(n, i+1);        
    }  
}