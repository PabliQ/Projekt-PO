public class Elf extends Unit {

    public Elf(int level, int setId)
    {
        if(level==1)
        {
            this.atk = 3;
            this.def=3;
            this.lvl=1;
            this.price=40;
            this.hP=110;
        }
        if(level==2){
            this.atk=5;
            this.lvl=2;
            this.price=65;
            this.hP=170;
        }
        if(level==3){
            this.atk=6;
            this.lvl=3;
            this.def=7;
            this.price=100;
            this.hP=210;
        }
        this.id=setId;
    }

    @Override
    public void move(){

    }

    @Override
    public void attack(Unit){


    }
}
