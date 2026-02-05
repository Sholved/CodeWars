import java.util.Scanner;
//digital root adds digits of a number 
//if the sum of those digits does not produce a single number
//the addition continues

public class digital {
    static int number;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter a number ");
        number = sc.nextInt();        
        sc.close();
        int result = root(number);
        System.out.print("The digital root of "+ number + " is "+ result );
    }
    
    public static int root(int number){
        int sum = 0;
        while (number > 10){
            sum = 0;
            while (number > 0){
                sum += number%10;
                number/=10;
            }
            number = sum;
        }
        return number;
}

}

