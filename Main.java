import java.util.concurrent.TimeUnit;
	public class Main {
	    public static void main(String[] args) {
	        int ilosc;
	        Simulation sim = new Simulation();
	        sim.chooseAmountOfGold();
	        sim.chooseRace();
	        sim.rollEnemyRace();
	        for (int i = 1; i <= 3; i++) {
	            ilosc = sim.allyGold.chooseNumberOfUnits(i);
	            sim.allyGold.buyUnits(i, ilosc, sim.alliedUnits, sim.alliedRace);
	        }
	        sim.enemyGold.chooseEnemyUnitsRandomly();


	        sim.battlefield.placeAllyUnits();
	        sim.battlefield.placeEnemyUnits();
	        sim.battlefield.show(15);
	        int turnCounter = 0;
	        while(sim.alliedUnits.size()>0 && sim.enemyUnits.size()>0 && turnCounter < 500){
	            for(int i=0;i<sim.alliedUnits.size();i++){
	                boolean temp = sim.alliedUnits.get(i).attack(sim, sim.battlefield, 15);
	                if (temp == false) sim.alliedUnits.get(i).move(sim.battlefield, 15);
	            }
	            System.out.print("Przeciwnicy: ");
	            for(int i=0;i<sim.enemyUnits.size();i++){
	                //sim.enemyUnits.get(i).move(sim.battlefield, 15);
	                sim.enemyUnits.get(i).attack(sim, sim.battlefield, 15);
	                System.out.print(" id: " + sim.enemyUnits.get(i).id +" hp: " + sim.enemyUnits.get(i).hP);
	            }
	            System.out.println();
	            System.out.print("Sojusznicy: ");
	            for(int i=0;i<sim.alliedUnits.size();i++){
	                System.out.print(" id: " + sim.alliedUnits.get(i).id +" hp: " + sim.alliedUnits.get(i).hP);
	            }
	            System.out.println();
	            sim.battlefield.show(15);
	            turnCounter++;
	            if (turnCounter == 500) System.out.println("Przekroczono limit tur, remis");
	        }
	    }
	}
