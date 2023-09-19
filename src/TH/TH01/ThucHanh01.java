package TH.TH01;

import java.util.Scanner;

public class ThucHanh01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số cần kiểm tra: ");
        double number = sc.nextDouble();

        if(number < 2) {
            System.out.println(number + " không phải là số nguyên tố!");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                System.out.println(Math.round(number) + " không phải là số nguyên tố!");
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(Math.round(number) + " là số nguyên tố!");
        }
    }
}
