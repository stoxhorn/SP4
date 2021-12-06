public class Book extends Item {
    int studyPoints;
    String name;
    boolean isRead = false;

    public Book(String name, int studyPoints){
        this.studyPoints = studyPoints;
        this.name = name;
    }

    @Override
    public void useItem() {
        if(isRead == false) {
            System.out.println("Du har læst en bog og optjent 25 Study Points");
            player.setStudyPoints += 25;
            isRead = true;
            System.out.println("I alt har du nu så mange Study Points: " + player.getStudyPoints() +
                    "\n For at tage den første eksamen skal du have optjent mindst 100 Study Points");
        } else if (isRead == true) {
            System.out.println("Du kan ikke læse din bog igen, din nød");
        }
    }

    @Override
    public void addToBackpack() {
        //TODO husk at lave hvert enkelt bog som objekter osv.

        backpack.addToBackPack(new Book("Strings for nybegyndere",25));
        System.out.println("Du har nu lagt bogen ned i din taske ved navn: " + name);
    }
}
