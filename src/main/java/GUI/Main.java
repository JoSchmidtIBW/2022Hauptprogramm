package GUI;

import DatenBank.DatenBank;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * @author - John Schmidt
 * 28.12.2021, 17:30
 */
public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Bin die Main- Methode");
//BeiStartSieheAlleUSER*********************************************************************************************************

        DatenBank dbk1 = new DatenBank();

        String ausgabeGesamtString = "SELECT * FROM userMubea";
        dbk1.ausgebenGesamtDB(ausgabeGesamtString);
//********************************************************************************************************************************
        launch();//

    }

    @Override
    public void start(Stage primaryStageHauptfenster) throws Exception {
        primaryStageHauptfenster.setTitle("JavaFX GUI - Mubea (- ASMA - Anlagenspezifischer Stör-Meldungs-Absetzer)");
        primaryStageHauptfenster.setScene(Login.createLoginScene(primaryStageHauptfenster));
        primaryStageHauptfenster.show();

        //Damit Fenster Programm auch schliesst
        primaryStageHauptfenster.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });


    }
}


//        //String url = "'jdbc:mysql://localhost:3306/mysql";
//        String url1 = "jdbc:mariadb://localhost:3306/databaseliste";//name von "database liste"
//        String user1 = "root";
//        String password1 = "Mubea2020!";

//        String einfuegString1 = "INSERT INTO listlaender" +
//                "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
//                "VALUES  ('Malrrrta', 'VWWW', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";
//
//        //dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu
//        dbk1.schreibeDB(einfuegString1);
//String ausgabeNurEineSpalte = "Vorname";
//    dbk1.ausgabeNurEineSpalteDB(ausgabeNurEineSpalte);

//        String LoginSucheVornameMitNameAusDB = "Hans";
//       // dbk1.SucheVornameMitNameDB(LoginSucheVornameMitNameAusDB);
//        String ausgabeSucheVornameMitNameDB = dbk1.SucheVornameMitNameDB(LoginSucheVornameMitNameAusDB);
//        System.out.println("StringausgabeSucheVornameMitNameDB" + ausgabeSucheVornameMitNameDB);

//    String vornameLogin = "Hans";


//String ausgabeGesamtString2 = "SELECT * FROM userMubea WHERE Vorname = 'Hans'";
//String ausgabeGesamtString2 = "SELECT * FROM userMubea WHERE Vorname = '"+vornameLogin+"'";
// dbk1.ausgebenGesamtDBRetourString(ausgabeGesamtString2);

// String ausgabeGesamtString3 = "SELECT group_Concat(MA_Nummer , Vorname, Nachname , Passwort_User SEPARATOR '*') FROM userMubea WHERE Vorname = 'Hans'";


//String vornameLogin1 = "Hans";
//String ausgabeGesamtString2 = "SELECT * FROM userMubea WHERE Vorname = 'Hans'";
//    String ausgabeGesamtString22 = "SELECT * FROM userMubea WHERE Vorname = '"+vornameLogin+"'";
//dbk1.ausgebenGesamtDBRetourString(ausgabeGesamtString22);

//    String ausgabeSucheVornameMitNameDB = dbk1.ausgebenGesamtDBRetourString(ausgabeGesamtString22);
//    System.out.println("StringausgabeSucheVornameMitNameDB: " + ausgabeSucheVornameMitNameDB);


//primaryStageHauptfenster.setScene(Login.createLoginScene(new ScrollPane(primaryStageHauptfenster)));
//primaryStageHauptfenster.setScene(new ScrollPane(Login.createLoginScene(primaryStageHauptfenster)));
//stage.setScene(new Scene(new ScrollPane(vbox)));//mit scrollpane drin (youtube)
//**********************************************************************************************************************