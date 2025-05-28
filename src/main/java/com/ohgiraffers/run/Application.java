package com.ohgiraffers.run;

import com.ohgiraffers.substraction.Substraction;
import com.ohgiraffers.multiply.Multiply;
import com.ohgiraffers.sum.Sum;
import com.ohgiraffers.mod.Mod;
import com.ohgiraffers.division.Division;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
      
        Sum sum = new Sum();
        Substraction substraction = new Substraction();
        Multiply multiply = new Multiply();
        Mod mod = new Mod();
        Division division = new Division();

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 덧셈");
        System.out.println("2. 뺄셈");
        System.out.println("3. 곱셈");
        System.out.println("4. 나눗셈");
        System.out.println("5. 나머지 구하기");
        System.out.print("메뉴를 선택해주세요: ");

        int no = sc.nextInt();

        switch (no) {
            case 1:
                System.out.println("더할 첫 번째 숫자를 입력해주세요.");
                int sumNum1 = sc.nextInt();
                System.out.println("더할 두 번째 숫자를 입력해주세요.");
                int sunNum2 = sc.nextInt();

                System.out.println(sumNum1 + "+" + sunNum2 + "=" + sum.calculateSum(sumNum1,sunNum2));

            case 2:

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int substractionNum1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int substractionNum2 = sc.nextInt();

                System.out.println("뺄셈 결과 : " + (substraction.calculateSubstraction(substractionNum1, substractionNum2)));

            case 3:
                System.out.print("첫 번째 정수 입력: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 정수 입력: ");
                sc.nextLine();
                int num2 = sc.nextInt();

                System.out.println("곱셈 결과: " + (multiply.calculateMultiply(num1, num2)));
            case 4:
                System.out.println("첫번째 숫자 입력하세요 : ");
                int divNum1 = sc.nextInt();
                System.out.println("두번째 숫자 입력하세요 : ");
                int divNum2 = sc.nextInt();

                System.out.println(division.calculateDivision(divNum1,divNum2));
            case 5:
                System.out.println("나누어지는 수를 입력하세요 : ");
                int dividend = sc.nextInt();
                System.out.println("나누는 수를 입력하세요 : ");
                int divisor = sc.nextInt();

                int modeResult = mod.caculateMod(dividend, divisor);
                System.out.println(modeResult);
            default:
        }
    }
}
