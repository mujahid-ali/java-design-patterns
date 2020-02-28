
//import Button.*;

public abstract class Dialog{
  //public void render();

  /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */


  public void renderWindow(){
    System.out.println("This is a commonMethod render from Dialog ");
    Button okButton = createButton();
    //okButton.onClick();
    okButton.render();
  }
  public abstract Button createButton();
}
