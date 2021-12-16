import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to textadventure! Press z to continue");

        String choice = scanner.nextLine();

        if(Objects.equals(choice, "z")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
