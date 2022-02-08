# TextAdventure

## What is this project?

TextAdventure is a text base game. In the game you play as a character. A character has a weapon, armor, a map, an inventory and stats. The character can move around on a map. A map exists of tiles. Tiles contain monsters or chests. If a character enters a tile and finds a monster, the character must fight it. Characters can fight monster with turn based combat. When a character defeats a monster, the character obtains loot. If a character enters a tile and finds a chest, the character must open it. A chest contains loot.




## Concepts

### Classes.Character
A character has a name, an amount of health, an attack stat and an armor stat. 
A character can attack, get hurt and die.

### Classes.Player
A player is a character. A player has a weapon, armor and a inventory. 
A player can walk, check stats and open their inventory.

### Classes.Monster
A monster is a character. A monster has a drop table.
A monster can drop loot.





### Classes.Map
A map contains rooms and characters



### Classes.Room
A room contains characters



### Classes.Item
An item has a name

### Classes.Weapon
A weapon is an item. A weapon has an attack stat.

### Classes.Armor
An armor is an item. An armor has an armor stat.




### Classes.Inventory
An inventory has an inventory size and items






