package garage;

import salle.Salle;

// Classe Garage qui hérite de la classe Salle
public class Garage extends Salle {
     // Attribut final numSalle défini à la valeur 3
    final int numSalle = 3;
    // Attribut booléen doorStatus pour savoir si la porte est ouverte ou fermée
    boolean doorStatus;

// Constructeur par défaut
    public Garage() {
    }

     // Méthode pour obtenir la valeur de l'attribut doorStatus
    public boolean isDoorStatus() {
        return this.doorStatus;
    }

    // Méthode pour obtenir la valeur de l'attribut doorStatus
    public boolean getDoorStatus() {
        return this.doorStatus;
    }

    // Méthode pour obtenir la valeur de l'attribut numSalle
    public int getNumSalle() {
        return this.numSalle;
    }

   // Méthode pour définir la valeur de l'attribut doorStatus
    public void setDoorStatus(boolean doorStatus) {
        this.doorStatus = doorStatus;
    }

    // Méthode pour activer le statut de la porte
    public void activer() throws Exception {
        // Si la porte est déjà ouverte, lève une exception
        if (this.doorStatus == true) {
           throw new Exception("La porte déjà ouverte");
        }
        // Définit la valeur de doorStatus à true
        this.doorStatus = true;
     }
     
   // Méthode pour désactiver le statut de la porte
   public void desactiver() throws Exception{
    // Si la porte est déjà fermée, lève une exception
        if (this.doorStatus == false) {
            throw new Exception("La porte est déjà fermé");
        }
        // Définit la valeur de doorStatus à false
       this.doorStatus = false;
  }

  protected void finalize() throws Throwable {

    // code à exécuter lorsque l'objet est finalisé

    System.out.println("L'objet Garage est finalisé");

    super.finalize();

}

     // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return "{" +
            " numSalle='" + getNumSalle() + "'" +
            ", doorStatus='" + isDoorStatus() + "'" +
            "}";
    }

     
}
