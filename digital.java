import java.util.Scanner;


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
       //int original = number;
       while (number>0){
        sum += number%10;
        number/=10;
        // num = String.valueOf(number);
        // length = num.length(); 
        //if( num < 10 && lenthof(sum) > 0){
        // number = sum, sum = 0, sum += number%0
        //number/10}
     }
     number = sum;
     sum = 0;
     while (number > 0){
        sum += number%10;
        number/=10;     }
    return sum;
}

}
