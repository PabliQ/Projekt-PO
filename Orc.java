public class Orc extends Unit {


    public Orc (int level , int setId)
    {
        if(level==1)
        {
            this.atk = 5;
            this.def=3;
            this.lvl=1;
            this.price=40;
            this.hP=120;
        }
        if(level==2){
            this.atk=8;
            this.lvl=2;
            this.def=4;
            this.price=65;
            this.hP=180;
        }
        if(level==3){
            this.atk=12;
            this.lvl=3;
            this.def=5;
            this.price=100;
            this.hP=250;
        }
        this.id=setId;
    }


    @Override
    public void attack(){


    }

    @Override
    public void move(){

    }
}
