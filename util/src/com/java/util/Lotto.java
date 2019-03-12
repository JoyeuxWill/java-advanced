package com.java.util;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <= 3; i++) {
            int[] before = new int[4];
            int[] after = new int[2];
            for (int j = 0; j < 4; j++) {
                before[j] = random.nextInt(35) + 1;
                for (int k = 0; k < j; k++) {
                    if (before[k] == before[j]) {
                        j--;
                        break;
                    }
                }
            }
            for (int j = 0; j < 2; j++) {
                after[j] = random.nextInt(12) + 1;
                for (int k = 0; k < j; k++) {
                    if (after[k] == after[j]) {
                        j--;
                        break;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(before[j] + "  ");
            }
            System.out.print("  ");
            for (int j = 0; j < 2; j++) {
                System.out.print(after[j] + "  ");
            }
            System.out.println();
        }
    }
}