public class Book extends Item {

    private int studyPoints;
    String bookTitle;
    int ID;
    public Book(String bookTitle, int studyPoints, int ID){
        this.studyPoints = studyPoints;
        this.bookTitle = bookTitle;
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "book";
    }



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
