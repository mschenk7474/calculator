package calculator;

import java.util.ArrayList;

class MathOperations{
    public float result;
    public ArrayList<Float> previousTotals = new ArrayList<Float>();

    public void print(){
        System.out.println("Here is the result: " + result);
        System.out.println(" ");
    }

    public void show_totals(){
        System.out.println("Here are the previous totals: ");
        for(int i = 0; i < previousTotals.size(); i++){
            System.out.println(previousTotals.get(i));
        }
        System.out.println(" ");
    }
    public void clear(){
        result = 0F;
    }

    public void clear_totals(){
        for(int i = previousTotals.size() - 1; i >= 0; i--){
            previousTotals.remove(i);
        }
    }
}

public class Calculations extends MathOperations{

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
