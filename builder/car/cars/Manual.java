package car.cars;

import car.components.Engine;
import car.components.Transmission;
import car.components.GPSNaviagtor;
import car.components.TripComputer;

public class Manual{
  private final Type type;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GPSNaviagtor gpsNaviagtor;

  public Manual(Type type, int seats, Engine engine, Transmission transmission
    TripComputer tripComputer GPSNaviagtor gpsNaviagtor ){
      this.type = type;
      this.seats = seats;
      this.engine = engine;
      this.transmission = transmission;
      this.tripComputer = tripComputer;
      this.gpsNaviagtor = gpsNaviagtor;
    }

    public String print() {
       String info = "";
       info += "Type of car: " + type + "\n";
       info += "Count of seats: " + seats + "\n";
       info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
       info += "Transmission: " + transmission + "\n";
       if (this.tripComputer != null) {
           info += "Trip Computer: Functional" + "\n";
       } else {
           info += "Trip Computer: N/A" + "\n";
       }
       if (this.gpsNavigator != null) {
           info += "GPS Navigator: Functional" + "\n";
       } else {
           info += "GPS Navigator: N/A" + "\n";
       }
       return info;
   }


}
