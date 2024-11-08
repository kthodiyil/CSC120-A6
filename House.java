/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  
  public House(String name, String address, int nFloors, ArrayList<String> residents, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = residents;
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    if(this.hasDiningRoom == true){
      return true;
    }
    else{
      return false;
    }
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){
    this.residents.add(name);
  }

  public String moveOut(String name){
    int numRes = this.residents.size() - 1;
    this.residents.remove(numRes);
    return name;
  }
  public boolean isInArray(String name){
    return this.residents.contains(name);
  }
  
  public static void main(String[] args) {
    new House();
  }

}