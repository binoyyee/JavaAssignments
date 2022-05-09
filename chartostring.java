package com.company;

import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Char to string
        // Method 1: Using toString() method
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: "+str);

        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("String is: "+str2);
    }
}
