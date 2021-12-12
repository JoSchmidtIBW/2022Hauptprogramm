package Abteilungen;

import Abteilungen.AnlagenAnarbeit.*;
import Abteilungen.AnlagenZieherei.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 17:55
 */
public class Zieherei {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Zieherei(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheZiherei(){
        final Group cardZieherei = new Group(new Text(25, 25, "Zieherei"));

        HBox layoutH = new HBox(1);

        Button bAsmag = new Button("ASMAG");
        bAsmag.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new ASMAG(cardsPane).macheAsmag());
            }
        });

        Button bInder = new Button("INDER");
        bInder.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new INDER(cardsPane).macheInder());
            }
        });

        Button bBuelltmann = new Button("Bülltmann");
        bBuelltmann.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new Buelltmann(cardsPane).macheBuelltmann());
            }
        });

        Button bNordSued = new Button("Nord / Süd");
        bNordSued.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new NordSued(cardsPane).macheNordSued());
            }
        });

        Button bSEMA1= new Button("SEMA1");
        bSEMA1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new SEMA1(cardsPane).macheSema1());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });

        Button bSEMA2= new Button("SEMA2 :(");
        bSEMA2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                cardsPane.getChildren().clear();
                cardsPane.getChildren().add(new SEMA2(cardsPane).macheSema2());
                //cardsPane.getChildren().add(new SEMA1(cardsPane).macheSEMA1());
            }
        });


        layoutH.getChildren().addAll(bAsmag,bInder,bBuelltmann,bNordSued,bSEMA1,bSEMA2);
        cardZieherei.getChildren().addAll(layoutH);
        return cardZieherei;
    }
}
