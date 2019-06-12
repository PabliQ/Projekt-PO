import java.io.Console;

public class Battlefield {

	int field[][];
	
	public Battlefield(int size){
		this.field = new int[size][size]; 
		// jezeli pole w tablicy wynosi 0 to reprezuntuje puste miejsce
	}
	
	public Point getLocation (int size ,int id) {
		Point point = new Point();
		int temp = 0;
		for (int i = 0; i<size ; i++)
		{
			for (int j = 0; j<size; j++)
			{
				if (this.field[i][j] == id) 
				{
					point.x = i;
					point.y = j;
					temp = j;
					break;
				}
			}
			if (this.field[i][temp] == id) break;
		}
		return point;
	}
	
	public int getID (Point point ) {
		return this.field[point.x][point.y];
	}

	public void placeAllyUnits(){
		int j = 14;
		for(int i=0; i<Simulation.alliedUnits.size();i++){
			field[j][i%15]=Simulation.alliedUnits.get(i).id;
			if(i%15==14){
				j--;
			}
	}}


	public void placeEnemyUnits(Simulation sim){
		int j = 0;
		for(int i=0; i<sim.enemyUnits.size();i++){
			field[j][i%15]=sim.enemyUnits.get(i).id;
			if(i%15==14)
				j++;
		}
	}
	
	
	
	public void show (int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(this.field[i][j] + " "); 
			}
			System.out.println();
		}
	}
}

