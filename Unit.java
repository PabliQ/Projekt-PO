public abstract class Unit {


    protected int hP;
    protected int lvl;
    protected int atk;
    protected int def;
    protected int price;
    protected int id;

    public abstract boolean attack(Simulation sim, Battlefield field, int fieldSize); //za Battlefield field wstawiac sim.battlefield, za fieldsize 50
    public abstract void move(Battlefield field, int fieldsize);
}