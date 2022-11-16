package com.ulianov;

public class Main {

    public static void outOfMemory(){
        int[] array = {0, 1, 2, 3, 4};
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void combinationsDataTypes(){
        double numDoub = 123.456;
        int numInt = 100;
        numDoub = numDoub + numInt;
        numInt = (int)(numDoub);
        System.out.println(numInt);
    }

    public static void main(String[] args) {
        outOfMemory();
        combinationsDataTypes();
    }
}