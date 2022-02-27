package AirportAssetControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private List<Airplane> airplanes;
    private List<Flight> flights;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.airplanes = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public void startAssetControl() {

        String id;

        while (true) {
            System.out.println("-------------------------");
            System.out.println("Choose an action: " +
                    "\n[1] Add an airplane " +
                    "\n[2] Add a flight " +
                    "\n[X] Exit Airport Asset Control");
            String choice = this.scanner.nextLine();

            if (choice.equalsIgnoreCase("X")) {
                break;
            }

            if (choice.equalsIgnoreCase("1")) {
                System.out.print("Give an airplane id: ");
                id = this.scanner.nextLine();

                System.out.print("Give the airplane capacity: ");
                int capacity = this.scanner.nextInt();

                this.airplanes.add(new Airplane(id, capacity));

            }

            if (choice.equalsIgnoreCase("2")) {
                System.out.print("Give an airplane id: ");
                id = this.scanner.nextLine();

                System.out.print("Give the departure airport id: ");
                String departureID = this.scanner.nextLine();

                System.out.print("Give the target airport id: ");
                String targetAirportID = this.scanner.nextLine();

                this.flights.add(new Flight(id, departureID, targetAirportID));
                continue;
            }

        }
    }

    public void startFlightControl() {

        while (true) {
            System.out.println("-------------------------");
            System.out.println("Choose an action: " +
                    "\n[1] Print airplanes " +
                    "\n[2] Print flights " +
                    "\n[X] Print airplane details");
            String choice = this.scanner.nextLine();


            if (choice.equalsIgnoreCase("X")) {
                break;
            }
            if (choice.equalsIgnoreCase("1")) {
                for (int i = 0; i < this.airplanes.size(); i++) {
                    System.out.println(this.airplanes.get(i));
                }
            }
            if (choice.equalsIgnoreCase("2")) {
                for (int i = 0; i < this.flights.size(); i++) {
                    String flightName = this.flights.get(i).getPlane();
                    String depID = this.flights.get(i).getDepartureAirportID();
                    String arrID = this.flights.get(i).getTargetAirportID();
                    int capacity = 0;
                    for (int j = 0; j < this.airplanes.size(); j++) {
                        if (this.airplanes.get(j).getPlaneID().equalsIgnoreCase(flightName)) {
                            capacity = this.airplanes.get(j).getPlaneCapacity();
                        }
                    }
                    System.out.println(flightName + "(" + capacity + " passangers)" + "(" + depID + "-" + arrID + ")");
                }
            }

            if (choice.equalsIgnoreCase("3")) {
                System.out.print("Give an airplane id: ");
                String id = this.scanner.nextLine();

                for (int i = 0; i < this.airplanes.size(); i++) {
                    if (this.airplanes.get(i).getPlaneID().equalsIgnoreCase(id)) {
                        System.out.println(this.airplanes.get(i));
                    }
                }
            }
        }
    }
}
