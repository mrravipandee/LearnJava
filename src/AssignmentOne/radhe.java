package AssignmentOne;
import java.util.Scanner;

public class radhe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // make a program like a talk with person.

        System.out.println("Radhe ;)");

        System.out.print(": ");
        String msg = sc.nextLine().toLowerCase();

        switch (msg) {
            case "hello" :
                System.out.println("Haan");
                System.out.print(": ");
                msg = sc.nextLine();

                switch (msg) {
                    case "kya kar rhi ho" :
                        System.out.println("Kuch toh nhi");
                }

            case "radhe" :
                System.out.println("Bolo Ravi");
                System.out.print(": ");
                msg = sc.nextLine();

                switch (msg) {
                    case "kya kar rhi ho" :
                        System.out.println("kuch toh nhi");
                        System.out.print(": ");
                        msg = sc.nextLine();

                        switch (msg) {
                            case "aacha" :
                                System.out.println("Haan");
                                System.out.print(": ");
                                msg = sc.nextLine();

                                switch (msg) {
                                    case "khana khaya" :
                                        System.out.println("Haan");
                                        System.out.println("Tumne khaya");
                                        System.out.print(": ");
                                        msg = sc.nextLine();

                                        switch (msg) {
                                            case "nhi" :
                                                System.out.println("Kyu");
                                                System.out.print(": ");
                                                msg = sc.nextLine();

                                                switch (msg) {
                                                    case "kuch time ke baad khaoga" :
                                                        System.out.println("aacha");
                                                        System.out.print(": ");

                                                        switch (msg) {
                                                            case "haan" :
                                                                System.out.println("Hmmm");
                                                        }

                                                    case "baad mei" :
                                                        System.out.println("Aacha");
                                                        break;
                                                }

                                            break;

                                            case "haan" :
                                                System.out.println("aacha");
                                                System.out.print(": ");
                                                msg = sc.nextLine();

                                                switch (msg) {
                                                    case "haan" :
                                                        System.out.println("phir kya kar rhe ho");
                                                        System.out.print(": ");
                                                        msg = sc.nextLine();

                                                        switch (msg) {
                                                            case "kuch nhi" :
                                                                System.out.println("aacha");
                                                                System.out.print(": ");
                                                                msg = sc.nextLine();

                                                                switch (msg) {
                                                                    case "haan" :
                                                                        System.out.println("Okay");
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }

        sc.close();

    }
}
