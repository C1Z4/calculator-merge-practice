package com.ohgiraffers.run;

import com.ohgiraffers.substraction.Substraction;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Substraction substraction = new Substraction();

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int substractionNum1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int substractionNum2 = sc.nextInt();

        System.out.println("뺄셈 결과 : " + (substraction.calculateSubstraction(substractionNum1, substractionNum2)));

    }
    
    
}
