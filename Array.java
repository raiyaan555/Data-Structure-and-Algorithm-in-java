import java.util.*;

public class Array {

    public void printArray(int [] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public void arrayDemo()
{
    int [] myArray = new int[5];
    myArray[0] = 1;
    myArray[1] = 2;
    myArray[2] = 4;
    myArray[3] = 5;
    myArray[4] = 8;
    printArray(myArray);

}

// to reverse an array from start to end

public void  reverseArray(int[] arr, int start, int end){
 
    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

// to find the minimum value in an array

public int findMinimum(int[]arr){
    int min = arr[0];
    for(int i = 1; i<arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return min;
}

// How to move Zeroes to end of an Array?

public void moveZeros(int[]arr,int n){

    int j = 0;
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i] != 0 && arr[j]== 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        if(arr[j]!=0){
            j++;
        }
    }
}


// How to resize an Array in Java ?

public void resize(int []arr ,int capacity){
    int [] temp = new int[capacity];
    for(int i = 0; i<capacity; i++){
        temp[i] = arr[i];

    }
    arr = temp;
}


// How to check if a given String is a Palindrome ?

public boolean isPalindrome(String word){
char [] charArray = word.toCharArray();
int start = 0;
int end = word.length()-1;
while(start < end)
{
if(charArray[start] != charArray[end])
return false;

start++;
end--;
}
return true;
}


public static void main(String[] args) {
    
Array arrayutil = new Array();
arrayutil.arrayDemo();
}
}
