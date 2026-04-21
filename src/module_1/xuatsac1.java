package module_1;

import java.util.Scanner;

public class xuatsac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng và chều cáo cách nhau bởi dấu cách: ");
        float n = sc.nextFloat();
        float c = sc.nextFloat();

        float bmi = n/(c*c);
        System.out.printf("Chỉ số BMI = %.2f",bmi);

    }

}
