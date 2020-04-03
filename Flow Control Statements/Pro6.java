public class Pro6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        if((args[0].equals("Female")) && (a>=1 && a<=58)){
            System.out.println("8.2%");
        }
        else if ((args[0].equals("Female")) && (a>=59 && a<=100)){
            System.out.println("9.2%");
        }
        else if((args[0].equals("Male")) && (a>=59 && a<=100)) 
            {System.out.println("10.5%");}     
        else if ((args[0].equals("Male")) && (a>=1 && a<=58)) {
            System.out.println("8.4%");     

        } 
    }

    
}