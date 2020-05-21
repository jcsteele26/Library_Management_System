public class LibraryFactory {

    public static String LibraryCreateDept(String name) {
        String d = null;
        if(name == null){   // factory for Library Items
            return null;
        }
        switch (name){
            case "BOOK":
                d = "Book Department";
                break;
            case "PERIODICAL":
                d = "Periodical Department";
                break;
            case "AUDIO":
                d = "Audio";
                break;
            case "VIDEO":
                d = "Video";
                break;
            default:
        }
        return d;
        
    }
    
}