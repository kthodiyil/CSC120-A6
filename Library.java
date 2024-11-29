/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
      super(name, address, nFloors);
      this.collection = collection;
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      if(!collection.containsKey(title)){
        collection.put(title, true);
      }
      else{System.out.println(title + " is already in the collection.");}
      
    }

    public String removeTitle(String title){
      if(collection.containsKey(title)){
        collection.remove(title);
        return title;
      }
      else{ throw new RuntimeException("You cannot remove this title because it is not in the collection.");}
    }

    public void checkOut(String title){
      if(collection.contains(title)){
        collection.put(title, false); // assigns the value to false because the book is no longer available
      }
      else{System.out.println("This book cannot be checked out because it is not in the collection.");}
    }

    public void returnBook(String title){
      if(collection.contains(title) && collection.get(title)== false){
        collection.put(title, true);
      }
      else{System.out.println("This book has already been returned.");}
    }

    public boolean containsTitle(String title){
      if(collection.containsKey(title)){
        return true;
      }
      else{throw new RuntimeException("This collection does not contain the given title.")}

    public boolean isAvailable(String title){
      if(collection.getValue() == true){
        return true;
      }
      else{return false;}
    }

    public void printCollection(){
      for(Hashtable<String, Boolean> collection : entry){
        String key = collection.getKey();
        Boolean value = collection.getValue();
        System.out.println(key + ":" + value);
      }
    }
    public static void main(String[] args) {
      new Library();
    }
  
  }
}