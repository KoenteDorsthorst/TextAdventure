import java.util.ArrayList;
import java.util.Objects;

public class Room {

    ArrayList<Character> characters = new ArrayList<>();


    void addCharacter(Character character){
        characters.add(character);
    }

    boolean containsCharacter(String characterType){
        for(Character character : characters){
            if(Objects.equals(characterType, "player")) {
                if (character instanceof Player) {
                    return true;
                }
            }
            if(Objects.equals(characterType, "monster")){
                if(character instanceof  Monster){
                    return true;
                }
            }
        }
        return false;
    }

    Character getCharacter(String characterType){
        for(Character character : characters){
            if(Objects.equals(characterType, "player")) {
                if (character instanceof Player) {
                    return character;
                }
            }
            if(Objects.equals(characterType, "monster")){
                if(character instanceof  Monster){
                    return character;
                }
            }
        }
        return null;
    }

    void removeCharacter(Character removableCharacter){
        characters.removeIf(character -> character == removableCharacter);
    }

    void enteredRoom(){
        Monster monster = null;
        for(Character character : characters){
            if(character instanceof Monster){
                monster = (Monster) character;
            }
        }

        if(monster != null){
            System.out.println("Room contains Monster " + monster.getName());
        }
    }
}
