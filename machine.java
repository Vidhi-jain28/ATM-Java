package atm;
import java.io.IOException;
public class machine {
    
        public static void main (String[] args) throws IOException{
            option optionMenu = new option();
            introduction();
            optionMenu.mainMenu();
        }
    
        public static void introduction() {
            System.out.println("Welcome to the ATM Project!");
        }
    }
