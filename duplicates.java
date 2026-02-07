import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a word");
        String word = sc.nextLine().toLowerCase();
        int length = word.length();
        String[] letters = new String[length];
        int times = 0;
        int index = 0;

        for (int i = 0; i <length; i ++){
            char c = word.charAt(i);
            String s = String.valueOf(c);
            boolean found = false;
                }
            }
            else {
            letters[i] = String.valueOf(c);}
        }
        sc.close();
    }
}
 