import java.lang.reflect.Array;
import java.util.*;
import java.lang.String;

public class Simulation {

    static ArrayList<Unit> alliedUnits = new ArrayList<>();
    static ArrayList<Unit> enemyUnits = new ArrayList<>();
    public static String alliedRace = new String();
    public static String enemyRace = new String();
    static String[] races = new String[]{"Human", "Dwarf", "Elf", "Orc"};
    public Gold allyGold = new Gold();
    public Gold enemyGold = new Gold();
    Random generator = new Random();
    public Scanner scan = new Scanner(System.in);


    public void chooseRace() {
        int wybor;
        System.out.println("Wybierz rase:" +
                "1. Human" +
                "2. Dwarf" +
                "3. Elf" +
                "4. Orc");{
            wybor = scan.nextInt();
            alliedRace=races[wybor];
        }
    }


    public void rollEnemyRace() {
        int losowa;
        losowa= generator.nextInt(4);
        enemyRace=races[losowa];
        }


    public void chooseAmountOfGold(int goldAmount) {
        System.out.println("Podaj ilość złota dostępną do wydania na jednostki: ");
        goldAmount = scan.nextInt();
        enemyGold.gold = goldAmount;
        allyGold.gold = goldAmount;
    }
}