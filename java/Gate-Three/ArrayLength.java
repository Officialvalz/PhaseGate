public class ArrayLength{ 
static int [] ArrayLength (int [] FirstSize, int secondSize) {
    int [] Total = new int [secondSize];

    for (int count = 0;   count < secondSize;   count++) {
    
        if (count < FirstSize.length) {
            Total [count] = FirstSize[count];
            
        } else {
            Total [count] = -1;
        }
        
    }
    return Total;
}
public static void main(String[] args) {
    int [] FirstSize = {10, 11, 12};
    int [] putIn = ArrayLength (FirstSize, 5);
    System.out.print("Numbers:[");
    
    for (int nums : putIn ) {
        System.out.print(nums + " ");
    }
}
}
