public class Main {
    public static void main(String[] args){
        int[] number = new int[100];
        int index = 0;

        for(int i=1; i<100; i++){
            if (i%2 == 1){
                if(i==1 || i ==3){
                    continue;
                }
                if(i>=80){
                    break;
                }
                number[index] = i;
                System.out.println(number[index]);
                index ++;
            } 
        }
    }
}



