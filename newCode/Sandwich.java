public class Sandwich extends Item {

    private int sandwichEnergyBoost;
    Player player = new Player("John", 1); // midlertidig player
    Storyline story = new Storyline(); // Hvad er den rigtige løsning her??

    public Sandwich(int sandwichEnergyBoost){
        this.sandwichEnergyBoost = sandwichEnergyBoost;
    }


    @Override
    public void useItem() {


        if (player.getSandwich() >= 1) {
            player.setEnergyLevel(player.getEnergyLevel() + 15);
            player.setSandwich(-1);
            System.out.println("Du har nu spist en velsmagende sandwich, som gav dig 15 energi!" +
                    "\nDu har nu " + player.getEnergyLevel() + "/100!");
            if (player.getEnergyLevel() >= 100) {
                player.setEnergyLevel(100);
            }
        } else if (player.getSandwich() <= 0) {
            System.out.println("Dette kan du ikke, da du ikke har nogen sandwich!");
        }
    }

    @Override
    public String toString() {
        return "sandwich";
    }

}
