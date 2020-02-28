
package gui.factories;

import gui.buttons.Button;
import gui.buttons.WinButton;
import gui.checkboxes.CheckBox;
import gui.checkboxes.WinCheckBox;

public class WinFactory implements GUIFactory{
  @Override
  public Button createButton(){
    return new WinButton();
  }

  @Override
  public CheckBox createCheckBox(){
    return new WinCheckBox();
  }
}
