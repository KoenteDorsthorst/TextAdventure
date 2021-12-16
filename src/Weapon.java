public class Weapon extends Item{

    private int attackStat;

    Weapon(String name, int attackStat){
        super(name);
        this.attackStat = attackStat;
    }
}
