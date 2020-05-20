public class Newspaper extends Periodical{

    private String issueDate;

    // constructor for Newspaper
    public Newspaper(String id, String title, String section, boolean onHand, boolean reserved, String issueDate) {

        super(id, title, section, onHand, reserved);

        this.issueDate = issueDate;
    }

    // getter for Newspaper issue
    public String getIssueDate(){
        return issueDate;
    }
    
    // setter for Newspaper issue
    public void setIssueDate(String issueDate){
        this.issueDate = issueDate;
    }
    
}