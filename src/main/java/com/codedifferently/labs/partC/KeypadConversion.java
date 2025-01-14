package com.codedifferently.labs.partC;

import java.util.Scanner;

public class KeypadConversion {
    public static void main(String[] args) {
        String[] keys = {
                "",
                "",
                "ABC",
                "DEF",
                "GHI",
                "JKL",
                "MNO",
                "PQRS",
                "TUV",
                "WXYZ",
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of keys: ");
        String message = scanner.nextLine().toUpperCase();

        StringBuilder keyCode = new StringBuilder();
        for (char c : message.toCharArray()) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i].indexOf(c) != -1) {
                    int keyPressCount = keys[i].indexOf(c) + 1;
                    keyCode.append(String.valueOf(i).repeat(keyPressCount));
                }
            }
        }
        System.out.println("Result: " + keyCode);
        scanner.close();
    }
}
