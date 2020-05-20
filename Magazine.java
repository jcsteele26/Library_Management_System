public class Magazine extends Periodical{

    private String issue;  // property for issue month

    // constructor for Magazine
    public Magazine(String id, String title, String section, boolean onHand, boolean reserved, String issue) {

        super(id, title, section, onHand, reserved);

        this.issue = issue;
    }

    // getter for Magazine issue
    public String getIssue(){
        return issue;
    }

    // setter for Magazine issue
    public void setIssue(String issue){
        this.issue = issue;
    }
    
}