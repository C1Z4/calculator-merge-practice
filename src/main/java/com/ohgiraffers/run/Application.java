package com.ohgiraffers.run;

import com.ohgiraffers.multiply.Multiply;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Multiply multiply = new Multiply();

        System.out.print("첫 번째 정수 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        sc.nextLine();
        int num2 = sc.nextInt();

        System.out.println("곱셈 결과: " + (multiply.calculateMultiply(num1, num2)));

    }
}
