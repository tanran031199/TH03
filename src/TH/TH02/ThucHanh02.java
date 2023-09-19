package TH.TH02;

import java.util.Scanner;

public class ThucHanh02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tính số tiền lãi tỷ lệ 8%");
        System.out.println("Nhập số tiền cho vay:");
        double money = sc.nextDouble();
        System.out.println("Nhập số tháng cho vay:");
        int month = sc.nextInt();

        new InterestRate(money, month).getInterest();
    }
}
