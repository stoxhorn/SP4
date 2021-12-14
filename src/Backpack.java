import java.util.ArrayList;
import java.util.List;

public class Backpack {
   private int sandwich;
   private int book;
   private int coffee;
   private int apple;

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
        apple = 0;
        for(Item s : items) {

            if(s.toString() == "sandwich"){
                sandwich += 1;
            } else if(s.toString() == "coffee"){
                coffee += 1;
            } else if(s.toString() == "book"){
                book += 1;
            } else if(s.toString() == "apple"){
                apple += 1;
            }
        }

    }

    public void findBook() {
        Item x;
        int IDD;
        for (int j = 0; j < items.size(); j++) {
            x = this.items.get(j);
            if (x.toString() == "book") {
                Book b = (Book) x;
                IDD = b.getID();
                if (IDD == 1) {
                    Storyline.player.readBook(1);
                    return;
                } else if (IDD == 2) {
                    Storyline.player.readBook(2);
                    return;
                } else if (IDD == 3) {
                    Storyline.player.readBook(3);
                    return;
                }
            }


        } if (items.size() == 0) {
            System.out.println("Din rygsæk er tom");
        }
        System.out.println("Du har ingen bog");
    }

    public Book getSpecificBook(int i) {

        for (int j = 0; j < items.size(); j++) {
            Item x = this.items.get(j);
            if(x.toString() == "book") {
                Book b = (Book)x;
                b.getID();
                if(b.getID() == i) {
                    x = items.remove(j);
                    this.book = book -1;
                    return b;
                }
            }
        }
        return null;
    }


    public void eatSandwich() { // Printer else if ud 3 gange hvis man har 3 kaffer *FIX*
        for (int j = 0; j < items.size(); j++) {
            Item s = this.items.get(j);
            if (s.toString() == "sandwich") {
                items.remove(j);
                System.out.println("Du spiser en sandwich. Dit energiniveau er steget med 25");
                this.sandwich = sandwich - 1;
                Storyline.player.setEnergyLevel(Storyline.player.getEnergyLevel() + 25);
                if (Storyline.player.getEnergyLevel() >= Storyline.player.getMaxEnergyLevel()) {
                    Storyline.player.setEnergyLevel(100);
                } System.out.println("Dit energiniveau er nu oppe på: " + Storyline.player.getEnergyLevel());
            return;
            }
        }
        if (items.size() == 0) {
            System.out.println("Din har intet i din rygsæk");
            return;
        }
        System.out.println("Du har ingen sandwich");
    }

    public void eatApple() {
        for (int j = 0; j < items.size(); j++) {
            Item s = this.items.get(j);
            if (s.toString() == "apple") {
                items.remove(j);
                System.out.println("Du spiser dit klamme æble, FØJ.. Meeeen den mætter");
                this.apple = apple - 1;
                Storyline.player.setEnergyLevel(Storyline.player.getEnergyLevel() + 5);
                if (Storyline.player.getEnergyLevel() >= Storyline.player.getMaxEnergyLevel()) {
                    System.out.println("Du er på max energi");
                    Storyline.player.setEnergyLevel(100);
                } System.out.println("Dit energiniveau er nu oppe på: " + Storyline.player.getEnergyLevel());
                return;
            }
        } if(items.size() == 0) {
            System.out.println("Din backpack er tom");
            return;
        }
        System.out.println("Du har intet æble");
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
                    System.out.println("Du er på max energi");
                    Storyline.player.setEnergyLevel(100);
                } System.out.println("Dit energiniveau er nu oppe på: " + Storyline.player.getEnergyLevel());
                return;
            }

        } if(items.size() == 0) {
            System.out.println("Din backpack er tom");
            return;
        }
        System.out.println("Du har ingen kaffe");
    }

    @Override
    public String toString() {
        return "Din taske indeholder : \n" +
                "Kaffe: " + this.coffee + "\n" +
                "Sandwich: " + this.sandwich + "\n" +
                "Bøger: " + this.book + "\n" +
                "Æbler: " + this.apple;

    }

    public Backpack() {
       this.coffee = 0;
       this.book = 0;
       this.sandwich = 0;
       this.apple = 0;
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
