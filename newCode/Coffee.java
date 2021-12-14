public class Coffee extends Item {

    private int energyBoost;

    public Coffee(){
        this.energyBoost = 10;
    }



    @Override
    public String toString() {
        return "coffee";
    }


    public int getEnergyBoost() {
        return energyBoost;
    }

    public void setEnergyBoost(int energyBoost) {
        this.energyBoost = energyBoost;
    }
}

