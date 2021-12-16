public class Player extends Character{

    Item weapon;
    Item armor;
    Inventory inventory;

    Player(String name, int health, int attackStat, int armorStat){
        super(name, health, attackStat, armorStat);
    }


}
