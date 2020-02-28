
public class MacButton implements Button{
  public void render(){
    System.out.println("MacButton render");
    onClick();
  }
  public void onClick(){
    System.out.println("MacButton onClick");
  }
}
