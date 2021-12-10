public class Book extends Item {

    private int studyPoints;

    String bookTitle;
    int ID;
    boolean isRead = false;
    public Book(String bookTitle, int studyPoints, int ID){
        this.studyPoints = studyPoints;
        this.bookTitle = bookTitle;
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "book";
    }





   /* @Override
   public void addToBackpack() {
        //TODO husk at lave hvert enkelt bog som objekter osv.

        player.getInventory().addToBackPack(new Book("Strings for nybegyndere",25));
        System.out.println("Du har nu lagt bogen, " + getBookTitle() + " i din taske.");
    }
    */

        public int getStudyPoints() {
            return studyPoints;
        }

    public int getID() {
        return ID;
    }

    public void setStudyPoints(int studyPoints) {
            this.studyPoints = studyPoints;
        }

        public String getBookTitle() {
            return bookTitle;
        }
    }
