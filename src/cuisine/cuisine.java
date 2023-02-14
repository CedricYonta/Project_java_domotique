/**
 * Class Cuisine, qui hérite de la classe abstraite Salle. 
 * La cuisine possède un numéro de salle unique (numSalle = 2) et un statut de chauffage (heatingStatus).
 */
package cuisine;

import salle.Salle;

public class Cuisine extends Salle {
    final int numSalle = 2;
    boolean heatingStatus ; 

    /**
     * Constructeur vide pour la classe Cuisine.
     */
    public Cuisine() {
    }

    /**
     * Retourne le numéro de la salle (numSalle).
     * @return numSalle
     */
    public int getNumSalle() {
        return this.numSalle;
    }

    /**
     * Retourne le statut de chauffage (heatingStatus).
     * @return heatingStatus
     */
    public boolean isHeatingStatus() {
        return this.heatingStatus;
    }

    /**
     * Retourne le statut de chauffage (heatingStatus).
     * @return heatingStatus
     */
    public boolean getHeatingStatus() {
        return this.heatingStatus;
    }


    /**
     * Définit le statut de chauffage (heatingStatus).
     * @param heatingStatus
     */
    public void setHeatingStatus(boolean heatingStatus) {
        this.heatingStatus = heatingStatus;
    }

     /**
     * Méthode pour activer le chauffage. Si le chauffage est déjà activé, une exception sera levée.
     * @throws Exception 
     */
    public void activer() throws Exception {
        if (this.heatingStatus == true) {
           throw new Exception("Le chauffage est déjà activé");
        }
        this.heatingStatus = true;
     }
     
    /**
     * Méthode pour désactiver le chauffage. Si le chauffage est déjà désactivé, une exception sera levée.
     * @throws Exception
     */
   public void desactiver() throws Exception{
        if (this.heatingStatus == false) {
            throw new Exception("Le chauffage est déjà desactivé");
        }
       this.heatingStatus = false;
  }
   
/**
    * Retourne les informations sur la cuisine sous forme de chaîne de caractères.
    */
  @Override
  public String toString() {
      return "{" +
          " numSalle='" + getNumSalle() + "'" +
          ", heatingStatus='" + isHeatingStatus() + "'" +
          "}";
  }
    

}

   
