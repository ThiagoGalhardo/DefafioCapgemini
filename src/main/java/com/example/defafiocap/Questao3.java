package com.example.defafiocap;

import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        String frase = "Nada se cria onde tudo se copia";

        String fraseUnida = frase.replace(" ", "").toLowerCase();
        String []fraseUnidaArray = fraseUnida.split("(?!^)");
        System.out.println(Arrays.toString(fraseUnidaArray));
        int totalLetras = frase.replace(" ","").length();

        System.out.println(totalLetras);//teste

        double raiz = Math.sqrt(totalLetras);
        int grid = (int) Math.round(raiz);
        System.out.println(grid);
        grid = grid - 1;

        String [][]matrizCripto = new String[grid][grid];

        matrizCripto[0][0] = fraseUnidaArray[0];
        System.out.println(matrizCripto[0][0]);

    }
}