package module_3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String cusName = sc.nextLine();
        System.out.print("Product Name : ");
        String productName = sc.nextLine();
        System.out.print("Product Price : ");
        float productPrice = sc.nextFloat();
        System.out.print("Value Buy : ");
        int valueBuy = sc.nextInt();
        System.out.print("Is Member : ");
        boolean isMember = sc.nextBoolean();
        float total = 0;

//        System.out.printf("%s | %s | %f | %d", cusName, productName_phone, productPrice, valueBuy);
        float price = productPrice * valueBuy;
        if (isMember) {
            price = price - (0.1f * price);
        }
        float vat = price* 0.08f;

        total = price + vat;

        System.out.printf("Khách hàng: %s",cusName);
        System.out.printf("Sản phẩm: %s",productName);
        System.out.printf("Giá: %.2f",productPrice);
        System.out.printf("Số lượng: %2f",productPrice);
        System.out.printf("Thành tiền: %s",cusName);
        System.out.printf("Giảm giá: %s",cusName);
        System.out.printf("Tiền VAT: %s",cusName);
        System.out.printf("Tổng tiền thanh toán: %s",cusName);
    }
}
