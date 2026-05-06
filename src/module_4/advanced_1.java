package module_4;

import java.util.Scanner;

public class advanced_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        selectionSortDescending(arr);

        System.out.println("\nMảng sau khi sắp xếp giảm dần:");
        displayArray(arr);

        System.out.print("\nNhập số cần tìm: ");
        int target = sc.nextInt();

        int linearResult = linearSearch(arr, target);
        System.out.println("Kết quả Linear Search: " +
                (linearResult != -1 ? "Tìm thấy tại index " + linearResult : "Không tìm thấy"));

        int binaryResult = binarySearchDescending(arr, target);
        System.out.println("Kết quả Binary Search: " +
                (binaryResult != -1 ? "Tìm thấy tại index " + binaryResult : "Không tìm thấy"));
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Thuật toán Tìm kiếm tuyến tính (Linear Search)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Thuật toán Tìm kiếm nhị phân (Binary Search) - Cho mảng GIẢM DẦN
    public static int binarySearchDescending(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void displayArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
