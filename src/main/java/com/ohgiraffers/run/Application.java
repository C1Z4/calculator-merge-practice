package com.ohgiraffers.run;

import com.ohgiraffers.mod.Mod;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mod mod = new Mod();

        System.out.println("나누어지는 수를 입력하세요 : ");
        int dividend = sc.nextInt();
        System.out.println("나누는 수를 입력하세요 : ");
        int divisor = sc.nextInt();

        int modeResult = mod.caculateMod(dividend, divisor);
        System.out.println(modeResult);
    }
}
