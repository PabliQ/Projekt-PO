public abstract class Unit {


    protected int hP;
    protected int lvl;
    protected int atk;
    protected int def;
    protected int price;
    protected int id;

    public abstract void attack(Simulation sim, Battlefield field, int fieldSize, boolean done); 
    public abstract void move(Battlefield field, int fieldsize);}