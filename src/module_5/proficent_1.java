package module_5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class proficent_1 {
    public static void main(String[] args) {
        do {
            System.out.println("Nhập Mail: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String mail = input.trim();
            String regex = "[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}";
            if (mail.matches(regex)) {
                System.out.println("Email hợp lệ");
                System.exit(0);
            }
            else {
                System.err.println("Email không hợp lệ");
            }
        }while (true);


    }
}
