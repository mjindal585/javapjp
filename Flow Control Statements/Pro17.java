public class Pro17 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        while(num!=0){
           System.out.print(num%10);
           num = num/10; 
        }
        }        
    
}