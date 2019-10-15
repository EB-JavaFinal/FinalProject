import java.util.Scanner;

public class EvanWorkplace {

    public static void main/*characterCreation*/(String[] args){
    	
    	String playerRace = "empty";
    	String playerClass = "empty";
    	int [] playerStats = {10, 10, 10, 10, 10, 10};

        pickRace(playerRace, playerStats);
        pickClass(playerClass);
        pickStats(playerStats);
        
        System.out.println("Race: " + playerRace);
        System.out.println("class: " + playerClass);
        System.out.println("Race: " + playerRace);
    }

    public static void pickRace(String playerRace, int playerStats[]){


        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick your characters race. >>>"
            		+ "\nDwarf: +2 Constitution, +2, Wisdom, -2 Charisma."
                    + "\nElf: +2 Dexterity, +2 Intelligence, -2 Constitution."
                    + "\nGnome: +2 Constitution, +2 Charisma, -2 Strength."
                    + "\nHalf-Elf: +2 Any Stat."
                    + "\nHalfling: +2 Dexterity, +2 Charisma, -2 Strength."
                    + "\nHalf-Orc: +2 Any Stat."
                    + "\nHuman: +2 Any Stat.");
            playerRace = input.next();
            
            if(playerRace.equalsIgnoreCase("dwarf")) {
            	playerRace = "Dwarf";
            	playerStats[2] = playerStats[2] + 2;
            	playerStats[4] = playerStats[4] + 2;
            	playerStats[5] = playerStats[5] - 2;
            }
            else if(playerRace.equalsIgnoreCase("elf")) {
            	playerRace = "Elf";
            	playerStats[1] = playerStats[1] + 2;
            	playerStats[3] = playerStats[3] + 2;
            	playerStats[2] = playerStats[2] - 2;
            }
            else if(playerRace.equalsIgnoreCase("gnome")) {
            	playerRace = "Gnome";
            	playerStats[2] = playerStats[2] + 2;
            	playerStats[5] = playerStats[5] + 2;
            	playerStats[0] = playerStats[0] - 2;
            }
            else if(playerRace.equalsIgnoreCase("half-elf")) {
            	playerRace = "Half-Elf";
            	pickRacialBonus(playerStats);
            }
            else if(playerRace.equalsIgnoreCase("halfling")) {
            	playerRace = "Halfling";
            	playerStats[1] = playerStats[1] + 2;
            	playerStats[5] = playerStats[5] + 2;
            	playerStats[0] = playerStats[0] - 2;
            }
            else if(playerRace.equalsIgnoreCase("half-orc")) {
            	playerRace = "Half-Orc";
            	pickRacialBonus(playerStats);
            }
            else if(playerRace.equalsIgnoreCase("human")) {
            	playerRace = "Human";
            	pickRacialBonus(playerStats);
            }
            else
            {
            	playerRace = "empty";
            	System.out.println("Invalid entry, Please try again");
            }

        }while(playerRace == "empty");
return;
    }

    public static void pickClass(String playerClass){
    	
    	Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick your characters Class. >>>"
            		+ "\nBarbarian:"
                    + "\nBard: "
                    + "\nCleric:"
                    + "\nFighter:"
                    + "\nMonk:"
                    + "\nPaladin:"
                    + "\nRouge:"
            		+ "\nSorcerer:"
            		+ "\nWizard:");
            playerClass = input.next();
            
            if(playerClass.equalsIgnoreCase("barbarian")) {
            	playerClass = "Barbarian";
            }
            else if(playerClass.equalsIgnoreCase("bard")) {
            	playerClass = "Bard";
            }
            else if(playerClass.equalsIgnoreCase("cleric")) {
            	playerClass = "Cleric";
            }
            else if(playerClass.equalsIgnoreCase("fighter")) {
            	playerClass = "Fighter";
            }
            else if(playerClass.equalsIgnoreCase("monk")) {
            	playerClass = "Monk";
            }
            else if(playerClass.equalsIgnoreCase("paladin")) {
            	playerClass = "Paladin";
            }
            else if(playerClass.equalsIgnoreCase("rouge")) {
            	playerClass = "Rouge";
            }
            else if(playerClass.equalsIgnoreCase("sorcerer")) {
            	playerClass = "Sorcerer";
            }
            else if(playerClass.equalsIgnoreCase("wizard")) {
            	playerClass = "Wizard";
            }
            else {
            	System.out.println("Invalid entry, Please try again");
            	playerClass = "empty";
            }

    }while(playerClass == "empty");
        
    }

    public static void pickStats(int playerStats[]){
    	
    	System.out.println("");
    	

    }

    public static void pickRacialBonus(int playerStats[]){
    	
    	Scanner input = new Scanner(System.in);
    	String playerChoice = "empty";
    	
    	do {
    	System.out.println("Pick the stat you'd like improved "
    			+ "\nStrength"
    			+ "\nDexterity"
    			+ "\nConstitution"
    			+ "\nIntelligence"
    			+ "\nWisdom"
    			+ "\nCharisma");
    	playerChoice = input.next();
    	
    	if(playerChoice.equalsIgnoreCase("strength") || playerChoice.equalsIgnoreCase("str")) {
        	playerStats[0] = playerStats[0] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("dexterity") || playerChoice.equalsIgnoreCase("dex")) {
        	playerStats[1] = playerStats[1] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("constitution") || playerChoice.equalsIgnoreCase("con")) {
        	playerStats[2] = playerStats[2] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("intelligence") || playerChoice.equalsIgnoreCase("int")) {
        	playerStats[3] = playerStats[3] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("wisdom") || playerChoice.equalsIgnoreCase("wis")) {
        	playerStats[4] = playerStats[4] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("charisma") || playerChoice.equalsIgnoreCase("cha")) {
        	playerStats[5] = playerStats[5] + 2;
        }
    	else {
    		System.out.println("Invalid entry, Please try again");
    		playerChoice = "empty";
    	}
    }while(playerChoice == "empty");
}
}