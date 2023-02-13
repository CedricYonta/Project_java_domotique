package garage;

import salle.Salle;

public class Garage extends Salle {
    final int numSalle = 3;
    boolean doorStatus;



    public Garage() {
    }


    public boolean isDoorStatus() {
        return this.doorStatus;
    }

    public boolean getDoorStatus() {
        return this.doorStatus;
    }

    public int getNumSalle() {
        return this.numSalle;
    }


    public void setDoorStatus(boolean doorStatus) {
        this.doorStatus = doorStatus;
    }

    public void activer() throws Exception {
        if (this.doorStatus == true) {
           throw new Exception("La porte déjà ouverte");
        }
        this.doorStatus = true;
     }
     
   
   public void desactiver() throws Exception{
        if (this.doorStatus == false) {
            throw new Exception("La porte est déjà fermé");
        }
       this.doorStatus = false;
  }


    @Override
    public String toString() {
        return "{" +
            " numSalle='" + getNumSalle() + "'" +
            ", doorStatus='" + isDoorStatus() + "'" +
            "}";
    }

     
}
