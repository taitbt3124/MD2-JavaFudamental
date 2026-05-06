package module_5;

import java.util.Scanner;

public class inclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = "";
        String phone = "";
        String email = "";
        String password = "";
        do {
            System.out.println("******************************** ");
            System.out.println("1. Nhập thông tin: ");
            System.out.println("2. Chuẩn hóa họ tên ");
            System.out.print("Nhập lựa chọn: n ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Họ và tên");
                    fullName = sc.nextLine();
                    break;
                case 2:
//                    1. Bỏ khoảng trắng 2 đầu, Thay thế khoảng trắng liên tiép
//                    bằng 1 khoangr trắng
                    String fullNameStrim = fullName.trim().replaceAll("\\s+"," ");
//                    2. Dùng Split để cắt thnahf các từ
                    String[] arrStr = fullNameStrim.split(" ");
//                    3. Duyệt từng phần tử và chuânr hóa => nối chuỗi chuẩn hóa
                    StringBuilder fullNameStan = new StringBuilder("");
                    for (String element : arrStr) {
                        fullNameStan.append(Character.toUpperCase(element.charAt(0)))
                                .append(element.substring(1).toLowerCase()).append(" ");
                    }




                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại!!!");
            }

        }while (true);
    }
}
