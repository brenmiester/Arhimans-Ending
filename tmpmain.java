import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your character's name? ");
        String name = userInputScanner.nextLine();
        System.out.println(name + ", welcome to the world of Charjeng. This world is inhabited by 4 main people...");
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
        if (breed = "Mage") {
          System.out.println("Great choice. You are now a mage.")
        }
    }
}
