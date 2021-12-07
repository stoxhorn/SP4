public class Coffee extends Item {

    private int energyBoost;

    public Coffee(int energyBoost){
        this.energyBoost = energyBoost;
    }
    Player player = new Player("John", 1);

    @Override
    public void useItem() {

        if (player.getCoffee() >= 1) {
            player.setEnergyLevel(player.getEnergyLevel()+ energyBoost);
            player.setCoffee(player.getCoffee()-1);
            System.out.println("Du har nu drukket en forfriskende varm kop kaffe og fået 25 energi!" +
                    "\nDu har nu " + player.getEnergyLevel() + "/100 energi.");
            if (player.getEnergyLevel() > 100) {
                player.setEnergyLevel(100);
            } else if (player.getCoffee() < 1) {
                System.out.println("Du har desværre ikke noget kaffe lige nu ... prøv eventuelt senere!");
            }
        }
    }

    @Override
    public String toString() {
        String coffeeString;
        coffeeString = String.valueOf(player.getInventory().showBackPack());
        return coffeeString;
    }

    @Override
    public void addToBackpack() {
        player.getInventory().addToBackPack(new Coffee(25));

        player.setCoffee(player.getCoffee()+1);
        System.out.println("Du tager kaffen ned i din rygsæk");

    }
    public int getEnergyBoost() {
        return energyBoost;
    }

    public void setEnergyBoost(int energyBoost) {
        this.energyBoost = energyBoost;
    }
}

