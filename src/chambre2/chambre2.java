package chambre2;

import chambre1.ChambreMère;

public class Chambre2 extends ChambreMère{
    final int numChambre = 2 ;
          boolean climStatus ;
 

    public Chambre2() {
    }



    public int getNumChambre() {
        return this.numChambre;
    }


    public boolean isClimStatus() {
        return this.climStatus;
    }

    public boolean getClimStatus() {
        return this.climStatus;
    }

    public void setClimStatus(boolean climStatus) {
        this.climStatus = climStatus;
    }

    public void activer() {
        this.climStatus = true;
   }

   
   public void desactiver() {
       this.climStatus = false;
  }


    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            ", climStatus='" + isClimStatus() + "'" +
            "}";
    }
     
 
}

    
