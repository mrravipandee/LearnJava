package AssignmentOne;

import java.util.Scanner;

public class SumNumberRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, sum = 0, arr[];

        System.out.print("How many numbers your want: ");
        num = scanner.nextInt();
        arr = new int[num];

        System.out.println("Enter the "+num+" numbers.");

        for (int i = 0; i < num; i++) {
            System.out.println("Enter number "+(i+1)+" :");
            arr[i] = scanner.nextInt();
        }

        sum= sumMethod(arr, num-1, sum);
        System.out.println("sum is ="+sum);
    }

    static int sumMethod(int arr[], int num, int sum) {
        if (num < 0) {
            return sum;
        } else {
            sum += arr[num];
            return sumMethod(arr, num - 1, sum);
        }
    }
}
