
package gui.app;

import gui.app.Application;
import gui.factories.GUIFactory;
import gui.factories.MacFactory;
import gui.factories.WinFactory;

public class Demo{

  private static Application configureApplication(){
    Application app;
    GUIFactory factory;

    String osName = "Windows";
    if(osName.contains("Windows")){
      factory = new WinFactory();
      app = new Application(factory);
    }
    else if(osName.contains("Mac")){
      factory = new MacFactory();
      app = new Application(factory);
    }
    else{
      System.out.println("Neither Mac nor Windows");
    }
  }

  public static void main(String[] args){
    Application app = configureApplication();
    app.paint();
  }
}
