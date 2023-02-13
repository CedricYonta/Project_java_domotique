package chambre1;

public  abstract class chambreMère {
    final int numChambre = 1;


    public chambreMère() {
    }
    
    public int getNumChambre() {
        return this.numChambre;
    }

    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            "}";
    }
    
    
}