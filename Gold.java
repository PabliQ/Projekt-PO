import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gold {
    int gold;
    private Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    public int chooseNumberOfUnits(int lvl){
        int price=0;
        if (lvl == 1) {
            price = 40;
        }
        if (lvl == 2) {
            price = 65;
        }
        if (lvl == 3) {
            price = 100;
        }
        System.out.println("Twoje zloto to:" + gold);
        System.out.println("Cena jednostki to:" + price);
        int ilosc = scan.nextInt();
        while (ilosc * price > gold) {
            System.out.println("Nie posiadasz tyle złota" +
                    "Podaj mniejszą liczbę jednostek");
            ilosc = scan.nextInt();
        }
        return ilosc;
    }

    public void buyUnits(int lvl,int number,ArrayList<Unit> army ,String race) {
        int price=0;
        if (lvl == 1) {
            price = 40;
        }
        if (lvl == 2) {
            price = 65;
        }
        if (lvl == 3) {
            price = 100;
        }

        gold -= number * price;
        switch (race) {
            case "Elf":
                if(army==Simulation.alliedUnits){
                    for (int i = 1; i <= number; i++) {
                        army.add(new Elf(lvl,2*i));
                        }
                }
                else{
                    for(int i=1; i <= number; i++){
                    army.add(new Elf(lvl, 2*i-1));}
                }
                break;
            case "Dwarf":
                if(army==Simulation.alliedUnits){
                    for (int i = 1; i <= number; i++) {
                        army.add(new Dwarf(lvl,i*2));
                    }
                }
                else{
                    for(int i=1; i <= number; i++){
                        army.add(new Dwarf(lvl, 2*i-1));}
                }
                break;
            case "Human":
                if(army==Simulation.alliedUnits){
                    for (int i = 1; i <= number; i++) {
                        army.add(new Human(lvl,i*2));
                    }
                }
                else{
                    for(int i=1; i <= number; i++){
                        army.add(new Human(lvl, 2*i-1));}
                }
                break;
            case "Orc":
                if(army==Simulation.alliedUnits){
                    for (int i = 1; i <= number; i++) {
                        army.add(new Orc(lvl,i*2));
                    }
                }
                else{
                    for(int i=1; i <= number; i++){
                        army.add(new Orc(lvl, 2*i-1));}
                }
                break;
        }
    }
    public void chooseEnemyUnitsRandomly () {
       int maksIlosc;
       for(int i=1;i<=3;i++){
           if(i==1){
               maksIlosc=(gold-(gold%40))/40;
               int ilosc = generator.nextInt(maksIlosc);
               buyUnits(i,ilosc,Simulation.enemyUnits,Simulation.enemyRace);
           }
           if(i==2){
               maksIlosc=(gold-(gold%65))/65;
               int ilosc = generator.nextInt(maksIlosc);
               buyUnits(i,ilosc,Simulation.enemyUnits,Simulation.enemyRace);
           }
           else{
               maksIlosc=(gold-(gold%100))/100;
               buyUnits(i,maksIlosc,Simulation.enemyUnits,Simulation.enemyRace);
           }
       }
    }
}
