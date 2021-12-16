public class Map {

    int mapWidth;
    int mapHeight;
    Room[][] rooms;

    Map(int mapWidth, int mapHeight){
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.rooms = createRooms(mapWidth, mapHeight);
    }



    Room[][] createRooms(int width, int height){
        Room[][] rooms = new Room[height][width];
        for(int i = 0; i < height; i++){
            for(int n = 0; n < width; n++){
                rooms[i][n] = new Room();
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
                if(rooms[i][n].containsPlayer()){
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

    void moveToRoom(Character character){
        rooms[1][1].addCharacter(character);
    }
}
