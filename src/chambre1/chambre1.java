package chambre1;

public class Chambre1 extends ChambreMère {
    final int numChambre = 1 ;
          boolean lightStatus ;


    public Chambre1() {
    }



    public int getNumChambre() {
        return this.numChambre;
    }


    public boolean isLightStatus() {
        return this.lightStatus;
    }

    public boolean getLightStatus() {
        return this.lightStatus;
    }

    public void setLightStatus(boolean lightStatus) {
        this.lightStatus = lightStatus;
    }

    public void activer() {
         this.lightStatus = true;
    }

    
    public void desactiver() {
        this.lightStatus = false;
   }


    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            ", lightStatus='" + isLightStatus() + "'" +
            "}";
    }
   
    

}
