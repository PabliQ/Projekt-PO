public class Dwarf extends Unit {

    public Dwarf(){};

    public Dwarf (int level, int setId)
    {
        if(level==1)
        {
            this.atk = 4;
            this.def=6;
            this.lvl=1;
            this.price=40;
            this.hP=160;
        }
        if(level==2){
            this.atk=6;
            this.lvl=2;
            this.def=9;
            this.price=65;
            this.hP=210;
        }
        if(level==3){
            this.atk=8;
            this.lvl=3;
            this.def=11;
            this.price=100;
            this.hP=270;
        }
        this.id=setId;
    }

    @Override
    public void move(){

    }

    @Override
    public void attack(){

    }
}
