package module_4;

import java.util.Scanner;

public class expert_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        double[] salaries = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập lương nhân viên thứ %d: ", i + 1);
            salaries[i] = sc.nextDouble();
        }

        int choice;
        do {

            System.out.println("\n--- QUẢN LÝ LƯƠNG NHÂN VIÊN ---");
            System.out.println("1. Xem danh sách lương");
            System.out.println("2. Sắp xếp lương");
            System.out.println("3. Tìm kiếm lương cụ thể");
            System.out.println("4. Thống kê lương");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Danh sách lương hiện tại:");
                    for (double s : salaries) System.out.print(s + "  ");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Chọn (1) Tăng dần hoặc (2) Giảm dần: ");
                    int sortType = sc.nextInt();
                    bubbleSort(salaries, sortType == 1);
                    System.out.println("Đã sắp xếp xong. Hãy chọn mục 1 để xem.");
                    break;

                case 3:
                    System.out.print("Nhập mức lương cần tìm: ");
                    double target = sc.nextDouble();
                    int index = linearSearch(salaries, target);
                    if (index != -1) {
                        System.out.println("Tìm thấy tại vị trí index: " + index);
                    } else {
                        System.out.println("Không tìm thấy mức lương này.");
                    }
                    break;

                case 4:
                    thongKe(salaries);
                    break;

                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng phần mềm!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }


    public static void bubbleSort(double[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean condition = ascending ? (arr[j] > arr[j + 1]) : (arr[j] < arr[j + 1]);
                if (condition) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int linearSearch(double[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void thongKe(double[] arr) {
        double sum = 0, max = arr[0], min = arr[0];
        for (double s : arr) {
            sum += s;
            if (s > max) max = s;
            if (s < min) min = s;
        }
        double avg = sum / arr.length;
        int countAboveAvg = 0;
        for (double s : arr) {
            if (s > avg) countAboveAvg++;
        }

        System.out.println("--- Thống kê chi tiết ---");
        System.out.printf("Tổng lương: %.2f\n", sum);
        System.out.printf("Lương trung bình: %.2f\n", avg);
        System.out.printf("Lương cao nhất: %.2f\n", max);
        System.out.printf("Lương thấp nhất: %.2f\n", min);
        System.out.println("Số nhân viên lương trên trung bình: " + countAboveAvg);
    }
}
