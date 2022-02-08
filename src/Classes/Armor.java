package Classes;

public class Armor extends Item {

    private int armorStat;

    Armor(String name, int armorStat){
        super(name);
        this.armorStat = armorStat;
    }
}
