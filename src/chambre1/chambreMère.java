package chambre1;

public  abstract class ChambreMère {
    final int numChambre = 1;


    public ChambreMère() {
    }
    
    public int getNumChambre() {
        return this.numChambre;
    }


    public abstract void activer();

    public abstract void desactiver();

    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            "}";
    }


    
    
}