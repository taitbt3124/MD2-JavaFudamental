package module_2;

import java.util.Scanner;

public class Advanced_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhập giá trị 3 cạnh: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ( a + b <= c || b + c <= a || a + c <= b ||a <= 0|| b <= 0 || c <= 0){
                System.out.println("Ba cạnh không tạo thành tam giác");

            }
            else{
                if(a == b && b == c){
                    System.out.println("Tam giác đều");

                }
                else if(a == b || b == c || c == a){
                    System.out.println("Tam giác cân");

                }
                else if(a*a == (b*b) + (c+c) || b*b == (a*a)+(c+c) || c*c == (b*b)+(a*a)){
                    System.out.println("Tam giác vuông");

                }
                else{
                    System.out.println("Tam giác thường");

                }
            }
        }while (true);

    }
}
