import java.util.ArrayList;
import java.util.List;

public class OverdueList<E> {

    private E someItem;

    List <String> lateBook = new ArrayList<String>();
    

    public OverdueList(E someItem){
        this.someItem = someItem;
    }

    public E getSomeItem(){
        return this.someItem;
    }
}