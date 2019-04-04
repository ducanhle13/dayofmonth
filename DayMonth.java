package week12;

import week1.SystemTime;

import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();

        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = ("28,29");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = ("31");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = ("30");

            default:
                daysInMonth = ("");
        }

        if (daysInMonth != "") System.out.printf("Thang %d co %s ngay!", month, daysInMonth);
        else System.out.print("Nhap sai!");
    }

}


