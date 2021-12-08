public class Book extends Item {

    private int studyPoints;

    String bookTitle;
    boolean isRead = false;
    Player player = new Player("H", 1);
    public Book(String bookTitle, int studyPoints){
        this.studyPoints = studyPoints;
        this.bookTitle = bookTitle;
    }

    @Override
    public void useItem() {
        if(isRead == false) {
            System.out.println("Du læste den spændende bog, " + bookTitle + " og fik 25 Study Points!");
            player.setStudyPoints(player.getStudyPoints() +25);
            isRead = true;
            System.out.println("I alt har du " + player.getStudyPoints() + " studypoints!" +
                    "\nFor at tage den første SP-prøve, skal du have optjent mindst 100 Study Points");
        } else if (isRead == true) {
            System.out.println("Du kan ikke læse din bog igen, din nød!");
        }
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

        public void setStudyPoints(int studyPoints) {
            this.studyPoints = studyPoints;
        }

        public String getBookTitle() {
            return bookTitle;
        }
    }
