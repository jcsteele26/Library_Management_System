public class GeneralBook extends Book{

    private String genre; // property for fiction or nonfiction

    // constructor for General Book
    public GeneralBook(String id, String title, String section, boolean onHand, boolean reserved, String genre) {

        super(id, title, section, onHand, reserved);

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
    
}