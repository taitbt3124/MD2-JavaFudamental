package module_2;

import java.util.Arrays;
import java.util.Scanner;

public class Expert_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sô nguyên dương: ");
        int n = sc.nextInt();
        if (n <=0){
            System.out.println("Số nhập vào không hợp lệ!!!");
        }
        else {
            int sum = 0;
            String str = String.valueOf(n);
            String[] parts = str.split("");
//            System.out.println(Arrays.toString(parts));
            System.out.println(parts[0]);
            System.out.println(parts.length);

            for (int i = 1; i < parts.length; i++) {
                
            }
        }
    }
}