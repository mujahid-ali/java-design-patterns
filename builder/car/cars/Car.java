
package car.cars;

import car.components.Engine;
import car.components.Transmission;
import car.components.GPSNaviagtor;
import car.components.TripComputer;

public class Car{
  private final Type type;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GPSNaviagtor gpsNaviagtor;
  private double fuel = 0;

  public Car(Type type, int seats, Engine engine, Transmission transmission
    TripComputer tripComputer GPSNaviagtor gpsNaviagtor ){
      this.type = type;
      this.seats = seats;
      this.engine = engine;
      this.transmission = transmission;
      this.tripComputer = tripComputer;
      this.tripComputer.setCar(this);//why ??
      this.gpsNaviagtor = gpsNaviagtor;
    }

    public Type getType(){
      return type;
    }

    public void setFuel(double fuel){
      this.fuel = fuel;
    }

    public int getSeats(){
      return seats;
    }

    public Engine getEngine(){
      return engine;
    }

    public Transmission getTransmission(){
      return transmission;
    }

    public GPSNaviagtor getGPSNaviagtor(){
      return gpsNaviagtor;
    }

    public TripComputer getTripComputer(){
      return tripComputer;
    }
}
