public class Human extends Unit {

    public Human (int level, int setId)
    {
        if(level==1)
        {
            this.atk = 4;
            this.def=4;
            this.lvl=1;
            this.price=40;
            this.hP=140;
        }
        if(level==2){
            this.atk=6;
            this.lvl=2;
            this.def=6;
            this.price=65;
            this.hP=200;
        }
        if(level==3){
            this.atk=8;
            this.lvl=3;
            this.def=8;
            this.price=100;
            this.hP=240;
        }
        this.id=setId;


    @Override
    public void move(){

    }

    @Override
    public void attack(Unit){


    }
}
