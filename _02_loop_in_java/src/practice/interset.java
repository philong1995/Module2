package practice;

import java.util.Scanner;

//    Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi

public class interset {

    public static void main(String[] args) {
        double money ;
        int month ;
        double interset_rate ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of months: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();

        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * (interset_rate / 100) / 12 * month;
            System.out.println("Total of interset: " + total_interset);
        }
    }
}
