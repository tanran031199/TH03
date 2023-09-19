package TH.TH03;

import java.util.Scanner;

public class ThucHanh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tìm ước chung lớn nhất của a và b:");

        System.out.println("Nhập a:");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();

        new Greatest(a, b).getGreatest();
    }
}
