import java.util.ArrayList;
import java.util.List;

public class Cardholder {

    private String name;
    private String address;
    private int cardNumber;

    // members for overdue items
    List <String> overdueBook = new ArrayList<>();
    List <String> overduePeriodical = new ArrayList<>();
    List <String> overdueVideo = new ArrayList<>();

    // constructor for Cardholder class
    public Cardholder(String name, String address, int cardNumber){
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    // getters for Cardholder class
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getCardNumber(){
        return cardNumber;
    }

    // setters for Cardholder class
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }

    // method to check out items

    // method to reserve items
    
}