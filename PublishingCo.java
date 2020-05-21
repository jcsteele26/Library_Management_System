public class PublishingCo {
    private String name;
    private String address;

    // constructor for Publishing Co
    PublishingCo(String name, String address){
        this.name = name;
        this.address = address;
    }

    // get methods for Publishing Co
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    // set methods for Publishing Co
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    
}