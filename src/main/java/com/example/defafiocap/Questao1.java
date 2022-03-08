package com.example.defafiocap;

import java.util.Arrays;

public class Questao1 {

    public static void main(String[] args) {


        int[] arr = {9, 2, 1, 4, 6};
        Arrays.sort(arr);

        int mediana = (int) Math.floor((arr.length / 2));
        int result = arr[mediana];

        System.out.println(result);
    }
}
