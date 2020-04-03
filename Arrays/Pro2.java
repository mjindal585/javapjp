public class Pro2 {
    public static void main(String [] args) {
        int [] inputArray =  {1,2,3,4,5,6};
        int maxValue = inputArray[0]; 
        int minValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++){ 
            if(inputArray[i] > maxValue){ 
               maxValue = inputArray[i]; 
            } 

          } 
          for(int i=1;i<inputArray.length;i++){ 
            if(inputArray[i] < minValue){ 
              minValue = inputArray[i]; 
            } 
          } 
          System.out.println("Maximum Value is: "+maxValue);
          System.out.println("Maximum Value is: "+minValue);

        
    }
}