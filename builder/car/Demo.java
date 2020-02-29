
package car;

import car.builders.CarBuilder;
import car.builders.ManualBuilder;
import car.cars.Car;
import car.cars.Manual;
import director.Director;

public class Demo {
  Director director = new Director();

  CarBuilder builder = new CarBuilder();
  director.constructSportsCar(builder);

  Car car = builder.getResult();
  System.out.println("Car built:\n" + car.getType());

  ManualBuilder manualbuilder = new ManualBuilder();
  director.constructSportsCar(manualbuilder);

  Manual carManual = manualbuilder.getResult();
  System.out.println("Manual built:\n" + carManual.print());
}
