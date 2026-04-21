package module_1;

import java.util.Scanner;

public class gioi2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Nhập chiều rộng: ");
//        float width = sc.nextFloat();
//
//        System.out.print("Nhập chiều dài: ");
//        float height = sc.nextFloat();

        System.out.println("Nhập chiều dài và chiều rộng ngăn cách bởi dấu cách");
        float width =  sc.nextFloat();
        float height = sc.nextFloat();

        float area =  width * height;
        float perimeter  = (width + height) *2;

        System.out.printf("%n S= %.2f %n CV = %.2f", area, perimeter);
    }
}
