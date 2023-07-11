package DSA.Arrays;

public class twoNumbersbyIndex {

    public static int[] main(String[] args) {
        int num[] = {2, 7, 4, 5, 3};
        int ans = 9;

        for(int i = 0; i<= num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] + num[j] == ans) {
                    int a[] = {i, j};
                    return a;
                }
            }
        }
        return num;
    }

}
