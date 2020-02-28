
package gui.factories;

import gui.buttons.Button;
import gui.buttons.MacButton;
import gui.checkboxes.CheckBox;
import gui.checkboxes.MacCheckBox;

public class MacFactory implements GUIFactory{
  @Override
  public Button createButton(){
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox(){
    return new MacCheckBox();
  }
}
