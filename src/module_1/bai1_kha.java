package module_1;

import java.util.Scanner;

public class bai1_kha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("R1: ");
        float r1 = sc.nextInt();
        float result1 = (r1 * r1) * 3.14f;

        System.out.print("R2: ");
        float r2 = sc.nextInt();
        float result2 = (r2 * r2) * 3.14f;

        System.out.print("R3: ");
        float r3 = sc.nextInt();
        float result3 = (r3 * r3) * 3.14f;

        System.out.print("R4: ");
        float r4 = sc.nextInt();
        float result4 = (r4 * r4) * 3.14f;

        System.out.print("R5: ");
        float r5 = sc.nextInt();
        float result5 = (r5 * r5) * 3.14f;


        System.out.printf("%n Bán kính với r1 (%.2f) là %.2f",r1,result1);
        System.out.printf("%n Bán kính với r2 (%.2f) là %.2f",r2,result2);
        System.out.printf("%n Bán kính với r3 (%.2f) là %.2f",r3,result3);
        System.out.printf("%n Bán kính với r4 (%.2f) là %.2f",r4,result4);
        System.out.printf("%n Bán kính với r5 (%.2f) là %.2f",r5,result5);

    }
}
