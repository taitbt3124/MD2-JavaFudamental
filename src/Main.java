import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        B1: Khai báo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
//        B2: Thông báo nhập
        System.out.print("Nhập bán kính case 1: ");
        float radios_1 = scanner.nextFloat();
        float acreage = (radios_1 * radios_1) * 3.14f ;

        System.out.print("Nhập bán kính case 2: ");
        float radios_2 = scanner.nextFloat();
        float acreage2 = (radios_2 * radios_1) * 3.14f ;

        System.out.print("Nhập bán kính case 3: ");
        float radios_3 = scanner.nextFloat();
        float acreage3 = (radios_3 * radios_3) * 3.14f ;

        System.out.print("Nhập bán kính case 4: ");
        float radios_4 = scanner.nextFloat();
        float acreage4 = (radios_4 * radios_4) * 3.14f ;

        System.out.print("Nhập bán kính case 5: ");
        float radios_5 = scanner.nextFloat();
        float acreage5 = (radios_5 * radios_5) * 3.14f ;



        System.out.printf(" Diện tích là: %.2f", acreage);
        System.out.printf("%n Diện tích là: %.2f", acreage2);
        System.out.printf("%n Diện tích là: %.2f", acreage3);
        System.out.printf("%n Diện tích là: %.2f", acreage4);
        System.out.printf("%n Diện tích là: %.2f", acreage5);





    }
}