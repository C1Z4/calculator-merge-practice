package com.ohgiraffers.run;

import com.ohgiraffers.sum.Sum;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Sum sum = new Sum();

        Scanner sc = new Scanner(System.in);

        System.out.println("더할 첫 번째 숫자를 입력해주세요.");
        int sumNum1 = sc.nextInt();
        System.out.println("더할 두 번째 숫자를 입력해주세요.");
        int sunNum2 = sc.nextInt();

        System.out.println(sumNum1 + "+" + sunNum2 + "=" + sum.calculateSum(sumNum1,sunNum2));
    }
}
