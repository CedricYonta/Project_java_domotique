package cuisine;

import salle.Salle;

public class Cuisine extends Salle {
    final int numSalle = 2;
    boolean heatingStatus ; 


    public Cuisine() {
    }

    public int getNumSalle() {
        return this.numSalle;
    }


    public boolean isHeatingStatus() {
        return this.heatingStatus;
    }

    public boolean getHeatingStatus() {
        return this.heatingStatus;
    }

    public void setHeatingStatus(boolean heatingStatus) {
        this.heatingStatus = heatingStatus;
    }

    public void activer() throws Exception {
        if (this.heatingStatus == true) {
           throw new Exception("Le chauffage est déjà activé");
        }
        this.heatingStatus = true;
     }
     
   
   public void desactiver() throws Exception{
        if (this.heatingStatus == false) {
            throw new Exception("Le chauffage est déjà desactivé");
        }
       this.heatingStatus = false;
  }
   

  @Override
  public String toString() {
      return "{" +
          " numSalle='" + getNumSalle() + "'" +
          ", heatingStatus='" + isHeatingStatus() + "'" +
          "}";
  }
    

}

   
