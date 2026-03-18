public class AfternoonClass{
    static int Largest2D (int [][] numbers){
    
        int largest = numbers[0][0];
        
        for (int index = 0; index < numbers.length; index++) {
        
            for (int count = 0; count < numbers[index].length; count++) {
            
                if (numbers[index][count] > largest) {
                    largest = numbers[index][count];
                }
            }
        }
        return largest;
    }
    
   public static void main(String...args){
   	double [][] numbers = {{45.2, 90.28, 77.1}, {3.52, 9.86, 11.77}, {7.7, 10, 22.33, 12}};
   	System.out.println(largest);
   
   } 
}
