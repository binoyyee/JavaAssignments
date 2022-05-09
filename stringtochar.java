package com.company;

import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //String to char
        // Using charAt() method
        String str = "Hello";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println("Character at "+i+" Position: "+ch);
        }
    }
}
