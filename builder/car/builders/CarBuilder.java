
package car.builders;

import car.cars.Car;
import car.cars.Type;
import car.components.Engine;
import car.components.GPSNaviagtor;
import car.components.Transmission;
import car.components.TripComputer;

public class CarBuilder implements Builder{
  private Type type;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNaviagtor gpsNaviagtor;

  @Override
  public void setType(Type type){
    this.type = type;
  }

  @Override
  public void setSeats(int seats){
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine){
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission){
    this.transmission = transmission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer){
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGPSNavigator(GPSNaviagtor gpsNaviagtor){
    this.gpsNaviagtor = gpsNaviagtor;
  }

  public Car getResult(){
    return new Car(type, seats, engine, transmission, tripComputer, gpsNaviagtor);
  }

}
