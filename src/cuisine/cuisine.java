package cuisine;

public class cuisine {
    boolean heatingStatus ; 


    public cuisine() {
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

    public void activer() {
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
