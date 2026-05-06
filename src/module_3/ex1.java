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
        float sale = 0;

//        System.out.printf("%s | %s | %f | %d", cusName, productName_phone, productPrice, valueBuy);
        float price = productPrice * valueBuy;
        if (isMember) {
            sale = 0.1f * price;
        }
        float vat = price* 0.08f;

        total = price - sale + vat;

        System.out.print("-------------- BILL --------------");
        System.out.printf("\n Khách hàng: %s",cusName);
        System.out.printf("\n Sản phẩm: %s",productName);
        System.out.printf("\n Giá: %.2f",productPrice);
        System.out.printf("\n Số lượng: %d",valueBuy);
        System.out.printf("\n Thành tiền: %s",price);
        System.out.printf("\n Giảm giá: %.2f",sale);
        System.out.printf("\n Tiền VAT: %.2f",vat);
        System.out.printf("\n Tổng tiền thanh toán: %.2f",total);
        System.out.print("\n -------------- END BILL --------------");
        System.out.print("");
    }
}
