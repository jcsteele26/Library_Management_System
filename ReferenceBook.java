public class ReferenceBook extends Book{

    private static final String author = null;
    private static final String publishingCo = null;

    // constructor for Reference Book
    public ReferenceBook(String id, String title, String section, boolean onHand, boolean reserved) {

        super(id, title, section, onHand, reserved, author, publishingCo);
    }
    
}