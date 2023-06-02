package AssignmentOne;

import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("* * * * * S S C School * * * * *");

        System.out.print("English : ");
        int eng = sc.nextInt();

        System.out.print("Marathi : ");
        int mar = sc.nextInt();

        System.out.print("Hindi : ");
        int hin = sc.nextInt();

        System.out.print("Math : ");
        int math = sc.nextInt();

        System.out.print("Social Science : ");
        int science = sc.nextInt();

        float total_marks = (float) eng + mar + hin + math + science;

        float average = (float) ((total_marks / 500) * 100);

        if (average >= 60 || average <= 100) {
            System.out.println("Class A");
            System.out.println("Percentage is : "+average);

        } else if (average >= 35 || average <= 60) {
            System.out.println("Class B");
            System.out.println("Percentage is : "+average);

        } else {
            System.out.println("Fail");
            System.out.println("Percentage is : "+average);
        }

        sc.close();
    }
}
