package AssignmentPatterns;

public class HalfTrangleNum {

    HalfTrangleNum(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        HalfTrangleNum halfTrangleNum = new HalfTrangleNum(5);

    }

}
