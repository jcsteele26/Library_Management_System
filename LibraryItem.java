public class LibraryItem{

    // class properties for library item
    private String id;
    private String title;
    private String section;
    private boolean onHand;
    private boolean reserved;

    // constructor for library item with all properties
    public LibraryItem(String id, String title, String section, boolean onHand, boolean reserved) {
        this.id = id;
        this.title = title;
        this.section = section;
        this.onHand = onHand;
        this.reserved = reserved;
    }

    // getters for library item
    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getSection(){
        return section;
    }

    public boolean getOnHand(){
        return onHand;
    }

    public boolean getReserved(){
        return reserved;
    }

    // setters for library item
    public void setId(String id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSection(String section){
        this.section = section;
    }

    public void setOnHand(boolean onHand){
        this.onHand = onHand;
    }

    public void setReserved(boolean reserved){
        this.reserved = reserved;
    }



}