import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a word");
        String word = sc.nextLine();
        int length = word.length();
        String[] letters = new String[length];
        int times = 0;

        for (int i = 0; i <length; i ++){
            char c = word.charAt(i);
            int duplicate = 0;
            c = Character.toLowerCase(c);
            if (String.valueOf(c) in letters){
                duplicate += 1;
                if (duplicate > 0){
                    times +=1;
                }
            }
            else {
            letters[i] = String.valueOf(c);}
        }
        sc.close();
    }
}
