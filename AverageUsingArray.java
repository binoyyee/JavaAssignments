package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Find average using arrays
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

                double average = total / arr.length;
                System.out.format("The average is: %.3f", average); /* %.3f used to display the formatted output after decimal point */
            }
        }
