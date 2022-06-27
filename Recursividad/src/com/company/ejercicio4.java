package com.company;

public class ejercicio4 {
    public static String invertir(String cadena, int indice){
        String inversa;

        if (indice ==0){
            inversa = String.valueOf(cadena.charAt(indice));
        }else{
            inversa = String.valueOf(cadena.charAt(indice)) + invertir(cadena, indice-1);
        }
        return inversa;

    }
    public static String invertir(String cadena){
        return invertir(cadena, cadena.length() -1);
    }
}
