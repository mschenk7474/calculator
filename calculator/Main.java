package calculator;

public class Main {
    /*
     This class is the main class where the program starts and runs from.
     All of the necessary actions of this program can be found in the
     menu class, so we create an object of the menu class, and just call
     the method for which the actual menu resides in.
     */
    public static void main(String[] args) {
        // menu object intialized and menu method called
        Menu main_menu = new Menu();
        main_menu.menu();
        
    }
}
