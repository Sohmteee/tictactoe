import javax.swing.JButton;
import javax.swing.JLabel;

public class data {

    public static int c = 1; //a counter used to determine the player's turn in this game...you'll see what I mean later
    public static int C = 1;
    public static int N = 0; //the user's input
    public static int countDraw = 0; //variable to count the number of turns that have been played without a win. Once it gets to 9 (once every box is filled up), it's considered a draw.
    public static int randomNumber; //random input for computer
    public static int randomStrategy;
    public static int randomX;
    public static int randoX;
    public static int level = 0;
    public static int x;
    public static int o;
    public static int s;
    public static boolean play = true; //boolean to check if the game is still in session. It's set to false if anyone wins, or it ends in a draw
    public static boolean one = false; //from one through nine, these booleans are used to check if their respective boxes have been chosen previously by a player. In short, it's used to make sure that a box isn't chosen more than once
    public static boolean two = false;
    public static boolean three = false;
    public static boolean four = false;
    public static boolean five = false;
    public static boolean six = false;
    public static boolean seven = false;
    public static boolean eight = false;
    public static boolean nine = false;
    public static boolean PlayervsPlayer = true;
    public static boolean rando = true;
    public static boolean randx = true;
    public static boolean ranx = true;
    public static JButton One; // buttons (I'll be referring to them as boxes) from one through nine
    public static JButton Two;
    public static JButton Three;
    public static JButton Four;
    public static JButton Five;
    public static JButton Six;
    public static JButton Seven;
    public static JButton Eight;
    public static JButton Nine;
    public static JButton resetButton;
    public static JButton menuButton;
    public static JButton PVPBtn;
    public static JButton PVCBtn;
    public static JButton EasyBtn;
    public static JButton MediumBtn;
    public static JButton HardBtn;
    public static JLabel info; //a label that shows whose turn it is, who won, when it's a tie, or when an input is invalid
    public static JLabel XLabel;
    public static JLabel OLabel;
    public static JLabel XScore;
    public static JLabel OScore;
    public static String letter; //this is an "X" or "O" depending on whose turn it is

}