package com.ohgiraffers.mod;

public class Mod {
    public int caculateDivision(int a, int b) {
        int result = 0;
        try {
            result = a % b;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
