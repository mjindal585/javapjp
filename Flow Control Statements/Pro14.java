public class Pro14 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please enter an integer number");
        }
        else{
        int num = Integer.parseInt(args[0]);
        if (num == 0 || num == 1){
            System.out.println(num+" is neither prime nor composite ");
        }
        else{
        int flag=0;
        for (int i=2 ; i<num;i++){
            if (num%i == 0){
                flag=1;
                break;
            }
        }
        if (flag == 1){
            System.out.println(num + " is not a prime number");
        }
        else{
            System.out.println(num + " is a prime number");
        }
        }        
    }}
}