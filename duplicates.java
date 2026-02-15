import java.util.Scanner;
//code to count the number ofr letters that are repeated in a word

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a word: ");
        String word = sc.nextLine().toLowerCase();
        int length = word.length();
        String[] letters = new String[length];
        int times = 0;
        int index = 0;

        for (int i = 0; i <length; i ++){
            char c = word.charAt(i);
            String s = String.valueOf(c);
            boolean found = false;
            for (int j = 0; j < index; j++){
                if (letters[j].equals(s)){
                    found =true;
                    break;
                }
            }
            if (found){
                times ++;
            }
            else{
                letters[index] =s;
                index++;
            }
                }
                System.out.println("Duplicates:" + times);
                sc.close();
            }
            
        } 

        
        