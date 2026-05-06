package module_4;

import java.util.Scanner;

public class proficient_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập gíá trị mảng tại vị trí số %d: ", i+1);
            numbers[i] = sc.nextInt();
        }

//        Bubble sort: sắp xếp nổi bọt
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
