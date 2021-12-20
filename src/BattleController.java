import java.util.Scanner;

public class BattleController {


    void battle(Room room){
        while(room.containsCharacter("monster")){
            Scanner scanner = new Scanner(System.in);
            Player player = (Player) room.getCharacter("player");
            Monster monster = (Monster) room.getCharacter("monster");

            System.out.println("You are battling a " + monster.getName());
            System.out.println("1. Check your stats");
            System.out.println("2. Check monster stats");
            System.out.println("3. Fight");

            String choice = scanner.nextLine();
            switch (choice) {
                case ("1") -> System.out.println("Health: " + player.getHealth() + " \nAttack: " + player.getAttackStat() + " \nArmor: " + player.getArmorStat());
                case ("2") -> System.out.println("Health: " + monster.getHealth() + " \nAttack: " + monster.getAttackStat() + " \nArmor: " + monster.getArmorStat());
                case ("3") -> {
                    player.attack(monster);
                    System.out.println(player.getName() + " dealt " + player.getAttackStat() + " damage to " + monster.getName());
                    monster.attack(player);
                    System.out.println(monster.getName() + " dealt " + monster.getAttackStat() + " damage to " + player.getName());
                }
            }
            if(player.isDead()){
                System.out.println("You lose");
            }
            else if(monster.isDead()){
                System.out.println(monster.getName() + " has been defeated!");
                room.removeCharacter(monster);
            }
        }
    }
}
