package module_2;

import java.util.Scanner;

public class Advanced_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = 0;
        do{
            System.out.print("Nhập số nguyên N: ");
            n= sc.nextFloat();
            if (n < 0){
                n = n * (-1);
            }
        int result = (int) n;
        float new_n = n;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (new_n > 1){
                result %= 10;
                new_n = new_n / 10;
                sum = sum + result;
                result = (int) new_n;


            }
        }
        System.out.printf("SUM = %d \n",sum);
        } while(n != 0);

    }
}
