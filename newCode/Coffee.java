public class Coffee extends Item {

    private int energyBoost;

    public Coffee(){
        this.energyBoost = 10;
    }



    @Override
    public String toString() {
        return "coffee";
    }

    /*@Override
    public void addToBackpack() {
        player.getInventory().addToBackPack(new Coffee(25));

        player.setCoffee(player.getCoffee()+1);
        System.out.println("Du tager kaffen ned i din rygsæk");
                 }
              */


    public int getEnergyBoost() {
        return energyBoost;
    }

    public void setEnergyBoost(int energyBoost) {
        this.energyBoost = energyBoost;
    }
}

