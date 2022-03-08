package com.example.defafiocap;

public class Questao2 {
    public static void main(String[] args) {


        int[] n = {1, 5, 3, 4, 2};

        int x = 2;
        int total = 0;

        for (int i = 0; i < n.length; i++) {
            for(int j = i+1; j < n.length; j++){
                if(n[j] - n[i] == x || n[i] - n[j] == x){
                    System.out.println(n[i] +"-"+ n[j]);
                    total++;
                }
            }
        }

        System.out.println("Valor total dos pares são: " +total);

    }
}






