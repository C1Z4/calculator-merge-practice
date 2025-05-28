package com.ohgiraffers.run;

import com.ohgiraffers.division.Division;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.println("첫번째 숫자 입력하세요 : ");
        num1 = sc.nextDouble();

        System.out.println("두번째 숫자 입력하세요 : ");
        num2 = sc.nextDouble();

        Division division = new Division();
        System.out.println(division.div(num1,num2));

        }

}
