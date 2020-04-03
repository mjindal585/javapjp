public class Pro12 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int flag=0;
        for (int i=2 ; i<num;i++){
            if (num%i == 0){
                flag=1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
        }        
    
}