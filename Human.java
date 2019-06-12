public class Human extends Unit {

	public Human (int level, int setId) {
		if (level == 1) {
			this.atk = 12;
			this.def = 3;
			this.lvl = 1;
			this.price = 40;
			this.hP = 270;
		}
		if (level == 2) {
			this.atk = 16;
			this.lvl = 2;
			this.def = 4;
			this.price = 65;
			this.hP = 370;
		}
		if (level == 3) {
			this.atk = 22;
			this.lvl = 3;
			this.def = 6;
			this.price = 100;
			this.hP = 470;
		}
		this.id = setId;
	}

	@Override
	public void move(Battlefield field, int fieldsize) {
		Point location = field.getLocation(fieldsize, this.id);
		boolean done = false;
		if (this.id % 2 == 0) {
			if (location.y == 0 && field.field[location.x][fieldsize -1] == 0) {
				field.field[location.x][location.y] = 0;
				field.field[location.x][fieldsize -1] = this.id;
				done = true;
			}
			if (done == false) {
				if (field.field[location.x][location.y - 1] == 0) {
					field.field[location.x][location.y] = 0;
					field.field[location.x][location.y - 1] = id;
					done = true;
				}
			}
		}
		if (this.id % 2 != 0) {
			if (location.y == fieldsize - 1 && field.field[location.x][0] == 0) {
				field.field[location.x][location.y] = 0;
				field.field[location.x][0] = this.id;
				done = true;
			}
			if (done == false) {
				if (field.field[location.x][location.y + 1] == 0) {
					field.field[location.x][location.y] = 0;
					field.field[location.x][location.y + 1] = id;
					done = true;
				}
			}
		}
	}

		@Override
		public void attack(Simulation sim, Battlefield field, int fieldSize, boolean done) {
		Point myLocation = field.getLocation(fieldSize, this.id);
		Point enemyLocation = new Point();
		done = false;
		for (int tempX = -1 ; tempX <= 1; tempX++) {
			for (int tempY = -1; tempY <= 1; tempY++) {
				if (tempX != 0 && tempY != 0 && myLocation.x + tempX >= 0 && myLocation.x + tempX < fieldSize && myLocation.y + tempY >= 0 && myLocation.y + tempY < fieldSize) {
					if (field.field[myLocation.x + tempX][myLocation.y + tempY] != 0 ) {
						enemyLocation.x = myLocation.x + tempX;
						enemyLocation.y = myLocation.y + tempY;
						int enemyID = field.getID(enemyLocation);
						if ( (field.getID(myLocation) - enemyID) % 2 != 0) {
							if (this.id % 2 == 0) {
								int i = 0;
								for (Unit tempUnit : sim.enemyUnits) {
									if (tempUnit.id == enemyID) {
										break;
									}
									i++;
								}
								sim.enemyUnits.get(i).hP -= (this.atk - sim.enemyUnits.get(i).def);
								done = true;
								if (sim.enemyUnits.get(i).hP <= 0 ) {
									sim.enemyUnits.remove(i);
									field.field[enemyLocation.x][enemyLocation.y] = 0;
								}
							}
							else if (this.id % 2 != 0) {
								int i = 0;
								for (Unit tempUnit : sim.alliedUnits) {
									if (tempUnit.id == enemyID) {
										break;
									}
									i++;
								}
								sim.alliedUnits.get(i).hP -= (this.atk - sim.alliedUnits.get(i).def);
								done = true;
								if (sim.alliedUnits.get(i).hP <= 0 ) {
									sim.alliedUnits.remove(i);
									field.field[enemyLocation.x][enemyLocation.y] = 0;
								}
							}
						}
					}
				}
				if (done) break;
			}
			if (done) break;
		}
	}
}

