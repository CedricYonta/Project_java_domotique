package garage;

public class Garage {
    boolean doorStatus;



    public Garage() {
    }


    public boolean isDoorStatus() {
        return this.doorStatus;
    }

    public boolean getDoorStatus() {
        return this.doorStatus;
    }

    public void setDoorStatus(boolean doorStatus) {
        this.doorStatus = doorStatus;
    }

    public void open() {
        this.doorStatus = true;
    }

    public void close () {
        this.doorStatus = false;
    }


    @Override
    public String toString() {
        return "{" +
            " doorStatus='" + isDoorStatus() + "'" +
            "}";
    }

}