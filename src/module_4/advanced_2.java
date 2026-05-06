package module_4;

import java.util.Scanner;

public class advanced_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Mảng không có phần tử");
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            numbers[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        // Duyệt lần 1: Tìm các số chẵn
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                result[index] = numbers[i];
                index++;
            }
        }

        // Duyệt lần 2: Tìm các số lẻ
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                result[index] = numbers[i];
                index++;
            }
        }


        System.out.println("\nMảng sau khi sắp xếp (Chẵn trước - Lẻ sau):");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
