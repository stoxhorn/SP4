public class Player2 extends Player{


    private String name;
    private int attackPower;
    private int defensePower;
    private int health;



    public Player2(String name, int attackPower, int defensePower, int health) {
        super(name);
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.health = health;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
