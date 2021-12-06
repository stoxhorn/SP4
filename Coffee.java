public class Coffee extends Item {

    int energyBoost;
    public Coffee(int energyBoost){
        this.energyBoost = energyBoost;
    }

    @Override
    public void useItem() {

        if (player.getCoffee >= 1) {
            player.setEnergyLevel += energyBoost;
            player.setCoffee--;
            System.out.println("Du har nu drukket en forfriskende varm kop kaffe og fået 25 energi!" +
                    "\nDu har nu " + player.getEnergyLevel + "/100 energi.");
            if (player.getEnergyLevel > 100) {
                player.setEnergyLevel = 100;
            } else if (player.getCoffee < 1) {
                System.out.println("Du har desværre ikke noget kaffe lige nu ... prøv eventuelt senere!");
            }
        }
    }
    @Override
    public void addToBackpack() {
        backpack.addToBackPack(new Coffee(25));
        player.setCoffee--;
        System.out.println("Du tager kaffen ned i din rygsæk");
    }

}

