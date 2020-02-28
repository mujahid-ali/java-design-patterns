

//import Dialog.*;
//import WebDialog.*;
//import WindowsDialog.*;

public class App{
  private static Dialog dialog;

  public static void main(String[] args){
    configure();
    runBusinessLogic();

    //var app = new App(new WindowsDialog());
    //app.createButton();
    //dialog.render();
  }

  static void configure(){
    if(System.getProperty("os.name").equals("Windows 10")){
      dialog = new WindowsDialog();
    }else{
      dialog = new WebDialog();
    }
  }

  static void runBusinessLogic(){
    dialog.renderWindow();
  }
}
