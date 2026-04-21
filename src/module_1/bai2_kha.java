package module_1;

import java.util.Scanner;

public class bai2_kha {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int firstNumber = scanner.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int minus = firstNumber - secondNumber;
        int tich = firstNumber * secondNumber;
        int thuong = firstNumber / secondNumber;
        int du =  firstNumber % secondNumber;

        System.out.println("--- Kết quả ---");
        System.out.printf("firstNumber = %d\n", firstNumber);
        System.out.printf("secondNumber = %d\n", secondNumber);
        System.out.printf("Tổng = %d\n", sum);
        System.out.printf("Hiệu = %d\n", minus);
        System.out.printf("Tích = %d\n", tich);
        System.out.printf("Thương = %d\n", thuong);
        System.out.printf("Phần dư = %d\n", du);


    }
}
