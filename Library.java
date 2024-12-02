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
    // return the title that we removed
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
    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title){
      if(collection.containsKey(title)){
        return true;
      }
      else{throw new RuntimeException("This collection does not contain the given title.");}
    }
    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title){
      if(collection.get(title) == true){
        return true;
      }
      else{return false;}
    }
    // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection(){
      for(String key : collection.keySet()){
        System.out.println("Key: " + key + ", Value: " + collection.get(key));
      }
    }
    public static void main(String[] args) {
      Hashtable<String, Boolean> hashtable = new Hashtable<>();
      hashtable.put("Alice in Wonderland", true);
      Library lib = new Library("Neilson", "7 Neilson Drive", 5, hashtable);
      System.out.println(lib);
    }
  
  }
