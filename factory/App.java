
public class App{
  private final static Dialog dialog;

  public App(Dialog dialog){
    dialog = new WindowsDialog();
  }

  public static void main(String[] args){
    //var app = new App(new Dialog());
    //app.WindowsDialog();
    dialog.render();

  }
}
