package com.TCSNQT;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n&(n-1);
        if(n==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not power of 2");
        }
    }
}
