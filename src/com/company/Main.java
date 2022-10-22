package com.company;

public class Main {

    public static void main(String[] args) {

    }// main method

    /*Recursion using Factorial*/
    //*************************
    // n! = n * (n - 1)!
    public static int recursiveFactorial(int num){

        if(num == 0)
            return 1;

        return num * recursiveFactorial(num -1);
    }

    // Iterative Factorial
    //********************
    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i<=num; i++){
            factorial *=i;
        }
        return factorial;
    }


}//main class
