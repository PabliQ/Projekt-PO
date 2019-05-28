import java.util.*

public class Simulation {
    Unit[] alliedUnits = new Unit[];
    Unit[] enemyUnits = new Unit[];
    String alliedRace = new String;
    String enemyRace = new String;

    public void start(){

    }

    public void chooseRace(){

    }

    public void chooseEnemyRace(){


    }

    public void rollEnemyRace(){


    }

    public void chooseAmountOfGold(int goldAmount){
        Scanner scan = new Scanner(System.in)
        System.out.println("Podaj ilość złota dostępną do wydania na jednostki: ");
        goldAmount = scan.nextInt();
        Gold allyGold = new Gold;
        Gold enemyGold = new Gold;
        enemyGold.gold=goldAmount;
        allyGold.gold=goldAmount;
    }

    public static void main(String[] args) {


    }
}
