package AssignmentOne;

import java.util.Scanner;

public class SumNumberArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("How many sum you want: ");
        num = scanner.nextInt();
        int arr[] = new int[num];

        System.out.printf("Entered the %d numbers",num);

        for (int i = 0; i < num; i++) {
            System.out.print("\nenter  number "+(i+1)+": ");
            arr[i]=scanner.nextInt();
        }
        for(int i = 0; i < num; i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum of "+num+" numbers is = "+sum);
    }
}
