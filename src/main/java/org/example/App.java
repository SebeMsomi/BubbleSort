package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int number[] = {8, 5, 3, 2, 9};
        int temp;
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;
            for (int i = 0; i < number.length - 1; i++){
                if(number[i] > number[i+1]){
                    //check if 8 > 5
                    temp = number[i+1];
                    //store 5 in temp
                    number[i+1] = number[i];
                    //put 8 in 5's location
                    number[i] = temp;
                    fixed = false;
                }
            }

        }
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]);
        }

        int resultsArray[] = {6,5,3,9,2};
        int temp1;
        boolean fix = false;
                while(fix==false){
                    fix = true;
                    for(int i = 0; i<resultsArray.length - 1; i++){
                        if(resultsArray[i] > resultsArray[i+1]){
                            temp1 = resultsArray[i+1];
                            resultsArray[i+1] = resultsArray[i];
                            resultsArray[i] = temp1;
                            fix = false;
                        }
                    }
                }
                for(int i = 0; i<resultsArray.length;i++){
                    System.out.println(resultsArray[i]);
                }
    }
}
