package nl.Programit.urenregistratieGUI.FXComponents;


import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import nl.Programit.urenregistratieModel1.*;

/**
 * Created by udr013 on 3-3-2016.
 */
public class TrainerScene {

    public static Scene getScene(Person person) {
        Person thisPerson = person;
        Text welkomText = new Text("Welkom "+ thisPerson.getFirstName());
        VBox elements = new VBox(welkomText);
        Scene trainerScene = new Scene(elements);
        return trainerScene;
    }





}