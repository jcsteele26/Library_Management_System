public class GeneralBook extends Book implements ReserveBook{

    private static final String publishingCompany = null;
    private String genre; // property for fiction or nonfiction
    

    // constructor for General Book
    public GeneralBook(String id, String title, String section, boolean onHand, boolean reserved, String genre) {

        super(id, title, section, onHand, reserved, genre, publishingCompany);

        this.genre = genre;
    }

    // getter for General Book genre
    public String getGenre(){
        return genre;
    }

    // setter for General Book genre
    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public boolean isBookReserved() {
        boolean res = false;
        if (!res) {             // call to interface ReserveBook
            return true;
        } else {
            return false;
        }
    }
}