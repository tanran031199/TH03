package TH.TH02;

public class InterestRate {
    double money;
    int month;
    InterestRate(double m, int mo) {
        money = m;
        month = mo;
    }

    public void getInterest() {
        double percent = 8/100.0;

        double interest = money * percent * month;
        System.out.println("Số tiền lãi là: " + interest + "$");
    }
}
