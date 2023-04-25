package BasicOfJava;

public class JavaMultiDimensionalArrays {
    public static void main(String[] args) {
//        Multidimensional Arrays
//        A multidimensional array is an array of arrays.
//        Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
//        To create a two-dimensional array, add each array within its own set of curly braces:

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[0][2]); // 3
        System.out.println(myNumbers[1][2]); // 7
        System.out.println(myNumbers[0][1]); // 2

//      Change Element Values
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

//      Loop Through a Multi-Dimensional Array
//          We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j]);
            }
            System.out.println();
        }
    }
}
