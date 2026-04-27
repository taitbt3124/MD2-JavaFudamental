package module_3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double totalScore = 0;
        double maxScore = -1;
        double minScore = 11;
        int choice;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập điểm học viên (nhập -1 để dừng)");
                    while (true) {
                        System.out.print("Nhập điểm: ");
                        double score = sc.nextDouble();

                        if (score == -1) break; [cite: 26, 57]

                        if (score < 0 || score > 10) { [cite: 27, 52]
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                            continue;
                        }

                        // Xếp loại học lực [cite: 28, 54]
                        String rank;
                        if (score < 5) rank = "Yếu";
                        else if (score < 7) rank = "Trung Bình";
                        else if (score < 8) rank = "Khá";
                        else if (score < 9) rank = "Giỏi";
                        else rank = "Xuất sắc";

                        System.out.println("Học lực: " + rank);

                        // Thống kê [cite: 29, 30, 31, 32, 33]
                        count++;
                        totalScore += score;
                        if (score > maxScore) maxScore = score;
                        if (score < minScore) minScore = score;
                    }
                    break;
                case 2:
                    if (count == 0) { [cite: 35]
                        System.out.println("Chưa có dữ liệu");
                    } else { [cite: 36, 65, 66]
                        System.out.println("KẾT QUẢ");
                        System.out.println("Số học viên đã nhập: " + count);
                        System.out.printf("Điểm trung bình: %.2f\n", (totalScore / count));
                        System.out.printf("Điểm cao nhất: %.2f\n", maxScore);
                        System.out.printf("Điểm thấp nhất: %.2f\n", minScore);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình."); [cite: 42, 70]
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 3);
    }
}
