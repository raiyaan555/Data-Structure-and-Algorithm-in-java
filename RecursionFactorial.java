import java.util.*;

public class RecursionFactorial {
    public static void main(String[] args) {
       System.out.println("The factorial of 3 is "+ recursiveFactorial(3));
        
    }


    public static int recursiveFactorial(int num){

        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }



    public static int iterativeFactor(int num){ 

        // n! = n * (n-1)! Use this formula

        if (num==0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i<=num; i++){
            factorial *=i;
        }

    return factorial;

    }
}
