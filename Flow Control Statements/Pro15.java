public class Pro15 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum=0;
        for(;num!=0;){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
        }        
    
}