
public class WebButton implements Button{
  public void render(){
    System.out.println("WebButton render");
    onClick();
  }
  public void onClick(){
    System.out.println("WebButton onClick");
  }

}
