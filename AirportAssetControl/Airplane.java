package AirportAssetControl;

public class Airplane {
    private String planeID;
    private int planeCapacity;

    public Airplane(String planeID, int planeCapacity){
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneID(){
        return this.planeID;
    }

    public int getPlaneCapacity(){
        return this.planeCapacity;
    }

    public String toString(){
        return this.planeID + "(" + this.planeCapacity + " capacity)";
    }
}

