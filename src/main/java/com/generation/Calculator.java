package com.generation;

public class Calculator {

    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public int subtractNumbers(int num1, int num2){
        return num1 - num2;
    }

    public int divideNumbers(int num1, int num2){
        if (num2==0){
            System.out.println("Error division por zero");
            return 0;
        }else{
            return num1/num2;
        }
    }

    public int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }

}
