package module_1;

import java.util.Scanner;

public class xuatsac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vận tốc (Km/h) và giờ (h): ");
        float v = sc.nextFloat();
        float t = sc.nextFloat();
//        System.out.printf("%.2f %.2f",v,t);
        float s =v*t;

        if (v < 0 || t < 0){
            System.out.println("Vận tốc và thời gian phải lớn hơn ");
            return;
        }
        else {
            System.out.printf("Quãng đường là: %.2f",s);
        }


    }
}
