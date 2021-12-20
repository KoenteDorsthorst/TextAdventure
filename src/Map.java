import java.util.Random;

public class Map {

    int mapWidth;
    int mapHeight;
    Room[][] rooms;

    Map(int mapWidth, int mapHeight){
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.rooms = createRooms(mapWidth, mapHeight);
    }


    void placePlayer(Character character){
        rooms[1][1].addCharacter(character);
    }


    Room[][] createRooms(int width, int height){
        Room[][] rooms = new Room[height][width];
        for(int i = 0; i < height; i++){
            for(int n = 0; n < width; n++){
                rooms[i][n] = new Room();
                Random rand = new Random();
                int randomNumber = rand.nextInt(2);
                if(randomNumber == 0){
                    Monster monster = new Monster("Ghoul", 3, 1, 0);
                    rooms[i][n].addCharacter(monster);
                }
            }
        }
        return rooms;
    }

//Shows the map
    void showMap(){
        for(int i = 0; i < mapHeight; i++){
            StringBuilder string1 = new StringBuilder();
            StringBuilder string2 = new StringBuilder();
            for(int n = 0; n < mapWidth; n++) {
                string1.append("|---");
                if(rooms[i][n].containsCharacter("player")){
                    string2.append("| X ");
                }
                else {
                    string2.append("|   ");
                }
            }
            System.out.println(string1 + "|");
            System.out.println(string2 + "|");
            if(i >= mapHeight - 1){
                System.out.println(string1 + "|");
            }
        }
    }

    void moveToRoom(Character character, int horizontal, int vertical){
        Room playerRoom = getPlayerRoom();
        int[] index = getRoomIndex(playerRoom);
        rooms[index[0] + horizontal][index[1] + vertical].addCharacter(character);
        rooms[index[0] + horizontal][index[1] + vertical].enteredRoom();
        rooms[index[0]][index[1]].removeCharacter(character);

    }

    Room getPlayerRoom(){
        for (Room[] roomList : rooms) {
            for (Room room : roomList) {
                if (room.containsCharacter("player")) {
                    return room;
                }
            }
        }
        return null;
    }

    int[] getRoomIndex(Room room){
        for (int i = 0; i < rooms.length; i++) {
            for (int n = 0; n < rooms[i].length; n++) {
                if (rooms[i][n] == room) {
                    return new int[]{i, n};
                }
            }
        }
        return null;
    }

    public boolean roomContainsMonster() {
        Room playerRoom = getPlayerRoom();
        int[] currentRoomIndex = getRoomIndex(playerRoom);
        return rooms[currentRoomIndex[0]][currentRoomIndex[1]].containsCharacter("monster");
    }
}
