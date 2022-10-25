package calculator;

import java.util.Scanner;

public class Menu {
    /* 
     Within this class, we have one main method named 'menu'. Within menu, we
     have different options with each of their own sub-menus that the user can
     pick and choose from as they wish. Each of the options have their subsequent
     functions that are based off of what the user wants. We have basic math operations,
     as well as the ability to show and clear the running total and previous totals that
     are stored by the program. The program also quits when the user wants to and displays
     the final total back to the user before terminating the session.
     */
    public void menu(){
        // object and variable intialization
        Calculations calc = new Calculations();
        Scanner scanner = new Scanner(System.in);
        boolean readyToQuit = false;
        float first;
        float second;

        // opening message
        System.out.println("Welcome to the Calculator!");
        System.out.println(" ");
        
        /*  main while loop that is set to the condtion of when readyToQuit is true */
        while (!readyToQuit){
            // menu to be repeated everytime 
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

            // user input
            System.out.print("Input your choice here: ");
            int choice = scanner.nextInt();
            System.out.println(" ");

            // quit 
            if (choice == 0){
                /* 
                basic quit messages with the final total displayed back to the user
                with readyToQuit being set to true, thus ending the loop by meeting
                the condition
                */
                System.out.println("Thank you for using the Calculator!");
                System.out.println("Your final total was: " + calc.result);
                System.out.println(" ");
                System.out.println("SESSION TERMINATED");
                readyToQuit = true;
            }
            // add
            else if (choice == 1){
                // menu for the options for add
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Add two numbers");
                System.out.println("2. Add a number to the running total");

                // user input
                System.out.print("Input your choice here: ");
                int add_choice = scanner.nextInt();
                System.out.println(" ");

                // add two numbers
                if (add_choice == 1){
                    // gets the first number from user
                    System.out.print("Input a number you would like to add: ");
                    first = scanner.nextFloat();

                    // gets the second number from the user
                    System.out.print("Input another number you would like to add to the previous number: ");
                    second = scanner.nextFloat();

                    // adds the two numbers and outputs the result to the user
                    calc.add(first, second);
                    calc.print();
                }

                // add to running total
                else if (add_choice == 2){
                    // gets the number to add to the running total from the user
                    System.out.print("Input a number you would like to add to the running total: ");
                    second = scanner.nextFloat();

                    // adds the number to the running total and outputs the result to the user
                    calc.add(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }
            // subtract
            else if (choice == 2){
                // menu for the options to subtract
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Subtract two numbers");
                System.out.println("2. Subtract a number from the running total");

                // user input
                System.out.print("Input your choice here: ");
                int sub_choice = scanner.nextInt();
                System.out.println(" ");

                // subtract two numbers
                if (sub_choice == 1){
                    // gets the first number to subtract from the user
                    System.out.print("Input a number a number you would like to subtract: ");
                    first = scanner.nextFloat();

                    // gets the second number to subtract from the user
                    System.out.print("Input another number you would like to subtract from the previous number: ");
                    second = scanner.nextFloat();

                    // subtracts the two numbers and outputs the result to the user
                    calc.subtract(first, second);
                    calc.print();
                }

                // subtract from the running total
                else if (sub_choice == 2){
                    // gets the number to subtract from the running total from the user
                    System.out.print("Input a number you would like to subtract from the running total: ");
                    second = scanner.nextFloat();

                    // subtracts the number from the running total and outputs the result to the user
                    calc.subtract(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }
            // multiply
            else if (choice == 3){
                // menu for the options to multiply
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Multiply two numbers");
                System.out.println("2. Multiply a number to the running total");

                // user input
                System.out.print("Input your choice here: ");
                int mul_choice = scanner.nextInt();
                System.out.println(" ");

                // multiply two numbers
                if (mul_choice == 1){
                    // gets the first number to multiply from the user
                    System.out.print("Input a number you would like to multiply: ");
                    first = scanner.nextFloat();

                    // gets the second number to multiply from the user
                    System.out.print("Input another number you would like to multiply to the previous number: ");
                    second = scanner.nextFloat();

                    // multiplies the two numbers and outputs the result to the user
                    calc.multiply(first, second);
                    calc.print();
                }

                // multiply to running total
                else if (mul_choice == 2){
                    // gets the number to multiply to the running total from the user
                    System.out.print("Input a number you would like to multiply to the running total: ");
                    second = scanner.nextFloat();

                    // multiplies the number to the running total and outputs the result to the user
                    calc.multiply(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }
            // divide
            else if (choice == 4){
                // menu for the options to divide
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Divide two numbers");
                System.out.println("2. Divide a number from the running total");

                // user input
                System.out.print("Input your choice here: ");
                int div_choice = scanner.nextInt();
                System.out.println(" ");

                // divide two numbers
                if (div_choice == 1){
                    // gets the first number to divide from the user
                    System.out.print("Input a number a number you would like to divide: ");
                    first = scanner.nextFloat();

                    // gets the second number to divide from the user
                    System.out.print("Input another number you would like to divide from the previous number: ");
                    second = scanner.nextFloat();

                    // divides the two numbers and outputs the result to the user
                    calc.divide(first, second);
                    calc.print();
                }

                // divide from the running total
                else if (div_choice == 2){
                    // gets the number to divide from the running total from the user
                    System.out.print("Input a number you would like to divide from the running total: ");
                    second = scanner.nextFloat();

                    // divides the number from the running total and outputs the result to the user
                    calc.divide(calc.result, second);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // percent
            else if (choice == 5){
                // menu for the options to percent
                System.out.println("* NOTE: This is the option to MULTIPLY by 100 *");
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the percent of a number");
                System.out.println("2. Get the percent of the running total");

                // user input
                System.out.print("Input your choice here: ");
                int p_choice = scanner.nextInt();
                System.out.println(" ");

                // percentage of a specified number
                if (p_choice == 1){
                    // gets the number to take the percent of from the user
                    System.out.print("Input a number you would like to get the percent of: ");
                    first = scanner.nextFloat();

                    // calculates the percent and outputs it to the user
                    calc.percent(first);
                    calc.print();
                }

                // percentage of the running total
                else if (p_choice == 2){
                    // calculates the percent of the running total and outputs it to the user
                    calc.percent(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // percentage
            else if (choice == 6){
                // menu for the options to percentage
                System.out.println("* NOTE: This is the option to DIVIDE by 100 *");
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the percentage of a number");
                System.out.println("2. Get the percentage of the running total");

                // user input
                System.out.print("Input your choice here: ");
                int per_choice = scanner.nextInt();
                System.out.println(" ");

                // percentage of a specified number
                if (per_choice == 1){
                    // gets the number to get the percenatage of from the user
                    System.out.print("Input a number you would like to get the percentage of: ");
                    first = scanner.nextFloat();

                    // calculates the percentage and outputs it to the user
                    calc.percentage(first);
                    calc.print();
                }

                // percentage of the running total
                else if (per_choice == 2){
                    // calculates the percentage of the running total and outputs it to the user
                    calc.percentage(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // power of
            else if (choice == 7){
                // menu for the options to power of
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the specific power of a specific number");
                System.out.println("2. Get the specific power of the running total");

                // user input
                System.out.print("Input your choice here: ");
                int pow_choice = scanner.nextInt();
                System.out.println(" ");

                // power of number and power inputted
                if (pow_choice == 1){
                    // gets the first number to have the power applied to from the user
                    System.out.print("Input a number you would like the power applied to: ");
                    first = scanner.nextFloat();

                    // gets the power that is to be applied to the previous number from the user
                    System.out.print("Input another number as the power being applied to the other number: ");
                    second = scanner.nextFloat();

                    // calculates the power based on the last two numbers and outputs it to the user
                    calc.power(first, second);
                    calc.print();
                }

                // power of running total
                else if (pow_choice == 2){
                    // gets a power that is to be applied to the running total from the user
                    System.out.print("Input a number as the power you want applied to the running total: ");
                    second = scanner.nextFloat();

                    // calculates the power of the running total and outputs it to the user
                    calc.power(calc.result, second);
                    calc.print();
                }

                // invalid choice
                else{
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // square root
            else if (choice == 8){
                // menu for the options to square root
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the square root of a specific number");
                System.out.println("2. Get the square root of the running total");

                // user input
                System.out.print("Input your choice here: ");
                int squ_choice = scanner.nextInt();
                System.out.println(" ");

                // square root specific number
                if (squ_choice == 1){
                    // gets a number to square root from the user
                    System.out.print("Input a number that you want to find the square root of: ");
                    first = scanner.nextFloat();

                    // calculates the square root and outputs it to the user
                    calc.square_root(first);
                    calc.print();
                }

                // square root running total
                else if (squ_choice == 2){
                    // calculates the square root of the running total and outputs it to the user
                    calc.square_root(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // absolute value
            else if (choice == 9){
                // menu for the options to absolute value
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Get the absolute value of a specific number");
                System.out.println("2. Get the absolute value of the running total");

                // user input
                System.out.print("Input your choice here: ");
                int abs_choice = scanner.nextInt();
                System.out.println(" ");

                // absolute value a specific number
                if (abs_choice == 1){
                    // gets a number to absolute value from the user
                    System.out.print("Input a number that you want to find the absolute number of: ");
                    first = scanner.nextFloat();

                    // calculates the absolute value and outputs it to the user
                    calc.absolute_value(first);
                    calc.print();
                }

                // absolute value the running total
                else if (abs_choice == 2){
                    // calculates the absolute values of the running total and outputs it to the user
                    calc.absolute_value(calc.result);
                    calc.print();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // show 
            else if (choice == 10){
                // menu for the options to show
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Show the total");
                System.out.println("2. Show the previous totals");

                // user input
                System.out.print("Input your choice here: ");
                int show_choice = scanner.nextInt();
                System.out.println(" ");

                // show total
                if (show_choice == 1){
                    // outputs the total to the user
                    calc.print();
                } 

                // show previous totals
                else if (show_choice == 2){
                    // outputs all of the previous totals stored in the list to the user
                    calc.show_totals();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // clear 
            else if (choice == 11){
                // menu for the options to clear
                System.out.println("Choose what you would like to do from the options below:");
                System.out.println("1. Clear the total");
                System.out.println("2. Clear the previous totals");

                // user input
                System.out.print("Input your choice here: ");
                int clear_choice = scanner.nextInt();
                System.out.println(" ");

                // clear total
                if (clear_choice == 1){
                    // resets the total to zero and outputs it to the user
                    calc.clear();
                    calc.print();
                }

                // clear previous totals
                else if (clear_choice == 2){
                    // clears the list of previous totals and outputs it to the user
                    calc.clear_totals();
                    calc.show_totals();
                }

                // invalid option
                else {
                    // basic error message with the user being redirected to the main menu to try again
                    System.out.println("Incorrect option, please try again.");
                }
            }

            // invalid
            else{
                // basic error message with the user being redirected to the main menu to try again
                System.out.println("Incorrect option, please try again.");
            }

        }
        /* 
        closes the scanner, which is used to read input fro the user, 
        to avoid memory leaks 
        */
        scanner.close();
    }
}
