package Abteilungen.AnlagenAnarbeit;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author - John Schmidt
 * 12.12.2021, 20:44
 */
public class Rattunde3 {
    Pane cardsPane = new StackPane();//wie machen mit eigener Klasse, muss Konstructor haben

    public Rattunde3(Pane cardsPane){
        this.cardsPane=cardsPane;
    }

    public Group macheRattunde3(){
        final Group cardRattunde3 = new Group(new Text(25, 25, "Rattunde 3 blabvlabla"));
        return cardRattunde3;
    }
}