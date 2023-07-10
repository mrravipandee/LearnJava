package BasicQuestionSolve;

import java.util.Scanner;

public class FibonacciSeries {

    public FibonacciSeries(int num) {
        int zero = 0;
        int one = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(one+" ");
            int sum = one + zero;
            one = zero;
            zero = sum;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      Find fibonacci series by constructor
        FibonacciSeries fibonacciSeries = new FibonacciSeries(10);

        sc.close();
    }
}
