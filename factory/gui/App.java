

//import Dialog.*;
//import WebDialog.*;
//import WindowsDialog.*;

public class App{
  private static Dialog dialog;

  public static void main(String[] args){
    configure();


    //var app = new App(new WindowsDialog());
    //app.createButton();
    //dialog.render();
  }

  static void configure(){
    /*
    if(System.getProperty("os.name").equals("Windows 10")){
      dialog = new WindowsDialog();
    }else{
      dialog = new WebDialog();
    }
    */
    for(int i =0; i<=6; i++){
      if(i % 2 == 0){
        dialog = new WindowsDialog();
        runBusinessLogic();
      }if(i % 3 == 0){
        dialog = new MacDialog();
        runBusinessLogic();
      }
      else{
        dialog = new WebDialog();
        runBusinessLogic();
      }
    }
  }

  static void runBusinessLogic(){
    dialog.renderWindow();
  }
}
