public class Character {

    private String name;
    private int health;
    private int attackStat;
    private int armorStat;

    Character(String name, int health, int attackStat, int armorStat){
        this.name = name;
        this.health = health;
        this.attackStat = attackStat;
        this.armorStat = armorStat;
    }

    void attack(Character character){
        character.setHealth(character.getHealth() - attackStat);
    }



    void getHurt(){

    }

    boolean isDead(){
        return health <= 0;

    }

    String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackStat(){
        return attackStat;
    }

    public int getArmorStat(){
        return armorStat;
    }

    private void setHealth(int set) {
        health = set;
    }
}
