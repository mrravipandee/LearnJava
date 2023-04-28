package JavaMethods;

public class itsSelfRecursion {

    public static void main(String[] args) {

        itsSelfRecursion recur = new itsSelfRecursion();
        int ans = recur.sum(3);    //Calling
        System.out.println(ans);

    }
    int sum(int num) {  // define a function
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }
}
