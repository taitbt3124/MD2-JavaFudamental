package module_2;

import java.util.Scanner;

public class Expert_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\n Nhập số hợp lệ (100-999): ");
            int n = sc.nextInt();
            if (n < 100 || n > 999) {
                System.out.println("Số nhập vào không hợp lệ!!!");
            }
            else{
                int a = n / 100;
                int b = (n-a*100)/10;
                int c = n -a*100-b*10;
                String hundreds = "";
                String tens = "";
                String units = "";

                if (a == 1){
                    hundreds = "Một";
                }
                else if (a == 2){
                    hundreds = "Hai";
                }
                else if (a == 3){
                    hundreds = "Ba";
                }
                else if (a == 4){
                    hundreds = "Bốn";
                }
                else if (a == 5){
                    hundreds = "Năm";
                }
                else if (a == 6){
                    hundreds = "Sáu";
                }
                else if (a == 7){
                    hundreds = "Bảy";
                }
                else if (a == 8){
                    hundreds = "Tám";
                }
                else{
                    hundreds = "Chín";
                }


                if (b == 1 && c ==0){
                    tens = "Mười";
                }
                else if (b == 1 && c > 0){
                    tens = "Mười";
                }
                else if (b == 1){
                    tens = "Một";
                }
                else if (b == 0 && c == 0){
                    tens = "";
                }
                else if (b == 0){
                    tens = "Lẻ";
                }
                else if (b == 2){
                    tens = "Hai mươi";
                }
                else if (b == 3){
                    tens = "Ba mươi";
                }
                else if (b == 4){
                    tens = "Bốn mươi";
                }
                else if (b == 5){
                    tens = "Năm mươi";
                }
                else if (b == 6){
                    tens = "Sáu mươi";
                }
                else if (b == 7){
                    tens = "Bảy mươi";
                }
                else if (b == 8){
                    tens = "Tám mươi";
                }
                else{
                    tens = "Chín mươi";
                }

                if (c == 1){
                    units = "Một";
                }
                else if (c == 0){
                    units = "";
                }
                else if (c == 2){
                    units = "Hai";
                }
                else if (c == 3){
                    units = "Ba";
                }
                else if (c == 4){
                    units = "Bốn";
                }
                else if (c == 5){
                    units = "Năm";
                }
                else if (c == 6){
                    units = "Sáu";
                }
                else if (c == 7){
                    units = "Bảy";
                }
                else if (c == 8){
                    units = "Tám";
                }
                else{
                    units = "Chín";
                }

                System.out.printf("%s trăm %s %s",hundreds,tens,units);

            }
        } while (true);

    }

}
