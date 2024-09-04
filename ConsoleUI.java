
import java.util.Scanner;

public class ConsoleUI {
    Scanner input = new Scanner(System.in);

    public void Menu(){
        System.out.println("Menu!");

        int option = input.nextInt();
        System.out.println(option);



    while(true){
        switch (option) {
            case 1:
                System.out.println("Choix 1!");
            case 2:
                System.out.println("Choix 2!");
                break;
            case 6:
                System.out.println("exit 4!");
                break;
            default:
                break;
        }
    }

    }
    

}
