/*
import Button.*;
import WebButton.*;
*/
public class WebDialog extends Dialog{
  //public void render();

  @Override
  public Button createButton(){
    return new WebButton();
  }
}
