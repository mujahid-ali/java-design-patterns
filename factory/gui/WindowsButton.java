
public class WindowsButton implements Button{
  public void render(){
    System.out.println("WindowsButton render");
    onClick();
  }
  public void onClick(){
    System.out.println("WindowsButton onClick");
  }
}
