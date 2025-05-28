package com.ohgiraffers.mod;

public class Mod {
    public int caculateMod(int a, int b) {
        int result = 0;
        try {
            result = a % b;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
