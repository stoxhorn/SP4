import java.util.ArrayList;
import java.util.List;

public class Backpack { //ArrayList af items her (sandwich, bøger, kaffe og hvad ellers?)
   private int sandwich;
   private int book;
   private int coffee;
   // Final for arraylist gør at man ikke kan ændre hvilken liste/hvilket objekt items peger på,
   // og dermed ikke kan "slette" listen, men kun ændre på den
   private final ArrayList<Item> items;


   public ArrayList<Item> showBackPack(){
       return items;
   }

    public void addToBackPack(Item item){
        items.add(item);
        updateCounter();
    }

    public void updateCounter() {
        sandwich = 0;
        coffee = 0;
        book = 0;
        for(Item s : items) {

            if(s.toString() == "sandwich"){
                sandwich += 1;
            } else if(s.toString() == "coffee"){
                coffee += 1;
            } else if(s.toString() == "book"){
                book += 1;
            }
        }

    }

    public void eatSandwich() { // Skal erstatte den abstracte useItem metode **MANGLER TEST**
        for (int j = 0; j < items.size(); j++) {
            Item s = this.items.get(j);
            if (s.toString() == "sandwich") {
                items.remove(j);
                System.out.println("Du spiser en sandwich. Dit energiniveau er steget med 25");
                this.sandwich = sandwich - 1;
                Storyline.player.setEnergyLevel(Storyline.player.getEnergyLevel() + 25);
                if (Storyline.player.getEnergyLevel() >= Storyline.player.getMaxEnergyLevel()) {
                    Storyline.player.setEnergyLevel(100);

                }
            } else if (items.size() == 0 || s.toString() != "sandwich") {
                System.out.println("Du har ikke nogen sandwich. Du kan købe i kantinen");
            }

        }
        if (items.size() == 0) {
            System.out.println("Du har ingen sandwich :(");
        }
    }

    public void drinkCoffee() { // Skal erstatte den abstracte useItem metode **MANGLER TEST**
        for (int j = 0; j < items.size(); j++) {
            Item s = this.items.get(j);
            if (s.toString() == "coffee") {
                items.remove(j);
                System.out.println("Du drikker en kaffe - av den er varm");
                this.coffee = coffee - 1;
                Storyline.player.setEnergyLevel(Storyline.player.getEnergyLevel() + 10);
                if (Storyline.player.getEnergyLevel() >= Storyline.player.getMaxEnergyLevel()) {
                    Storyline.player.setEnergyLevel(100);
                }
            } else if (s.toString() != "coffee") {
                System.out.println("Du har ingen kaffe");
            }

        } if(items.size() == 0) {
            System.out.println("Du har ingen kaffe");
        }

    }

    @Override
    public String toString() {
        return "Backpack{" +
                "sandwich=" + this.sandwich +
                ", book=" + this.book +
                ", coffee=" + this.coffee +
                '}';
    }

    public Backpack() {
       this.coffee = 0;
       this.book = 0;
       this.sandwich = 0;
       this.items = new ArrayList<>();
    }


    public int getSandwich() {
        return sandwich;
    }

    public void setSandwich(int sandwich) {
        this.sandwich = sandwich;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee() {
        this.coffee = coffee;
    }

}
