package bai1;

import java.util.Scanner;

public class IsPrime {

	private static Scanner input;
	
	 public static void main(String[] args) {
	        input = new Scanner(System.in);
	        System.out.print("Nhập một số nguyên dương: ");
	        int num = input.nextInt();

	        boolean isPrime = true;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime && num > 1) {
	            System.out.println(num + " là số nguyên tố");
	        } else {
	            System.out.println(num + " không phải là số nguyên tố");
	        }
	    }
}
