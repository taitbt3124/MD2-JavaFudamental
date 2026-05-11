package module_5;

import java.util.Random;
import java.util.Scanner;

public class advanced_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập độ dài n: ");
        int n = scanner.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("Độ dài không hợp lệ.");
        } else {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder result = new StringBuilder(n);

            for (int i = 0; i < n; i++) {
                int index = random.nextInt(characters.length());
                result.append(characters.charAt(index));
            }

            System.out.println("Chuỗi ngẫu nhiên: " + result.toString());
        }
    }
}
