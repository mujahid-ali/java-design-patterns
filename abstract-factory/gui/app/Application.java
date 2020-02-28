
package gui.app;

import gui.buttons.Button;
import gui.checkboxes.CheckBox;
import gui.factories.GUIFactory;

public class Application{
  private Button button;
  private CheckBox checkbox;

  public Application(GUIFactory factory){
    button = factory.createButton();
    checkbox = factory.createCheckBox();
  }

  public void paint(){
    button.paint();
    checkbox.paint();
  }
}
