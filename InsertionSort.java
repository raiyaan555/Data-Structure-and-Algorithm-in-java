

public class InsertionSort {
    
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };


        for(int firstUnsortIndex = 1; firstUnsortIndex < intArray.length; firstUnsortIndex++){
            int newElement = intArray[firstUnsortIndex];

            int i;

            for(i = firstUnsortIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
         }
 
    }
}
