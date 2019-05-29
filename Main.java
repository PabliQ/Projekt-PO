public class Main {

    public static void main (String[]args){

    Simulation bitwa = new Simulation();
    bitwa.allyGold.gold=1000;
    bitwa.alliedRace="Elf";
    bitwa.allyGold.buyUnits(1,bitwa.alliedUnits,bitwa.alliedRace);
    bitwa.chooseRace(Simulation.enemyRace);
    }
}

