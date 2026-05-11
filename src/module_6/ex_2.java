package module_6;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = "", email = "", phone = "", password = "";
        int choice;

        do {
            System.out.println("\n******************** QUẢN LÝ NGƯỜI DÙNG ********************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ và tên: ");
                    fullName = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    email = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    phone = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    password = scanner.nextLine();
                    break;
                case 2:
                    if (fullName.isEmpty()) break;
                    String[] words = fullName.trim().toLowerCase().split("\\s+");
                    StringBuilder sb = new StringBuilder();
                    for (String w : words) {
                        sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
                    }
                    fullName = sb.toString().trim();
                    System.out.println("Họ tên sau chuẩn hóa: " + fullName);
                    break;
                case 3:
                    String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
                    System.out.println(email.matches(emailRegex) ? "Email hợp lệ" : "Email không hợp lệ");
                    break;
                case 4:
                    String phoneRegex = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
                    System.out.println(phone.matches(phoneRegex) ? "Số điện thoại hợp lệ" : "Số điện thoại không hợp lệ");
                    break;
                case 5:
                    String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!^&*])[A-Za-z\\d@#$%!^&*]{8,}$";
                    System.out.println(password.matches(passRegex) ? "Mật khẩu hợp lệ" : "Mật khẩu không hợp lệ");
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }
}
