package chambre2;

import chambre1.chambreMère;

public class chambre2 extends chambreMère{
    final int numChambre = 2 ;
          boolean climStatus ;
 

    public chambre2() {
    }

    public chambre2(boolean climStatus) {
        this.climStatus = climStatus;
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

    public chambre2 climStatus(boolean climStatus) {
        setClimStatus(climStatus);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            ", climStatus='" + isClimStatus() + "'" +
            "}";
    }
     
 
}

    
