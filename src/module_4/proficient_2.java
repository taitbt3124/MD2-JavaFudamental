package module_4;

import java.util.Scanner;

public class proficient_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];


        System.out.println("--- Nhập các giá trị cho mảng ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử tại [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }


        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Kiểm tra điều kiện chẵn/lẻ
                if (matrix[i][j] % 2 == 0) {
                    sumEven += matrix[i][j];
                } else {
                    sumOdd += matrix[i][j];
                }
            }
        }

        System.out.println("\n--- Kết quả ---");
        System.out.println("Tổng các số chẵn: " + sumEven);
        System.out.println("Tổng các số lẻ: " + sumOdd);

        sc.close();
    }
}
