import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Player player = null;
        int mapWidth = 4;
        int mapHeight = 5;
        Map map = new Map(mapWidth, mapHeight);
        boolean setupLoop = true;
        boolean gameLoop = true;


        while(setupLoop) {

            System.out.println("Welcome to textadventure! Press z to continue");

            String choice = scanner.nextLine();

            if (Objects.equals(choice, "z")) {
                System.out.println("Choose a name: ");

                String name = scanner.nextLine();

                int playerHealth = 3;
                int playerAttackStat = 1;
                int playerArmorStat = 0;

                player = new Player(name, playerHealth, playerAttackStat, playerArmorStat);

                System.out.println("Your character has been created");

                setupLoop = false;

            } else {
                System.out.println("Try Again");
            }
        }


        map.moveToRoom(player);

        while(gameLoop){

            System.out.println("what will you do?");
            System.out.println("1. Check map");
            System.out.println("2. Move");

            String choice = scanner.nextLine();

            switch (choice) {
                case ("1") -> map.showMap();
                case ("2") -> System.out.println(player.getName());
            }


        }

    }
}
