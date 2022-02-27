package AirportAssetControl;

public class Flight {
    private String plane;
    private String departureAirportID;
    private String targetAirportID;

    public Flight(String plane, String departureAirportID, String targetAirportID){
        this.plane = plane;
        this.departureAirportID = departureAirportID;
        this.targetAirportID = targetAirportID;
    }

    public String getPlane(){ return this.plane;}
    public String getDepartureAirportID(){return this.departureAirportID;}
    public String getTargetAirportID(){return this.targetAirportID;}

}


