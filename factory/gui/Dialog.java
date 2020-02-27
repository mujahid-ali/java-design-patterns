
class Dialog{
  //public void render();
  abstract Button createButton();
  public void render(){
    System.out.println("This is a commonMethod render from Dialog ");
    Button okButton = createButton();
    okButton.onClick();
    okButton.render();
  }
}
