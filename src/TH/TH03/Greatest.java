package TH.TH03;

public class Greatest {
    int a, b;

    Greatest(int inputA, int inputB) {
        a = Math.abs(inputA);
        b = Math.abs(inputB);
    }

    public void getGreatest() {
        if(a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất!!!");
            return;
        }

        while (a != b) {
            if(a > b) {
                a = a - b;
                System.out.println("a = " + a);
            } else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }

        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
