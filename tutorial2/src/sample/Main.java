package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import java.net.URL;
import java.io.File;
import java.nio.file.Paths;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Main extends Application
{
    Stage window;
    Scene menu, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene10, scene11, scene12, scene14, scene15, scene16, scene17, scene18, score1, score2, score3;
    int scoreOne, scoreTwo, scoreThree;
    boolean done1 = false;
    boolean done2 = false;
    boolean done3 = false;

    public static void main(String[]args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {


        //sound stuff
        //level 1
        String sound101 = "1.1.m4a";
        Media Sound101 = new Media(Paths.get(sound101).toUri().toString());
        MediaPlayer mp101 = new MediaPlayer(Sound101);

        String sound102 = "1.2.m4a";
        Media Sound102 = new Media(Paths.get(sound102).toUri().toString());
        MediaPlayer mp102 = new MediaPlayer(Sound102);

        String sound103 = "1.3.m4a";
        Media Sound103 = new Media(Paths.get(sound103).toUri().toString());
        MediaPlayer mp103 = new MediaPlayer(Sound103);

        String sound104 = "1.4.m4a";
        Media Sound104 = new Media(Paths.get(sound104).toUri().toString());
        MediaPlayer mp104 = new MediaPlayer(Sound104);

        String sound105 = "1.5.m4a";
        Media Sound105 = new Media(Paths.get(sound105).toUri().toString());
        MediaPlayer mp105 = new MediaPlayer(Sound105);

        //level 2
        String sound201 = "2.1.m4a";
        Media Sound201 = new Media(Paths.get(sound201).toUri().toString());
        MediaPlayer mp201 = new MediaPlayer(Sound201);

        String sound202 = "2.2.m4a";
        Media Sound202 = new Media(Paths.get(sound202).toUri().toString());
        MediaPlayer mp202 = new MediaPlayer(Sound202);

        String sound203 = "2.3.m4a";
        Media Sound203 = new Media(Paths.get(sound203).toUri().toString());
        MediaPlayer mp203 = new MediaPlayer(Sound203);

        String sound204 = "2.4.m4a";
        Media Sound204 = new Media(Paths.get(sound204).toUri().toString());
        MediaPlayer mp204 = new MediaPlayer(Sound204);

        String sound205 = "2.5.m4a";
        Media Sound205 = new Media(Paths.get(sound205).toUri().toString());
        MediaPlayer mp205 = new MediaPlayer(Sound205);

        //level 3
        String sound301 = "3.1.m4a";
        Media Sound301 = new Media(Paths.get(sound301).toUri().toString());
        MediaPlayer mp301 = new MediaPlayer(Sound301);

        String sound302 = "3.2.m4a";
        Media Sound302 = new Media(Paths.get(sound302).toUri().toString());
        MediaPlayer mp302 = new MediaPlayer(Sound302);

        String sound303 = "3.3.m4a";
        Media Sound303 = new Media(Paths.get(sound303).toUri().toString());
        MediaPlayer mp303 = new MediaPlayer(Sound303);

        //END OF ALL THE SOUND STUFF


        window = primaryStage;

        Label maintitle = new Label("Welcome to the music quiz!");
        Label question101 = new Label("Is this scale major or minor? (Question #1)");
        Button level1 = new Button("Level 1");
        level1.setOnAction(e -> window.setScene(scene2));
        Button level2 = new Button("Level 2");
        level2.setOnAction(e -> window.setScene(scene3));
        Button level3 = new Button("Level 3");
        level3.setOnAction(e -> window.setScene(scene14));
        level1.setTranslateX(125);
        level1.setTranslateY(70);
        level2.setTranslateX(125);
        level2.setTranslateY(90);
        level3.setTranslateX(125);
        level3.setTranslateY(110);

        VBox menulayout = new VBox(30);
        menulayout.getChildren().addAll(maintitle, level1, level2, level3);
        menu = new Scene(menulayout, 300, 450);

        window.setScene(menu);
        window.setTitle("Music Quiz");
        window.show();

        //LEVEL 1
        scoreOne = 0;

        //level 1 question 1
        Button play101 = new Button("Click here to play scale");
        play101.setTranslateX(125);
        play101.setTranslateY(50);
        play101.setOnAction(e -> mp101.play());
        VBox questionlayout101 = new VBox(30);
        CheckBox check10101 = new CheckBox("Major");
        CheckBox check10102 = new CheckBox("Minor");
        Button next101 = new Button("Next question");
        next101.setOnAction(e -> window.setScene(scene5));
        check10101.setTranslateX(125);
        check10101.setTranslateY(45);
        check10102.setTranslateX(125);
        check10102.setTranslateY(40);
        next101.setTranslateX(125);
        next101.setTranslateY(45);
        questionlayout101.getChildren().addAll(question101, play101, check10101, check10102, next101);
        scene2 = new Scene(questionlayout101, 400, 400);
        check10101.setOnAction(e -> {
            boolean selected10101 = check10101.isSelected();
            if(selected10101 == true)
            {
                scoreOne++;
            }
            System.out.println(scoreOne);
        });


        //level 1 question 2
        VBox questionlayout102 = new VBox(30);
        Label question102 = new Label("Is this scale major, minor, or none? (Question #2)");
        CheckBox check10201 = new CheckBox("Major");
        CheckBox check10202 = new CheckBox("Minor");

        check10202.setOnAction(e -> {
            boolean selected10202 = check10202.isSelected();
            if(selected10202 == true)
            {
                scoreOne++;
            }
            System.out.println(scoreOne);
        });

        CheckBox check10203 = new CheckBox("None");
        Button next102 = new Button("Next question");
        Button play102 = new Button("Click here to play scale");
        play102.setTranslateX(125);
        play102.setTranslateY(50);
        play102.setOnAction(e -> mp102.play());
        next102.setOnAction(e -> window.setScene(scene6));
        questionlayout102.getChildren().addAll(question102, play102, check10201, check10202, check10203, next102);
        check10201.setTranslateX(125);
        check10201.setTranslateY(45);
        check10202.setTranslateX(125);
        check10202.setTranslateY(40);
        check10203.setTranslateX(125);
        check10203.setTranslateY(40);
        next102.setTranslateX(125);
        next102.setTranslateY(45);
        scene5 = new Scene(questionlayout102, 400, 400);

        //level 1 question 3
        VBox questionlayout103 = new VBox(30);
        Label question103 = new Label("Is this scale major, minor, or none? (Question #3)");
        CheckBox check10301 = new CheckBox("Major");
        CheckBox check10302 = new CheckBox("Minor");

        check10302.setOnAction(e -> {
            boolean selected10302 = check10302.isSelected();
            if(selected10302 == true)
            {
                scoreOne++;
            }
        });

        CheckBox check10303 = new CheckBox("None");
        Button next103 = new Button("Next question");
        Button play103 = new Button("Click here to play scale");
        play103.setTranslateX(125);
        play103.setTranslateY(50);
        play103.setOnAction(e -> mp103.play());
        next103.setOnAction(e -> window.setScene(scene7));
        questionlayout103.getChildren().addAll(question103, play103, check10301, check10302, check10303, next103);
        check10301.setTranslateX(125);
        check10301.setTranslateY(45);
        check10302.setTranslateX(125);
        check10302.setTranslateY(40);
        check10303.setTranslateX(125);
        check10303.setTranslateY(40);
        next103.setTranslateX(125);
        next103.setTranslateY(45);
        scene6 = new Scene(questionlayout103, 400, 400);

        //level 1 question 4
        VBox questionlayout104 = new VBox(30);
        Label question104 = new Label("Is this interval major or minor? (Question #4)");
        CheckBox check10401 = new CheckBox("Major");

        check10401.setOnAction(e -> {
            boolean selected10401 = check10401.isSelected();
            if(selected10401 == true)
            {
                scoreOne++;
            }
        });

        CheckBox check10402 = new CheckBox("Minor");
        Button next104 = new Button("Next question");
        Button play104 = new Button("Click here to play the interval");
        play104.setTranslateX(125);
        play104.setTranslateY(50);
        play104.setOnAction(e -> mp104.play());
        next104.setOnAction(e -> window.setScene(scene8));
        questionlayout104.getChildren().addAll(question104, play104, check10401, check10402, next104);
        check10401.setTranslateX(125);
        check10401.setTranslateY(45);
        check10402.setTranslateX(125);
        check10402.setTranslateY(40);
        next104.setTranslateX(125);
        next104.setTranslateY(45);
        scene7 = new Scene(questionlayout104, 400, 400);

        //level 1 question 5
        VBox questionlayout105 = new VBox(30);
        Label question105 = new Label("Is this a major or minor triad? (Question #5)");
        CheckBox check10501 = new CheckBox("Major");

        check10501.setOnAction(e -> {
            boolean selected10501 = check10501.isSelected();
            if(selected10501 == true)
            {
                scoreOne++;
            }
            System.out.println(scoreOne);
        });


        CheckBox check10502 = new CheckBox("Minor");
        Button next105 = new Button("Done!!!");
        Button play105 = new Button("Click here to play the triad");
        play105.setTranslateX(125);
        play105.setTranslateY(50);
        play105.setOnAction(e -> mp105.play());
        next105.setOnAction(e -> window.setScene(score1));
//        next105.setOnAction(e -> done1 = true);
        questionlayout105.getChildren().addAll(question105, play105, check10501, check10502, next105);
        check10501.setTranslateX(125);
        check10501.setTranslateY(45);
        check10502.setTranslateX(125);
        check10502.setTranslateY(40);
        next105.setTranslateX(125);
        next105.setTranslateY(45);
        scene8 = new Scene(questionlayout105, 400, 400);

        //level 1 score
            VBox scorelayout1 = new VBox(30);
            System.out.println(scoreOne + "hello");
            Label scorelabel1 = new Label("Your score is....... " + scoreOne + "/5");
            Button menuscore1 = new Button("Click here to go back to the main menu");
            menuscore1.setOnAction(e -> window.setScene(menu));
            menuscore1.setTranslateX(90);
            menuscore1.setTranslateY(250);
            scorelayout1.getChildren().addAll(scorelabel1, menuscore1);
            score1 = new Scene(scorelayout1, 400, 400);

        //LEVEL 2
        scoreTwo = 0;

        //level 2 question 1
        VBox questionlayout201 = new VBox(30);
        Label question201 = new Label("Is this scale a harmonic or melodic minor? (Question #1)");
        CheckBox check20101 = new CheckBox("Harmonic");
        CheckBox check20102 = new CheckBox("Melodic");

        check20102.setOnAction(e -> {
            boolean selected20102 = check20102.isSelected();
            if(selected20102 == true)
            {
                scoreTwo++;
            }
        });

        Button next201 = new Button("Next question");
        Button play201 = new Button("Click here to play the scale");
        play201.setTranslateX(125);
        play201.setTranslateY(50);
        play201.setOnAction(e -> mp201.play());
        next201.setOnAction(e -> window.setScene(scene4));
        questionlayout201.getChildren().addAll(question201, play201, check20101, check20102, next201);
        check20101.setTranslateX(125);
        check20101.setTranslateY(45);
        check20102.setTranslateX(125);
        check20102.setTranslateY(40);
        next201.setTranslateX(125);
        next201.setTranslateY(45);
        scene3 = new Scene(questionlayout201, 400, 400);

        //level 2 question 2
        VBox questionlayout202 = new VBox(30);
        Label question202 = new Label("Is this scale a harmonic, melodic, or natural minor? (Question #2)");
        CheckBox check20201 = new CheckBox("Harmonic");

        check20201.setOnAction(e -> {
            boolean selected20201 = check20201.isSelected();
            if(selected20201 == true)
            {
                scoreTwo++;
            }
        });

        CheckBox check20202 = new CheckBox("Melodic");
        CheckBox check20203 = new CheckBox("Natural");
        Button next202 = new Button("Next question");
        Button play202 = new Button("Click here to play the scale");
        play202.setTranslateX(125);
        play202.setTranslateY(50);
        play202.setOnAction(e -> mp202.play());
        next202.setOnAction(e -> window.setScene(scene10));
        questionlayout202.getChildren().addAll(question202, play202, check20201, check20202, check20203, next202);
        check20201.setTranslateX(125);
        check20201.setTranslateY(45);
        check20202.setTranslateX(125);
        check20202.setTranslateY(40);
        check20203.setTranslateX(125);
        check20203.setTranslateY(40);
        next202.setTranslateX(125);
        next202.setTranslateY(45);
        scene4 = new Scene(questionlayout202, 400, 400);

        //level 2 question 3
        VBox questionlayout203 = new VBox(30);
        Label question203 = new Label("Is this scale a melodic minor or major? (Question #3)");
        CheckBox check20301 = new CheckBox("Melodic minor");
        CheckBox check20302 = new CheckBox("Melodic major");

        check20302.setOnAction(e -> {
            boolean selected20302 = check20302.isSelected();
            if(selected20302 == true)
            {
                scoreTwo++;
            }
        });

        Button next203 = new Button("Next question");
        Button play203 = new Button("Click here to play the scale");
        play203.setTranslateX(125);
        play203.setTranslateY(50);
        play203.setOnAction(e -> mp203.play());
        next203.setOnAction(e -> window.setScene(scene11));
        questionlayout203.getChildren().addAll(question203, play203, check20301, check20302, next203);
        check20301.setTranslateX(125);
        check20301.setTranslateY(45);
        check20302.setTranslateX(125);
        check20302.setTranslateY(40);
        next203.setTranslateX(125);
        next203.setTranslateY(45);
        scene10 = new Scene(questionlayout203, 400, 400);

        //level 2 question 4
        VBox questionlayout204 = new VBox(30);
        Label question204 = new Label("Is this interval a perfect fourth or major third? (Question #4)");
        CheckBox check20401 = new CheckBox("Perfect fourth");

        check20401.setOnAction(e -> {
            boolean selected20401 = check20401.isSelected();
            if(selected20401 == true)
            {
                scoreTwo++;
            }
        });

        CheckBox check20402 = new CheckBox("Major third");
        Button next204 = new Button("Next question");
        Button play204 = new Button("Click here to play the scale");
        play204.setTranslateX(125);
        play204.setTranslateY(50);
        play204.setOnAction(e -> mp204.play());
        next204.setOnAction(e -> window.setScene(scene12));
        questionlayout204.getChildren().addAll(question204, play204, check20401, check20402, next204);
        check20401.setTranslateX(125);
        check20401.setTranslateY(45);
        check20402.setTranslateX(125);
        check20402.setTranslateY(40);
        next204.setTranslateX(125);
        next204.setTranslateY(45);
        scene11 = new Scene(questionlayout204, 400, 400);

        //level 2 question 5
        VBox questionlayout205 = new VBox(30);
        Label question205 = new Label("Is this interval a minor sixth or major seventh? (Question #5)");
        CheckBox check20501 = new CheckBox("Minor sixth");
        CheckBox check20502 = new CheckBox("Major seventh");

        check20502.setOnAction(e -> {
            boolean selected20502 = check20502.isSelected();
            if(selected20502 == true)
            {
                scoreTwo++;
            }
        });

        Button next205 = new Button("Done!!!");
        Button play205 = new Button("Click here to play the scale");
        play205.setTranslateX(125);
        play205.setTranslateY(50);
        play205.setOnAction(e -> mp205.play());
        next205.setOnAction(e -> window.setScene(score2));
        questionlayout205.getChildren().addAll(question205, play205, check20501, check20502, next205);
        check20501.setTranslateX(125);
        check20501.setTranslateY(45);
        check20502.setTranslateX(125);
        check20502.setTranslateY(40);
        next205.setTranslateX(125);
        next205.setTranslateY(45);
        scene12 = new Scene(questionlayout205, 400, 400);

        //level 2 score
        VBox scorelayout2 = new VBox(30);
        Label scorelabel2 = new Label("Your score is....... " + scoreTwo + "/5");
        Button menuscore2 = new Button("Click here to go back to the main menu");
        menuscore2.setOnAction(e -> window.setScene(menu));
        menuscore2.setTranslateX(90);
        menuscore2.setTranslateY(250);
        scorelayout2.getChildren().addAll(scorelabel2, menuscore2);
        score2 = new Scene(scorelayout2, 400, 400);

        //LEVEL 3
        scoreThree = 0;

        //level 3 question 1
        VBox questionlayout301 = new VBox(30);
        Label question301 = new Label("Is this scale aeolian or mixolydian? (Question #1)");
        CheckBox check30101 = new CheckBox("Aeolian");
        CheckBox check30102 = new CheckBox("Mixolydian");

        check30102.setOnAction(e -> {
            boolean selected30102 = check30102.isSelected();
            if(selected30102 == true)
            {
                scoreThree++;
            }
        });

        Button next301 = new Button("Next question");
        Button play301 = new Button("Click here to play the scale");
        play301.setTranslateX(125);
        play301.setTranslateY(50);
        play301.setOnAction(e -> mp301.play());
        next301.setOnAction(e -> window.setScene(scene15));
        questionlayout301.getChildren().addAll(question301, play301, check30101, check30102, next301);
        check30101.setTranslateX(125);
        check30101.setTranslateY(45);
        check30102.setTranslateX(125);
        check30102.setTranslateY(40);
        next301.setTranslateX(125);
        next301.setTranslateY(45);
        scene14 = new Scene(questionlayout301, 400, 400);

        //level 3 question 2
        VBox questionlayout302 = new VBox(30);
        Label question302 = new Label("Is this scale dorian or locrian? (Question #2)");
        CheckBox check30201 = new CheckBox("Dorian");

        check30102.setOnAction(e -> {
            boolean selected30102 = check30102.isSelected();
            if(selected30102 == true)
            {
                scoreThree++;
            }
        });

        CheckBox check30202 = new CheckBox("Locrian");
        Button next302 = new Button("Next question");
        Button play302 = new Button("Click here to play the scale");
        play302.setTranslateX(125);
        play302.setTranslateY(50);
        play302.setOnAction(e -> mp302.play());
        next302.setOnAction(e -> window.setScene(scene16));
        questionlayout302.getChildren().addAll(question302, play302, check30201, check30202, next302);
        check30201.setTranslateX(125);
        check30201.setTranslateY(45);
        check30202.setTranslateX(125);
        check30202.setTranslateY(40);
        next302.setTranslateX(125);
        next302.setTranslateY(45);
        scene15 = new Scene(questionlayout302, 400, 400);

        //level 3 question 3
        VBox questionlayout303 = new VBox(30);
        Label question303 = new Label("Is this scale ionian or phrygian? (Question #3)");
        CheckBox check30301 = new CheckBox("Ionian");
        CheckBox check30302 = new CheckBox("Phrygian");
        Button next303 = new Button("Next question");
        Button play303 = new Button("Click here to play the scale");
        play303.setTranslateX(125);
        play303.setTranslateY(50);
        play303.setOnAction(e -> mp303.play());
        next303.setOnAction(e -> window.setScene(scene17));
        questionlayout303.getChildren().addAll(question303, play303, check30301, check30302, next303);
        check30301.setTranslateX(125);
        check30301.setTranslateY(45);
        check30302.setTranslateX(125);
        check30302.setTranslateY(40);
        next303.setTranslateX(125);
        next303.setTranslateY(45);
        scene16 = new Scene(questionlayout303, 400, 400);

        //level 3 question 4
        VBox questionlayout304 = new VBox(30);
        Label question304 = new Label("The gigue and allemande were two dance styles that were from what musical time period? (Question #4)");
        CheckBox check30401 = new CheckBox("Classical");
        CheckBox check30402 = new CheckBox("Romantic");
        CheckBox check30403 = new CheckBox("Baroque");
        CheckBox check30404 = new CheckBox("Contemporary");
        Button next304 = new Button("Next question");
        next304.setOnAction(e -> window.setScene(scene18));
        questionlayout304.getChildren().addAll(question304, check30401, check30402, check30403, check30404, next304);
        check30401.setTranslateX(125);
        check30401.setTranslateY(45);
        check30402.setTranslateX(125);
        check30402.setTranslateY(40);
        check30403.setTranslateX(125);
        check30403.setTranslateY(40);
        check30404.setTranslateX(125);
        check30404.setTranslateY(40);
        next304.setTranslateX(125);
        next304.setTranslateY(45);
        scene17 = new Scene(questionlayout304, 560, 500);

        //level 3 question 5
        VBox questionlayout305 = new VBox(30);
        Label question305 = new Label("The word piano is a shortened form of _______, the Italian term for the early 1700s versions of the instrument. Fill in the blank. (Question #5)");
        CheckBox check30501 = new CheckBox("Fortepiano");
        CheckBox check30502 = new CheckBox("Pianoforte");
        CheckBox check30503 = new CheckBox("Pianaristic");
        CheckBox check30504 = new CheckBox("Pianissimo");
        Button next305 = new Button("Done!!!");
        next305.setOnAction(e -> window.setScene(score3));
        questionlayout305.getChildren().addAll(question305, check30501, check30502, check30503, check30504, next305);
        check30501.setTranslateX(125);
        check30501.setTranslateY(45);
        check30502.setTranslateX(125);
        check30502.setTranslateY(40);
        check30503.setTranslateX(125);
        check30503.setTranslateY(40);
        check30504.setTranslateX(125);
        check30504.setTranslateY(40);
        next305.setTranslateX(125);
        next305.setTranslateY(45);
        scene18 = new Scene(questionlayout305, 750, 500);

        //level 3 score
        VBox scorelayout3 = new VBox(30);
        Label scorelabel3 = new Label("Your score is....... " + scoreThree + "/5");
        Button menuscore3 = new Button("Click here to go back to the main menu");
        menuscore3.setOnAction(e -> window.setScene(menu));
        menuscore3.setTranslateX(90);
        menuscore3.setTranslateY(250);
        scorelayout3.getChildren().addAll(scorelabel3, menuscore3);
        score3 = new Scene(scorelayout3, 400, 400);

//        window.setScene(menu);
//        window.setTitle("Music Quiz");
//        window.show();

//        check10101.setOnAction(e -> {
//            boolean selected10101 = check10101.isSelected();
//            if(selected10101 == true)
//            {
//                scoreOne++;
//            }
//        });
    }
}





