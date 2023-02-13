package chambre1;
import salle.Salle;

public class Chambre1 extends Salle{
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

    public void activer() throws Exception {
        if (this.lightStatus == true) {
           throw new Exception("La lumière est déjà activé");
        }
        this.lightStatus = true;
     }
     
   
   public void desactiver() throws Exception{
        if (this.lightStatus == false) {
            throw new Exception ("La lumière est déjà désactivé");
        }
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
