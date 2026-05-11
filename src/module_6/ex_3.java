package module_6;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] plates = new String[0];
        int choice;

        do {
            System.out.println("\n******************** QUẢN LÝ BIỂN SỐ XE ********************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng biển số muốn thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    plates = new String[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập biển số thứ " + (i + 1) + " (VD: 30F-123.45): ");
                        plates[i] = scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Danh sách biển số:");
                    for (String p : plates) System.out.println(p);
                    break;
                case 3:
                    System.out.print("Nhập biển số chính xác cần tìm: ");
                    String searchPlate = scanner.nextLine();
                    boolean found = false;
                    for (String p : plates) {
                        if (p.equalsIgnoreCase(searchPlate)) {
                            System.out.println("Tìm thấy biển số: " + p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Không tìm thấy!");
                    break;
                case 4:
                    System.out.print("Nhập mã tỉnh cần tìm (VD: 29, 30): ");
                    String provinceCode = scanner.nextLine();
                    System.out.println("Các biển số thuộc mã tỉnh " + provinceCode + ":");
                    for (String p : plates) {
                        if (p.startsWith(provinceCode)) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < plates.length - 1; i++) {
                        for (int j = i + 1; j < plates.length; j++) {
                            if (plates[i].compareTo(plates[j]) > 0) {
                                String temp = plates[i];
                                plates[i] = plates[j];
                                plates[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp danh sách tăng dần.");
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
