package chambre3;

import chambre1.ChambreMère;

public class Chambre3 extends ChambreMère {
    final int numChambre = 3 ;
          boolean alexaStatus ;


    public Chambre3() {
    }

    public int getNumChambre() {
        return this.numChambre;
    }


    public boolean isAlexaStatus() {
        return this.alexaStatus;
    }

    public boolean getAlexaStatus() {
        return this.alexaStatus;
    }

    public void setAlexaStatus(boolean alexaStatus) {
        this.alexaStatus = alexaStatus;
    }
    
    public void activer() {
        this.alexaStatus = true;
   }

   
   public void desactiver() {
       this.alexaStatus = false;
  }

    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            ", alexaStatus='" + isAlexaStatus() + "'" +
            "}";
    }

}
