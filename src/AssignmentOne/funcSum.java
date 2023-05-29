package AssignmentOne;

import java.util.Scanner;

public class funcSum {

    static int Sum(int num1, int num2) {
        int ans = num1 + num2;
        return ans;
    }

    static int Sum(int num1, int num2, int num3) {
        int ans = num1 + num2 + num3;
        return ans;
    }

    static float Sum(double num1, double num2) {
        double ans  = num1 + num2;
        return (float) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans1 = Sum(1, 2);
        System.out.println(ans1);

        int ans2 = Sum(2, 4, 6);
        System.out.println(ans2);

        //method overload
        double ansDouble = Sum(3.4, 22.3);
        System.out.println(ansDouble);

        sc.close();
    }
}
