import java.util.ArrayList;

public class Room {

    ArrayList<Character> characters = new ArrayList<>();


    void addCharacter(Character character){
        characters.add(character);
    }

    boolean containsPlayer(){
        for(Character character : characters){
            if(character instanceof Player){
                return true;
            }
        }
        return false;
    }
}
