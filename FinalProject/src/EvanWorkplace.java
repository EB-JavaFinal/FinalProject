import java.util.Scanner;

public class EvanWorkplace {

    public static void main(String[] args){
    	
    	String playerRace = "empty";
    	int [] playerStats = {10, 10, 10, 10, 10, 10};

        pickRace(playerRace, playerStats);
        pickClass();
        pickStats(playerStats);
    }

    public static void pickRace(String playerRace, int playerStats[]){


        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick your characters race. >>>"
            		+"\nDwarf +2 Constitution, +2, Wisdom, -2 Charisma."
                    + "\nElf +2 Dexterity, +2 Intelligence, -2 Constitution."
                    + "\nGnome +2 Constitution, +2 Charisma, -2 Strength."
                    + "\nHalf-Elf +2 Any Stat."
                    + "\nHalfling +2 Dexterity, +2 Charisma, -2 Strength."
                    + "\nHalf-Orc +2 Any Stat."
                    + "\nHuman +2 Any Stat.");
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
            else if(playerRace.equalsIgnoreCase("Gnome")) {
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
            	System.out.println("Your entry was invalid");
            }

        }while(playerRace == "empty");

    }

    public static void pickClass(){

    }

    public static void pickStats(int playerStats[]){
    	
    	For(int i = 0; i < 6; I++){
    		
    	}

    }

    public static void pickRacialBonus(int playerStats[]){
    	
    	Scanner input = new Scanner(System.in);
    	String playerChoice;
    	
    	System.out.println("Pick the stat you'd like improved "
    			+ "\nStrength"
    			+ "\nDexterity"
    			+ "\nConstitution"
    			+ "\nIntelligence"
    			+ "\nWisdom"
    			+ "\nCharisma");
    	playerChoice = input.next();
    	
    	if(playerChoice.equalsIgnoreCase("strength")) {
        	playerStats[0] = playerStats[0] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("dexterity")) {
        	playerStats[1] = playerStats[1] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("constitution")) {
        	playerStats[2] = playerStats[2] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("intelligence")) {
        	playerStats[3] = playerStats[3] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("wisdom")) {
        	playerStats[4] = playerStats[4] + 2;
        }
    	else if(playerChoice.equalsIgnoreCase("charisma")) {
        	playerStats[5] = playerStats[5] + 2;
        }
    }
}
