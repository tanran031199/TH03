package TH.TH04;

import java.util.Scanner;

public class ThucHanh04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:\n" +
                    "1. Vẽ hình tam giác.\n" +
                    "2. Vẽ hình vuông.\n" +
                    "3. Vễ hình chữ nhật.\n" +
                    "0. Thoát\n");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình tam giác:");
                    System.out.println("******\n" +
                            "*****\n" +
                            "****\n" +
                            "***\n" +
                            "**\n" +
                            "*\n");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông:");
                    System.out.println("* * * * * * \n" +
                            "* * * * * * \n" +
                            "* * * * * * \n" +
                            "* * * * * * \n" +
                            "* * * * * * \n" +
                            "* * * * * * \n");
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật:");
                    System.out.println("* * * * * * \n" +
                            "* * * * * * \n" +
                            "* * * * * * \n");
                    break;
                case 0:
                    System.out.println("Bạn đã thoát chương trình!!!");
                    break;
                default:
                    System.out.printf("Không có lựa chọn %d!!! Mời nhập lại.\n", choice);
                    break;
            }
        } while (choice != 0);
    }
}
