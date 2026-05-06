package module_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total_student;
        int sum_score = 0;
        int score = 0;
        int number_of_students = 0;
        ArrayList list = new ArrayList();
        do{

            System.out.println("********************** MENU NHẬP ĐIỂM **********************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("1. Nhập điểm học viên");

                    while (true){

                            System.out.print("Nhập điểm học sinh: ");
                            score =  sc.nextInt();

                            if(score == -1){
                                int minValue = (int) Collections.min(list);
                                int maxValue = (int) Collections.max(list);
                                System.out.print("\n ************************************* \n");
                                System.out.printf("Tổng sô điểm : %d \n", sum_score);
                                System.out.printf("Tổng người : %d \n", number_of_students);
                                System.out.printf("MIN : %d | MAX: %d\n",minValue,maxValue);
                                System.out.println("Thoát quá trình nhập");
                                System.out.print("\n ************************************* \n");

                                break;
                            } else if (score > 10 || score < 0) {
                                System.out.println("Nhập sai, nhập lại!!!");
                            }
                            else {
                                list.add(score);

                                sum_score += score;
                                number_of_students ++;
                                if(score < 5 ) {
                                    System.out.println("Yếu");
                                }
                                else if (score < 7 ) {
                                    System.out.println("Trung Bình");
                                }
                                else if (score < 8 ) {
                                    System.out.println("Khá");
                                }
                                else if (score < 9 ) {
                                    System.out.println("Giỏi");
                                }
                                else{
                                    System.out.println("Xuất sắc");
                                }
                            }


                    }

                    break;
                case 2:
                    if(list.isEmpty()){
                        System.out.println("Chưa có dữ liệu");
                    }
                    else {
                        int minValue = (int) Collections.min(list);
                        int maxValue = (int) Collections.max(list);
                        System.out.print("\n ************************************* \n");
                        System.out.println("Hiển thị thống kê");
                        System.out.println("Danh sách điểm: " + list);
                        System.out.printf("Tổng sô điểm : %d \n", sum_score);
                        System.out.printf("Tổng người : %d \n", number_of_students);
                        System.out.printf("MIN : %d | MAX: %d\n",minValue,maxValue);
                        System.out.println("Thoát quá trình nhập");
                        System.out.print("\n ************************************* \n");
                    }


                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa cnọn không hợp lệ!!!");
                    break;
            }
        } while (n != 3);
    }
}
