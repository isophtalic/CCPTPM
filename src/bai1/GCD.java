package bai1;

import java.util.Scanner;

public class GCD {
	private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = input.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("Ước số chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
    

}
