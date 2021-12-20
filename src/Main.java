import java.util.Dictionary;
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
        BattleController battleController = new BattleController();


        while(setupLoop) {

            System.out.println("Welcome to textadventure! Press z to continue");

            String choice = scanner.nextLine();

            if (Objects.equals(choice, "z")) {
                System.out.println("Choose a name: ");

                String name = scanner.nextLine();

                int playerHealth = 10;
                int playerAttackStat = 2;
                int playerArmorStat = 0;

                player = new Player(name, playerHealth, playerAttackStat, playerArmorStat);

                System.out.println("Your character has been created");

                setupLoop = false;

            } else {
                System.out.println("Try Again");
            }
        }

        map.placePlayer(player);



        while(gameLoop){




            System.out.println("what will you do?");
            System.out.println("1. Check map");
            System.out.println("2. Move");

            String choice = scanner.nextLine();

            switch (choice) {
                case ("1") -> map.showMap();
                case ("2") -> {
                    System.out.println("Which direction? Up, Right, Down or Left");
                    String direction = scanner.nextLine();
                    int horizontal = 0;
                    int vertical = 0;
                    if (Objects.equals(direction, "Up")) {
                        horizontal = -1;
                    } else if (Objects.equals(direction, "Down")) {
                        horizontal = 1;
                    } else if (Objects.equals(direction, "Left")) {
                        vertical = -1;
                    } else if (Objects.equals(direction, "Right")) {
                        vertical = 1;
                    }
                    map.moveToRoom(player, horizontal, vertical);
                    if (map.roomContainsMonster()) {
                        battleController.battle(map.getPlayerRoom());
                    }
                }
            }
        }
    }

}
