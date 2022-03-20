package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        String s = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива и длину интервала");

        String input1 = scanner.nextLine();
        String[] words = input1.split(" ");
        n = Integer.parseInt(words[0]);
        m = Integer.parseInt(words[1]);
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
            //System.out.println(arr[i - 1]);
        }

        int k = 0;
        int t = 0;

        ArrayList<Integer> way = new ArrayList<>();
        way.add(arr[0]);
       

        while (k != 1) {
            t = t + m-1;
            if (t > n-1) {
                t = t - n;
            };
            if (arr[t] == 1) {
                k = 1;
                break;
            };


            way.add(arr[t]);
        }

        for (int arrA : way) {
        System.out.print(arrA);
        }
    }
}
