package calculator;

import java.util.ArrayList;

class MathOperations{
    /*
        An abstract parent class that has the global variables necessary 
        for conducting math operations, and some basic methods to be used
        throughout the entire program.

        This class is meant to be used and called upon by other classes,
        such as the Calculations class. This class is meant to be one that
        other classes can pull from, hence the name parent class. We could
        make multiple classes that are able to use the variables and methods
        found in this class.
     */

    /*  global variables to be used throughout this class and others */
    public float result;
    public ArrayList<Float> previousTotals = new ArrayList<Float>();

    // outputs the total
    public void print(){
        System.out.println("Here is the result: " + result);
        System.out.println(" ");
    }

    // outputs all previous totals stored in the list
    public void show_totals(){
        System.out.println("Here are the previous totals: ");
        // loops through the entire list and outputs them for the user
        for(int i = 0; i < previousTotals.size(); i++){
            System.out.println(previousTotals.get(i));
        }
        System.out.println(" ");
    }
    // clears total
    public void clear(){
        result = 0F;
    }

    // clears the previous totals list
    public void clear_totals(){
        // loops through the entire list and removes them for the user
        for(int i = previousTotals.size() - 1; i >= 0; i--){
            previousTotals.remove(i);
        }
    }
}

public class Calculations extends MathOperations{
    /* 
     Within each of the methods in this class, there
     are two things. The first being the actual math operation,
     where the result variable is updated depending on what the
     user decides to do. Each method is named for the operation they
     do, so it is very easy to understand which each does.
     
     The second action of the methods are to add result to the previous 
     totals ArrayList. We do this so, if the user would like, they can see 
     what have been the previous totals. We add this after we do the calculations
     to make sure the result we want is added to the list, whether
     it be the running total be updated or just two numbers within
     an operation

     This class also uses inheritance to be able to use all the methods found
     in the MathOperations class when called from a different class as an object.
     */
    public void add(float firstNum, float secondNum){
        result = firstNum + secondNum;
        previousTotals.add(result);
    }

    public void subtract(float firstNum, float secondNum){
        result = firstNum - secondNum;
        previousTotals.add(result);
    }

    public void multiply(float firstNum, float secondNum){
        result = firstNum * secondNum;
        previousTotals.add(result);
    }

    public void divide(float firstNum, float secondNum){
        result = firstNum / secondNum;
        previousTotals.add(result);
    }

    public void percent (float firstNum){
        result = firstNum * 100;
        previousTotals.add(result);
    }

    public void percentage(float firstNum){
        result = firstNum / 100;
        previousTotals.add(result);
    }

    public void power(float firstNum, float secondNum){
        result = Float.valueOf((float) Math.pow(firstNum, secondNum));
        previousTotals.add(result);
    }
    
    public void square_root(float firstNum){
        result = Float.valueOf((float) Math.sqrt(firstNum));
        previousTotals.add(result);
    }

    public void absolute_value(float firstNum){
        result = Math.abs(firstNum);
        previousTotals.add(result);
    }
}
