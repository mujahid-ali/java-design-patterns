
package car.builders;

import car.cars.Type;
import car.components.Engine;
import car.components.GPSNaviagtor;
import car.components.Transmission;
import car.components.TripComputer;

public interface Builder{
  void setType(Type type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNaviagtor gpsNaviagtor);
}
