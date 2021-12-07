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
