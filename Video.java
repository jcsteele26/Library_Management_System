public class Video extends LibraryItem{

    private String rating; // video rating property

    // constructor for Video class
    public Video(String id, String title, String section, boolean onHand, boolean reserved, String rating) {

        super(id, title, section, onHand, reserved);

        this.rating = rating;

    }

    // getter for rating property
    public String getRating(){
        return rating;
    }

    // setter for rating property
    public void setRating(String rating){
        this.rating = rating;
    }
    
}