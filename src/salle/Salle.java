package salle;


public  abstract class Salle {
    final int numSalle = 1;


    public Salle() {
    }
    
    public int getNumSalle() {
        return this.numSalle;
    }


    public abstract void activer() throws Exception;

    public abstract void desactiver() throws Exception;

    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumSalle() + "'" +
            "}";
    }


    
    
}