public class Pro5 {
   
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:num){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
        int minOne = 9999999;
        int minTwo = 9999999;
        for(int n:num){
            if(minOne > n){
                minTwo = minOne;
                minOne =n;
            } else if(minTwo > n){
                minTwo = n;
            }
        }
        System.out.println("First Min Number: "+minOne);
        System.out.println("Second Min Number: "+minTwo);
    }
}