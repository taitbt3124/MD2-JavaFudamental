package module_2;

import java.util.Scanner;

public class Proficient_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày",n);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày",n);
                break;
            default:
                System.out.printf("Tháng %d không hợp lệ",n);
                break;

        }
    }
}
