package module_6;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[0];
        int choice;

        do {
            System.out.println("\n********************QUẢN LÝ ĐIỂM SV********************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = scanner.nextInt();
                    grades = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                        grades[i] = scanner.nextDouble();
                    }
                    break;
                case 2:
                    System.out.print("Danh sách điểm: ");
                    for (double g : grades) System.out.print(g + "  ");
                    System.out.println();
                    break;
                case 3:
                    double sum = 0;
                    for (double g : grades) sum += g;
                    System.out.println("Điểm trung bình: " + (grades.length > 0 ? sum / grades.length : 0));
                    break;
                case 4:
                    if (grades.length == 0) break;
                    double max = grades[0], min = grades[0];
                    for (double g : grades) {
                        if (g > max) max = g;
                        if (g < min) min = g;
                    }
                    System.out.println("Cao nhất: " + max + ", Thấp nhất: " + min);
                    break;
                case 5:
                    int pass = 0, fail = 0;
                    for (double g : grades) {
                        if (g >= 5) pass++;
                        else fail++;
                    }
                    System.out.println("Đạt: " + pass + ", Trượt: " + fail);
                    break;
                case 6:
                    for (int i = 0; i < grades.length - 1; i++) {
                        for (int j = i + 1; j < grades.length; j++) {
                            if (grades[i] > grades[j]) {
                                double temp = grades[i];
                                grades[i] = grades[j];
                                grades[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp tăng dần.");
                    break;
                case 7:
                    int excellent = 0;
                    for (double g : grades) {
                        if (g >= 8) excellent++;
                    }
                    System.out.println("Số lượng SV Giỏi và Xuất sắc (>= 8): " + excellent);
                    break;
                case 8:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 8);
    }
}
