package salle;

/**
 * Classe Salle qui définit une salle générale avec un numéro de salle et des méthodes abstraites 
 * pour activer et désactiver  le système de cette salle.
 */
public  abstract class Salle {
    //Numéro de salle constant
    final int numSalle = 1;

    /**
     * Constructeur par défaut pour la classe Salle.
     */

    public Salle() {
    }
    
    /**
     * Méthode qui retourne le numéro de la salle.
     * @return numéro de la salle
     */
    public int getNumSalle() {
        return this.numSalle;
    }

     /**
     * Méthode abstraite qui permet d'activer la salle.
     * @throws Exception
     */
    public abstract void activer() throws Exception;

    /**
     * Méthode abstraite qui permet de désactiver la salle.
     * @throws Exception
     */
    public abstract void desactiver() throws Exception;

    /**
     * Redéfinition de la méthode toString pour retourner les informations sur la salle.
     */

    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumSalle() + "'" +
            "}";
    }


    
    
}