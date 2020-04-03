public class Pro13 {
    public static void main(String[] args) {
        for (int j=10;j<=99;j++){
        int flag=0;
        for (int i=2 ; i<j;i++){
            if (j%i == 0){
                flag=1;
                break;
            }
        }
        if (flag == 0){
            System.out.println(j);
        }
    }
        }        
    
}