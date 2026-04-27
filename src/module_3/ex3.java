package module_3;

public class ex3 {
    public static void main(String[] args) {
        import java.util.Scanner;

        public class EmployeeSalaryManagement {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int count = 0;
                double totalSalary = 0;
                double totalBonus = 0;
                double maxSalary = -1;
                double minSalary = Double.MAX_VALUE;
                int choice;

                do {
                    System.out.println("\n========== MENU ==========");
                    System.out.println("1. Nhập lương nhân viên");
                    System.out.println("2. Hiển thị thống kê");
                    System.out.println("3. Tính tổng tiền thưởng nhân viên");
                    System.out.println("4. Thoát");
                    System.out.print("Lựa chọn của bạn: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("--- Nhập lương nhân viên (nhập -1 để kết thúc)");
                            while (true) {
                                System.out.print("Nhập lương: ");
                                double salary = sc.nextDouble();

                                if (salary == -1) break; [cite: 100, 144]

                                if (salary < 0 || salary > 500000000) { [cite: 101, 138]
                                    System.out.println("Lương không hợp lệ. Nhập lại.");
                                    continue;
                                }

                                // Phân loại thu nhập [cite: 102, 103, 104, 105, 106]
                                String type;
                                double bonusPercent;
                                if (salary < 5000000) {
                                    type = "Thu nhập thấp";
                                    bonusPercent = 0.05;
                                } else if (salary < 15000000) {
                                    type = "Thu nhập trung bình";
                                    bonusPercent = 0.10;
                                } else if (salary < 50000000) {
                                    type = "Thu nhập khá";
                                    bonusPercent = 0.15;
                                } else if (salary < 100000000) {
                                    type = "Thu nhập cao";
                                    bonusPercent = 0.20;
                                } else {
                                    type = "Thu nhập cao";
                                    bonusPercent = 0.25;
                                }

                                System.out.println("→ Phân loại: " + type);

                                // Thống kê lương [cite: 107, 108, 109, 110, 111]
                                count++;
                                totalSalary += salary;
                                totalBonus += (salary * bonusPercent); [cite: 121, 122]
                                if (salary > maxSalary) maxSalary = salary;
                                if (salary < minSalary) minSalary = salary;
                            }
                            break;
                        case 2:
                            if (count == 0) { [cite: 113]
                                System.out.println("Chưa có dữ liệu");
                            } else { [cite: 114, 151, 152, 153, 154, 155]
                                System.out.println("Thống kê");
                                System.out.println("Số nhân viên: " + count);
                                System.out.printf("Tổng lương: %,.0f VND\n", totalSalary);
                                System.out.printf("Lương trung bình: %,.0f VND\n", (totalSalary / count));
                                System.out.printf("Lương cao nhất: %,.0f VND\n", maxSalary);
                                System.out.printf("Lương thấp nhất: %,.0f VND\n", minSalary);
                            }
                            break;
                        case 3:
                            if (count == 0) {
                                System.out.println("Chưa có dữ liệu để tính thưởng");
                            } else { [cite: 164, 165]
                                System.out.println("Tính tổng số tiền thưởng nhân viên");
                                System.out.printf("Tổng tiền thưởng nhân viên: %,.0f VND\n", totalBonus);
                            }
                            break;
                        case 4:
                            System.out.println("Kết thúc chương trình."); [cite: 125, 172]
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                    }
                } while (choice != 4);
            }
        }
    }
}
