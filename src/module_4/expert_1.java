package module_4;

import java.util.Scanner;

public class expert_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng học sinh: ");
        int n = sc.nextInt();
        float[] scores = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập điểm tại vị trí %.0f: ", i + 1f);
            scores[i] = sc.nextFloat();
        }
        do {
            System.out.println(" ");
            System.out.print("\n--- QUẢN LÝ ĐIỂM SINH VIÊN ---");
            System.out.print("\n1. Xem tất cả điểm");
            System.out.print("\n2. Sắp xếp điểm ");
            System.out.print("\n3. Tìm kiếm điểm");
            System.out.print("\n4. Thống kê điểm ");
            System.out.print("\n5. Thoát");
            System.out.print("\nLựa chọn của bạn");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.printf(" | %.2f | ",scores[i]);
                    }
                    break;
                case 2:
//                    Selection Sort: Sắp xếp chọn
                    for (int i = 0; i < scores.length - 1; i++) {
                        int minScore = i;
                        for (int j = i +1; j < scores.length; j++) {
                            if (scores[j] < scores[minScore]) {
                                minScore = j;
                            }
                        }
                        float temp = scores[minScore];
                        scores[minScore] = scores[i];
                        scores[i] = temp;
                    }
                    System.out.println("Mảng đã sắp xếp: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf(" | %.2f | ",scores[i]);
                    }
                    break;
                case 3:
                    System.out.print("\nNhập điểm bạn muốn tìm: ");
                    float target = sc.nextFloat();
                    int left = 0;
                    int right = scores.length - 1;

                    while (left <= right) {
                        int mid = left + (right - left) / 2;
                        if (scores[mid] == target) {
                            System.out.printf("Tìm thấy %.2f tại vị trí %d", target, mid+1);
                            break;
                        }
                        else if (scores[mid] < target) {
                            left = mid + 1;
                        }
                        else if (scores[mid] > target) {
                            right = mid - 1;
                        }
                        else  {
                            System.out.println("Không thấy giá trị");
                        }
                    }
                    break;
                case 4:
                    float sum = 0;
                    int count = 0;
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                    }
                    float avg = sum / scores.length;
                    System.out.printf("\nĐiểm trung bình của lớp là: %.2f",avg);
                    System.out.printf("\nĐiểm thấp nhất là: %.2f",scores[0]);
                    System.out.printf("\nĐiểm cao nhất là: %.2f",scores[scores.length-1]);
                    for (int i = 0; i < scores.length; i++) {
                        if(scores[i] > avg){
                            count++;
                        }
                    }
                    System.out.printf("\nSố lượng học sinh trên điểm trung bình [%.2f] là: %d",avg,count);
                    break;
                case 5:
                    System.exit(0);
                    default:
                        System.out.println("Không hợp lệ, vui lòng nhập lại");
            }
        } while (true);
    }
}
