package cuisine;

public class Cuisine {
    boolean heatingStatus ; 


    public Cuisine() {
    }

    public boolean isHeatingStatus() {
        return this.heatingStatus;
    }

    public boolean getHeatingStatus() {
        return this.heatingStatus;
    }

    public void setHeatingStatus(boolean heatingStatus) {
        this.heatingStatus = heatingStatus;
    }

    public void activer() throws Exception {
        if (this.heatingStatus == true) {
           throw new Exception("Le chauffage est déjà activé");
        }
        this.heatingStatus = true;
     }
     
   
   public void desactiver() {
       this.heatingStatus = false;
  }

    @Override
    public String toString() {
        return "{" +
            " heatingStatus='" + isHeatingStatus() + "'" +
            "}";
    }

}
