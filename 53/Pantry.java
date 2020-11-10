public class Pantry
{
  // Instance Variables
  private Jam  jar1;
  private Jam  jar2;
  private Jam  jar3;
  private Jam  selected;

  // Constructors
  public Pantry( Jam jar1 )
  {
    this.jar1 = jar1;
    selected = null;
  }
  public Pantry( Jam jar1, Jam jar2 )
  {
    this.jar1 = jar1;
    this.jar2 = jar2;
    selected = null;
  }
  public Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = jar3;
    selected = null;
  }

  // Methods

  public void replace(Jam j, int slot) {
    if(slot == 1) {
      this.jar1 = j;
    } else if (slot == 2){
      this.jar2 = j;
    } else if(slot == 3){
      this.jar3 = j;
    }
  }

  public String toString()
  {
    String str = "";
    if(jar1 != null) {
      str += "1: " +  jar1.toString()  + "\n";
    } 
    if (jar2 != null) {
      str += "2: " +  jar2.toString()  + "\n";
    }
    if (jar3 != null) {
      str += "3: " +  jar3.toString()  + "\n";     
    }
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 ) {
      if(this.jar1 != null){
        selected =  jar1;
        return true;
      } 
    } else if ( jarNumber == 2 ) {
      if(this.jar2 != null){
        selected =  jar2;
        return true;
      }
    } else if (jarNumber == 3) {
      if(this.jar3 != null){
        selected =  jar3;
        return true;
      }
    }
    return false;
  }


  // spread the selected jam
  public void spread( int oz )
  {
    selected.spread( oz );
  }

  public void check() {
    if (this.jar1 != null && this.jar2 != null && this.jar3 != null) {
      int total = this.jar1.getCapacity() + this.jar2.getCapacity() + this.jar3.getCapacity();
      if(this.jar1.getCapacity() <= 2 && this.jar2.getCapacity() <= 2 && this.jar3.getCapacity() <= 2) {
        System.out.println("1: " +  "Mixed Fruit" + "   " +  jar1.getDate() + "   " +  total + " fl. oz."    + "\n");
      }
    }
  }
}