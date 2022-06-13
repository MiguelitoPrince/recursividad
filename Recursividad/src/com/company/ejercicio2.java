package com.company;

public class ejercicio2 {
    public static int mcd(int n, int m){

        if(n ==0 || m==0){
            return 0;
        }
        if (n==m){
            return n;
        }
        if(n>m){
            return mcd(n-m, m);
        }
        else{
            return mcd(n, m-n);
        }

    }
}
