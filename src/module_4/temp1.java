package module_4;

import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng điểm: ");
        int number = sc.nextInt();
        int[] scores = new int[number];
        float avg = 0;
        do{
            System.out.print("\nNhập chức năng menu: ");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("1. Nhập danh sách điểm sinh viên");
                    for ( int i = 0; i < scores.length; i++){
                        System.out.printf("Nhập điểm vị trí %d: ",i +1);
                        scores[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("2. In danh sách điểm");
                    for ( int i = 0; i < scores.length; i++){
                        System.out.printf(" | %d | ",scores[i]);
                    }
                    break;
                case 3:
                    for ( int i = 0; i < scores.length; i++){
                        avg = avg + scores[i];
                    }
                    avg = avg / number;
                    System.out.printf("Trung binh điểm là: %.2f",avg);
                    break;
                case 4:
                    System.out.println("4. Tìm điểm cao và thấp nhất");
                    for (int i = 0; i < scores.length - 1; i++) {
                        for (int j = i + 1; j < scores.length; j++) {
                            if (scores[i] > scores[j]) {
                                //Đổi chỗ 2 phần tử i và j
                                int temp = scores[i];
                                scores[i] = scores[j];
                                scores[j] = temp;
                            }
                        }
                    }
                    System.out.printf("MIN: %d | MAX: %d", scores[0], scores[number -1]);
                    break;
                case 5:
                    System.out.println("5. Đếm SL đạt và trượt");
                    int fail = 0, pass = 0;
                    for ( int i = 0; i < scores.length; i++){
                        if (scores[i] > 5) {
                            pass ++;
                        }
                        else if (scores[i] <= 5) {
                            fail ++;
                        }
                    }
                    System.out.printf("PASS: %d | FAIL: %d",pass,fail);
                    break;
                case 6:
                    System.out.println("6. Sắp xếp điểm tăng dần");
                    for (int i = 0; i < scores.length - 1; i++) {
                        for (int j = i + 1; j < scores.length; j++) {
                            if (scores[i] > scores[j]) {
                                //Đổi chỗ 2 phần tử i và j
                                int temp = scores[i];
                                scores[i] = scores[j];
                                scores[j] = temp;
                            }
                        }
                    }
                    System.out.println("Điểm sau khi sắp xếp là:");
                    for (int element : scores) {
                        System.out.printf("%d\t", element);
                    }
                    break;
                case 7:
                    System.out.println("5. Đếm SL đạt và trượt");
                    int exelent = 0;
                    for ( int i = 0; i < scores.length; i++){
                        if (scores[i] >= 8) {
                            exelent ++;
                        }

                    }
                    System.out.printf("Giỏi và Xuất sắc: %d",exelent);
                    break;
                case 8:
                    System.exit(0);

                default:
                    System.out.println("Chọn lại");
            }
        }while(true);

    }
}
