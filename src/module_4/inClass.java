package module_4;

import java.util.Scanner;

public class inClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập sô lượng mảng");
//        int n = sc.nextInt();
//        String[] values = new String[n];
//        int chosse;
//        int sum = 0;
//        do{
//            System.out.print("\nChọn đi: \n");
//            chosse = sc.nextInt();
//            switch (chosse) {
//                case 1:
//                    System.out.println("Chức năng nhập giá trị mảng");
//                    for(int i = 0; i < n; i++){
//                        System.out.printf("Nhập giá trị vào mảng thứ %d: ",i);
//                        values[i] = sc.next();
//                    }
//                    break;
//                case 2:
//                    System.out.println("Chức năng tính tổng phần tử");
//                    for(int i = 0; i < n; i++){
//                        sum = sum + Integer.parseInt(values[i]);
//                    }
//                    System.out.printf("Tổng mảng là: %d",sum);
//                    break;
//                case 3:
//                    System.out.println("Chức năng in phần tử lẻ");
//                    for(int i = 0; i < n; i++){
//                        if (Integer.parseInt(values[i]) % 2 != 0){
//                            System.out.printf(" |%d| ",Integer.parseInt(values[i]));
//                        }
//                    }
//                    break;
//                case 4:
//                    System.out.println("Phần tử chia hết cho 3: ");
//                    for(int i = 0; i < 4; i++){
//                        if (Integer.parseInt(values[i]) % 3 == 0){
//                            System.out.printf(" |%d| ",Integer.parseInt(values[i]));
//                        }
//                    }
//                    break;
//                default:
//                    System.out.println("Chọn lại đi");
//                    break;
//            }
//        } while (chosse != 5);
//
//    }

//    *********************************** Mảng 2 chiều ********************************************

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng và cột của mảng 2 chiều: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] numbers = new int[row][col];

        do{
            System.out.println("1. Nhâp vào gía trị các phần tử");
            System.out.println("2. In theo ma trận");
            System.out.println("3. Tính tổng theo biên ");
            System.out.println("4. Thoát ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    for(int i = 0; i < numbers.length; i++){
                        for(int j = 0; j < numbers[i].length; j++){
                            System.out.printf("numbers[%d][%d]",i,j);
                            numbers[i][j] = sc.nextInt();
                        }
                    }

                    break;
                case 2:
                    for(int i = 0; i < numbers.length; i++){
                        for(int j = 0; j < numbers[i].length; j++){
                            System.out.printf("%5d",numbers[i][j]);
                        }
                        System.out.println(" ");
                    }

                    break;
                case 3:

                    break;
                case 4:
                    System.exit(0);
                default:

            }

        }while(true);

    }
}
