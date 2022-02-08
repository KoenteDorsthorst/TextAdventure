package Classes;

import Classes.Character;
import Classes.Inventory;
import Classes.Item;

public class Player extends Character {

    Item weapon;
    Item armor;
    Inventory inventory;

    public Player(String name, int health, int attackStat, int armorStat){
        super(name, health, attackStat, armorStat);
    }


}
