/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  
  // INCLUDE COMMENTS
  public House(String name, String address, int nFloors, ArrayList<String> residents, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = residents;
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){
    if(!this.residents.contains(name)){
      this.residents.add(name);
    }
    else{System.out.println("This person already lives in " + this.name);}
  }

  public String moveOut(String name){
    if(this.residents.contains(name)){
      this.residents.remove(name);
      return name;
    }
    else{
      String notRes = name + " does not live in this building";
      return notRes;
    }
    
  }
  public boolean isResident(String name){
    return this.residents.contains(name);
  }
  
  public static void main(String[] args) {
    new House();
  }

}