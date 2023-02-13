package chambre3;

import chambre1.chambreMère;

public class chambre3 extends chambreMère {
    final int numChambre = 3 ;
          boolean alexaStatus ;


    public chambre3() {
    }

    public int getNumChambre() {
        return this.numChambre;
    }


    public boolean isAlexaStatus() {
        return this.alexaStatus;
    }

    public boolean getAlexaStatus() {
        return this.alexaStatus;
    }

    public void setAlexaStatus(boolean alexaStatus) {
        this.alexaStatus = alexaStatus;
    }


    @Override
    public String toString() {
        return "{" +
            " numChambre='" + getNumChambre() + "'" +
            ", alexaStatus='" + isAlexaStatus() + "'" +
            "}";
    }

}
