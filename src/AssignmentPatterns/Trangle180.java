package AssignmentPatterns;

public class Trangle180 {

    Trangle180(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Trangle180 trangle180 = new Trangle180(50);
    }
}
