package chambre1;
import salle.Salle;

public class Chambre1 extends Salle{
    // Numéro de la chambre
    final int numChambre = 1 ;
    // Statut de la lumière dans la chambre
          boolean lightStatus ;

    // Constructeur par défaut
    public Chambre1() {
    }

    // Retourne le numéro de la chambre
    public int getNumChambre() {
        return this.numChambre;
    }

    // Retourne le statut de la lumière dans la chambre
    public boolean isLightStatus() {
        return this.lightStatus;
    }

    // Retourne le statut de la lumière dans la chambre
    public boolean getLightStatus() {
        return this.lightStatus;
    }

     // Définit le statut de la lumière dans la chambre
    public void setLightStatus(boolean lightStatus) {
        this.lightStatus = lightStatus;
    }
     
    // Active la lumière dans la chambre
    public void activer() throws Exception {
        if (this.lightStatus == true) {
           throw new Exception("La lumière est déjà activé");
        }
        this.lightStatus = true;
     }
     
   // Désactive la lumière dans la chambre
     public void desactiver() throws Exception{
        if (this.lightStatus == false) {
            throw new Exception("Le chauffage est déjà desactivé");
        }
       this.lightStatus = false;
  }

  // Retourne une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            ", lightStatus='" + isLightStatus() + "'" +
            "}";
    }
   
    

}
