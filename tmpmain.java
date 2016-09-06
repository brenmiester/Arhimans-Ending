import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your character's name? ");
        String name = userInputScanner.nextLine();
        System.out.println(name + ", welcome to the world of Charjeng. This world is inhabited by 4 main classes of people...");
        System.out.println("The Mage");
        System.out.println("The mage uses magic and intelligence to solve problems. They are not very strong, but are quite cunning.");
        System.out.println("The Warrior");
        System.out.println("The warrior uses brute force to attack their enemies, and as of such is very strong, but not precise");
        System.out.println("The Archer");
        System.out.println("The archer uses their bow and arrow to make their enemies buckle with fear.");
        System.out.println("The Monk");
        System.out.println("The monk has trained their entire life to master the art of Goju-Ryu, and can split a door with a single punch.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("So, " + name + ", who will you be?");
        System.out.println("Mage, Warrior, Archer or Monk?");
        String breed = userInputScanner.nextLine();
        if (String breed = "Mage") {
          System.out.println("Great choice. You are now a mage.");
          int health = 20;
          int maxhealth = 40;
          int rawattack = 10;
          int attackrate = 1;
        }
        if (String breed = "Warrior") {
          System.out.println("Great choice. You are now a Warrior.");
          int health = 30;
          int maxhealth = 60;
          int rawattack = 15;
          int attackrate = 2;
        }
        if (String breed = "Archer") {
          System.out.println("Great choice. You are now a Archer.");
          int health = 25;
          int maxhealth = 50;
          int rawattack = 15;
          int attackrate = 2;
        }
        if (String breed = "Monk") {
          System.out.println("Great choice. You are now a Monk.");
          int health = 20;
          int maxhealth = 40;
          int rawattack = 20;
          int attackrate = 2;
        }
        else {
            System.out.println("Error getting class. Check lines 23-44 or entry");
            break;
        }
        System.out.println("Your current health is " + health);
        System.out.println("Your max health is " + maxhealth);
        System.out.println("Your raw attack is " + rawattack);
        System.out.println("Your hit rate is " + attackrate + "%");
    }
}
