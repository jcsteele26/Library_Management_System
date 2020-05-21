public class Author {

    private String name;
    private String address;
    private int age;

    Author(String name, String address, int age){ // constructor for Author
        this.name = name;
        this.address = address;
        this.age = age;
    }

    
	// get methods for Author
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    // set methods for Author
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }
    
}