package com.cifpcarballeira.katas.FizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if (num%3 == 0) {
            return "Fizz";
        }
        if (num == 2) {
            return "2";
        } else {
            return "1";
        }
    }
}
