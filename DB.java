public class DB {

    private static Player player;


    public DB(){
    }

    public void setPlayer(Player newPlayer){
        this.player = newPlayer;
    }

    public void playerSetStudyPoints(int studyPoints) {
        this.player.setStudyPoints(studyPoints);
    }
    public int playerGetStudyPoints() {
        return this.player.getStudyPoints();
    }
    public int playerGetCoffee() {
        return this.player.getCoffee();
    }

    public void playerSetCoffee(int coffee) {
        this.player.setCoffee(coffee);
    }

    public void playerAddItemToInventory(Item newItem){
        this.player.addItemToInventory(newItem);
    }

    public int playerGetEnergyLevel() {
        return this.player.getEnergyLevel();
    }

    public void playerSetEnergyLevel(int energyLevel) {
        this.player.setEnergyLevel(energyLevel);
    }

    public int playerGetMaxEnergyLevel() {
        return this.player.getMaxEnergyLevel();
    }

    public void playerSetMaxEnergyLevel(int maxEnergyLevel) {
        this.player.setMaxEnergyLevel(maxEnergyLevel);
    }

}
