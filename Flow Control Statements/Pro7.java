public class Pro7 {
    public static void main(String[] args) {
        char a = 'z';
        if (a>='A' && a<='Z')
        {
            System.out.println(a+"->"+ (char)(a+32));
        }
        else{
            System.out.println(a+"->"+ (char)(a-32));
        }
    }

    
}