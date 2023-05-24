package AssignmentOne;

import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class recomendSong {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //for scanner
        Desktop desk = Desktop.getDesktop(); //for openUrl
        // in this program we are make a song recommendation feature to help as mood of user.

        System.out.println("Hello sir");
        System.out.println("\u001B[31mMay I help you ?");
        System.out.print(": ");
        String inUser = sc.nextLine().toLowerCase();

        switch (inUser) {
            case "yes" :
                System.out.println("\u001B[33mThank you sir!");
                System.out.println("\u001B[35mPlease select your mood:");
                System.out.print("\n1. Good vibes.\n2. Angry\n3. Sadness\n: ");
                int moodUser = sc.nextInt();
                switch (moodUser) {
                    case 1:
                        desk.browse(new URI("https://www.youtube.com/results?search_query=good+vibes+song"));
                        break;

                    case 2:
                        desk.browse(new URI("https://www.youtube.com/results?search_query=angry+mood+song"));
                        break;

                    case 3:
                        desk.browse(new URI("https://www.youtube.com/results?search_query=Sadness+mood+song"));
                        break;

                }

            break;

            case "no" :
                System.out.println("Have a good day sir");
                break;

            default:
                System.out.println("\u001B[31m Please select correct option.");
        }

    }
}
