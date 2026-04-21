package module_1;

import java.util.Scanner;

public class gioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tử số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập mẫu số b: ");
        int b = sc.nextInt();

        System.out.print("Nhập mẫu số c: ");
        int c = sc.nextInt();

        System.out.print("Nhập mẫu số d: ");
        int d = sc.nextInt();

        int top = (a*d) + (b*c);
        int bot = (b*d);


        System.out.printf("Tổng 2 phân số %d/%d + %d/%d là %d/%d",a,b,c,d,top,bot);

    }
}
