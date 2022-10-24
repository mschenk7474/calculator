package calculator;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Calculations calc = new Calculations();
        Scanner scanner = new Scanner(System.in);
        boolean readyToQuit = false;
        float first;
        float second;

        System.out.println("Welcome to the Calculator!");
        System.out.println(" ");
        
        while (!readyToQuit){
            System.out.println("Choose from one of our many options below:");
            System.out.println("0.  Quit");
            System.out.println("1.  Add");
            System.out.println("2.  Subtract");
            System.out.println("3.  Multiply");
            System.out.println("4.  Divide");
            System.out.println("5.  Percent");
            System.out.println("6.  Percentage");
            System.out.println("7.  Power of");
            System.out.println("8.  Square Root");
            System.out.println("9.  Absolute Value");
            System.out.println("10. Show");
            System.out.println("11. Clear");
            System.out.print("Input your choice here: ");
            int choice = scanner.nextInt();
            System.out.println(" ");

            if (choice == 0){
                System.out.println("Thank you for using the Calculator!");
                System.out.println("Your final total was: " + calc.result);
                System.out.println(" ");
                System.out.println("SESSION TERMINATED");
                readyToQuit = true;
            }
            // add
            else if (choice == 1){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Add two numbers");
                System.out.println("2. Add a number to the running total");
                System.out.print("Input your choice here: ");
                int add_choice = scanner.nextInt();
                System.out.println(" ");

                // add two numbers
                if (add_choice == 1){
                    System.out.print("Input a number you would like to add: ");
                    first = scanner.nextFloat();

                    System.out.print("Input another number you would like to add to the previous number: ");
                    second = scanner.nextFloat();

                    calc.add(first, second);
                    calc.print();
                }

                // add to running total
                else if (add_choice == 2){
                    System.out.print("Input a number you would like to add to the running total: ");
                    second = scanner.nextFloat();

                    calc.add(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }
            // subtract
            else if (choice == 2){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Subtract two numbers");
                System.out.println("2. Subtract a number from the running total");
                System.out.print("Input your choice here: ");
                int sub_choice = scanner.nextInt();
                System.out.println(" ");

                // subtract two numbers
                if (sub_choice == 1){
                    System.out.print("Input a number a number you would like to subtract: ");
                    first = scanner.nextFloat();

                    System.out.print("Input another number you would like to subtract from the previous number: ");
                    second = scanner.nextFloat();

                    calc.subtract(first, second);
                    calc.print();
                }

                // subtract from the running total
                else if (sub_choice == 2){
                    System.out.print("Input a number you would like to subtract from the running total: ");
                    second = scanner.nextFloat();

                    calc.subtract(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }
            // multiply
            else if (choice == 3){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Multiply two numbers");
                System.out.println("2. Multiply a number to the running total");
                System.out.print("Input your choice here: ");
                int mul_choice = scanner.nextInt();
                System.out.println(" ");

                // multiply two numbers
                if (mul_choice == 1){
                    System.out.print("Input a number you would like to multiply: ");
                    first = scanner.nextFloat();

                    System.out.print("Input another number you would like to multiply to the previous number: ");
                    second = scanner.nextFloat();

                    calc.multiply(first, second);
                    calc.print();
                }

                // multiply to running total
                else if (mul_choice == 2){
                    System.out.print("Input a number you would like to multiply to the running total: ");
                    second = scanner.nextFloat();

                    calc.multiply(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }
            // divide
            else if (choice == 4){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Divide two numbers");
                System.out.println("2. Divide a number from the running total");
                System.out.print("Input your choice here: ");
                int div_choice = scanner.nextInt();
                System.out.println(" ");

                // divide two numbers
                if (div_choice == 1){
                    System.out.print("Input a number a number you would like to divide: ");
                    first = scanner.nextFloat();

                    System.out.print("Input another number you would like to divide from the previous number: ");
                    second = scanner.nextFloat();

                    calc.divide(first, second);
                    calc.print();
                }

                // divide from the running total
                else if (div_choice == 2){
                    System.out.print("Input a number you would like to divide from the running total: ");
                    second = scanner.nextFloat();

                    calc.divide(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // percent
            else if (choice == 5){
                System.out.println("* NOTE: This is the option to MULTIPLY by 100 *");
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the percent of a number");
                System.out.println("2. Get the percent of the running total");
                System.out.print("Input your choice here: ");
                int p_choice = scanner.nextInt();
                System.out.println(" ");

                // percentage of a specified number
                if (p_choice == 1){
                    System.out.print("Input a number you would like to get the percent of: ");
                    first = scanner.nextFloat();

                    calc.percent(first);
                    calc.print();
                }

                // percentage of the running total
                else if (p_choice == 2){
                    calc.percent(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // percentage
            else if (choice == 6){
                System.out.println("* NOTE: This is the option to DIVIDE by 100 *");
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the percentage of a number");
                System.out.println("2. Get the percentage of the running total");
                System.out.print("Input your choice here: ");
                int per_choice = scanner.nextInt();
                System.out.println(" ");

                // percentage of a specified number
                if (per_choice == 1){
                    System.out.print("Input a number you would like to get the percentage of: ");
                    first = scanner.nextFloat();

                    calc.percentage(first);
                    calc.print();
                }

                // percentage of the running total
                else if (per_choice == 2){
                    calc.percentage(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // power of
            else if (choice == 7){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the specific power of a specific number");
                System.out.println("2. Get the specific power of the running total");
                System.out.print("Input your choice here: ");
                int pow_choice = scanner.nextInt();
                System.out.println(" ");

                // power of number and power inputted
                if (pow_choice == 1){
                    System.out.print("Input a number you would like the power applied to: ");
                    first = scanner.nextFloat();

                    System.out.print("Input another number as the power being applied to the other number: ");
                    second = scanner.nextFloat();

                    calc.power(first, second);
                    calc.print();
                }

                // power of running total
                else if (pow_choice == 2){
                    System.out.print("Input a number as the percent you want applied to the running total: ");
                    second = scanner.nextFloat();

                    calc.power(calc.result, second);
                    calc.print();
                }

                // invalid choice
                else{
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // square root
            else if (choice == 8){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the square root of a specific number");
                System.out.println("2. Get the square root of the running total");
                System.out.print("Input your choice here: ");
                int squ_choice = scanner.nextInt();
                System.out.println(" ");

                // square root specific number
                if (squ_choice == 1){
                    System.out.print("Input a number that you want to find the square root of: ");
                    first = scanner.nextFloat();

                    calc.square_root(first);
                    calc.print();
                }

                // square root running total
                else if (squ_choice == 2){
                    calc.square_root(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // absolute value
            else if (choice == 9){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the absolute value of a specific number");
                System.out.println("2. Get the absolute value of the running total");
                System.out.print("Input your choice here: ");
                int abs_choice = scanner.nextInt();
                System.out.println(" ");

                // absolute value a specific number
                if (abs_choice == 1){
                    System.out.print("Input a number that you want to find the absolute number of: ");
                    first = scanner.nextFloat();

                    calc.absolute_value(first);
                    calc.print();
                }

                // absolute value the running total
                else if (abs_choice == 2){
                    calc.absolute_value(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // show 
            else if (choice == 10){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Show the total");
                System.out.println("2. Show the previous totals");
                System.out.print("Input your choice here: ");
                int show_choice = scanner.nextInt();
                System.out.println(" ");

                // show total
                if (show_choice == 1){
                    calc.print();
                } 

                // show previous totals
                else if (show_choice == 2){
                    calc.show_totals();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // clear 
            else if (choice == 11){
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Clear the total");
                System.out.println("2. Clear the previous totals");
                System.out.print("Input your choice here: ");
                int clear_choice = scanner.nextInt();
                System.out.println(" ");

                // clear total
                if (clear_choice == 1){
                    calc.clear();
                    calc.print();
                }

                // clear previous totals
                else if (clear_choice == 2){
                    calc.clear_totals();
                    calc.show_totals();
                }

                // invalid option
                else {
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // incorrect
            else{
                System.out.println("Incorrect option, please try again.");
            }

        }
        scanner.close();
    }
}
