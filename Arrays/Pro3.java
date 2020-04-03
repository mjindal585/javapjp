public class Pro3 {
    public static void main(String [] args) {
        int [] arr =  {1,2,3,4,5,6};
        int flag = 0;
        int search = 2;
        for ( int i = 0; i<arr.length;i++){
            if (search != arr[i]){
                flag = -1;
            }
            else {
                flag = i;
                break;
            }
        }
    
        System.out.println(flag+1);
        
    }
}