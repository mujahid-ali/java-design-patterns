
package gui.factories;

import gui.buttons.*;
import gui.checkboxes.*;

public interface GUIFactory{
  Button createButton();
  CheckBox createCheckBox();
}
