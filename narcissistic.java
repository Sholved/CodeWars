import java.util.Scanner;


public class narcissistic {
    static int number;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number ");
        number = sc.nextInt();
        
        sc.close();
        boolean result = narcissist(number);
        System.out.println("Is the number narcissistic? " + result);
    }

    public static boolean narcissist(int temp){
       int sum = 0;
       int original = temp;
       String num = String.valueOf(original);
       int length = num.length();
       while (temp>0){
        int digit = temp%10;
        sum += Math.pow(digit, length);
        temp/=10;

    }
    return sum == original;
    }
    
}
