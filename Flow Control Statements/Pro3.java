public class Pro3 {
    public static void main(String[] args) {
        int a = args.length;
        if(a==0){
            System.out.println("No values");
        }        
        else {
            for (int i = 0;i<a;i++){
                System.out.print(args[i]);
                if (i!=(a-1)){
                    System.out.print(",");
                }
            }   }             
    } 
}