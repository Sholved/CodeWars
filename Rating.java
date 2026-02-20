public class Rating {
    public static void main(String args[]){
        int [] rates = new int[] {2,3,4,3,5,3,4,5,2,2,3,3,4,5,1,2,4,1,2,5};
        int c1 = 0; int c2 = 0; int c3 = 0; int c4 = 0; int c5 = 0;
        for (int i =0; i < rates.length; i ++){
            if (rates[i] == 1){
                c1+=1;
            }
            else if (rates[i]==2){
                c2+=1;
            }
            else if(rates[i]==3){
                c3 +=1;
            }
            else if(rates[i] == 4){
                c4+=1;
            }
            else if(rates[i] == 5){
                c5+=1;
            }
        }
        System.out.println("1 appers "+ c1 + "times");
        System.out.println("2 appers "+ c2 + "times");
        System.out.println("3 appers "+ c3 + "times");
        System.out.println("4 appers "+ c4 + "times");
        System.out.println("5 appers "+ c5 + "times");

        for (int i=0; i < rates.length; i++){
            for (int j = 0; j < rates.length; j ++){
                if (rates[i] > rates[j]){
                    int swap = rates[i];
                    rates[i] = rates[j];
                    rates[j] =swap;
                }
            }
        }

        for (int i = 0; i < rates.length; i ++){
            System.out.print(rates[i] );
        }
    }
}
