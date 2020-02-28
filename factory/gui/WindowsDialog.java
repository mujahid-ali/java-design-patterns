/*
import Button.*;
import WindowsButton.*;
*/
public class WindowsDialog extends Dialog{
  //public void render();
  @Override
  public Button createButton(){
    return new WindowsButton();
  }
}
