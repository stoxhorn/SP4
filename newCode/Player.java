import java.util.Scanner;

public class Player extends Person {


    private int studyPoints;
    private int energyLevel;
    private int maxEnergyLevel;
    private int coffee;
    private Backpack inventory;

    int wrongAnswers;
    int correctAnswers;
    Scanner input;
    int money;

    public Player(String name, int kaffe) {
        this.name = name;
        this.coffee = 0;

        this.studyPoints = 0;
        this.energyLevel = 100;
        this.wrongAnswers = 0;
        this.correctAnswers = 0;
        this.money = 100;
        this.inventory = new Backpack();
    }
    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }
    public int getStudyPoints() {
        return studyPoints;
    }
    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void addItemToInventory(Item newItem){
        this.inventory.addToBackPack(newItem);
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getMaxEnergyLevel() {
        return maxEnergyLevel;
    }

    public void setMaxEnergyLevel(int maxEnergyLevel) {
        this.maxEnergyLevel = maxEnergyLevel;
    }
   /* Player player = new Player("John", 1);

    public void drinkCoffee() {
        Storyline.clearAll();
        if (player.kaffe >=1) {
            player.energyLevel += 25;
            System.out.println("Du drikker en kop dejlig, varm og forfriskende kaffe! Din energi stiger og du har nu " + player.energyLevel + "/100 energi!");
        } else {
            System.out.println("Du har ikke noget kaffe, køb eventuelt noget i kantinen.");
        }
    }*/
}