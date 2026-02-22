public class Main {
    public static void main(String[] args){
        int[] number = new int[37];
        int index = 0;
        double sum = 0;
        double sum_of_square = 0;

        for(int i=1; i<100; i++){
            if (i%2 == 1){
                if(i==1 || i ==3){
                    continue;
                }
                if(i>=80){
                    break;
                }
                number[index] = i;
                sum += i;
                sum_of_square +=  Math.pow(i,2);

                System.out.println(number[index]);
                index ++;
            } 
        }
        double average = sum/(index);
        double variance = (sum_of_square-(sum*sum)/(index))/(index-1);
        System.out.println("The standard deviation is " + Math.sqrt(variance));
        System.out.println(index);
        System.out.println(average);
    }
}



