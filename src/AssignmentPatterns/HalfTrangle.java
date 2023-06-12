package AssignmentPatterns;

public class HalfTrangle {

    public static void main(String[] args) {
        UpHalfTrangle(5);

        System.out.println("_ _ _ _ _ _ _ _ _ _ _");

        DownHalfTrangle(5);
    }

    static int UpHalfTrangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");

            }

            System.out.println();

        }

        return n;
    }

    static int DownHalfTrangle(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }

            System.out.println();
        }

        return n;
    }
}
