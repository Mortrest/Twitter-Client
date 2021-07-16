//package client.Controllers;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.image.Image;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.ImagePattern;
//import javafx.scene.shape.Circle;
//import client.Config;
//import client.Models.Tweet;
//import client.Logic.Tweets;
//import client.Models.User;
//import client.Logic.Users;
//import client.utils.ChangeScene;
//import client.utils.TweetLoad;
//
//import java.io.IOException;
//
//public class EachTweetController {
//    public Pane overlay1;
//    public GridPane overlayGrid;
//    public Button sendMsg;
//    @FXML
//    private Label nameLabel;
//
//    @FXML
//    private Label tweetLabel;
//
//    @FXML
//    public GridPane grid;
//    @FXML
//    private TextArea textArea;
//    @FXML
//    private Circle profilePicture;
//    @FXML
//    private Button backBtn;
//    @FXML
//    private TextArea overlayText;
//    @FXML
//    private Pane overlay;
//
//
//    public void initialize() throws IOException {
//        if (Tweets.getTweetID() != null) {
//            Tweet tweet = Tweets.search(Tweets.getTweetID());
//            assert tweet != null;
//            User owner = Users.searchUsername(tweet.getOwner());
//            assert owner != null;
//            nameLabel.setText("@" + owner.getUsername() + " - " + owner.getName());
//            tweetLabel.setText(tweet.getText());
//            if (owner.getProfilePic()!= null) {
//                profilePicture.setFill(new ImagePattern(new Image(owner.getProfilePic())));
//            }
//            loadData();
//        }
//    }
//
//    public void loadData() throws IOException {
////        new TweetLoad(grid,textArea,2,overlay,2).load();
//        new TweetLoad(grid, textArea, 2, overlay,overlay1,overlayGrid,sendMsg,2).load();
//
//    }
//
//
//    public void back() throws IOException {
//        if (Tweets.search(Tweets.getTweetID()).getParent().equals("0")){
//            Tweets.setTweetID(null);
//        } else {
//            Tweets.setTweetID(Tweets.search(Tweets.getTweetID()).getParent());
//        }
//        new ChangeScene(Config.getConfig("mainConfig").getProperty((String.class), "Sample"),grid);
//    }
//
//    public void closeOverlay(){
//        overlay.setVisible(false);
//        overlay1.setVisible(false);
//    }
//
//    public void sendComment() {
//        if (overlayText.getText() != null){
//            overlay.setVisible(false);
//            Tweets.makeTweet(overlayText.getText(),Tweets.getComment(),Users.getCurrentUser().getUsername(),Users.getCurrentUser().getFollowers());
//        }
//    }
//}
