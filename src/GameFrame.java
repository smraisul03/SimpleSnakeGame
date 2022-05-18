//Imports
import javax.swing.*;

//GameFrame Class
public class GameFrame extends JFrame {
    //Constructor class
    GameFrame() {
        //Setting up the window frame for the game
        this.add(new GamePanel());
        this.setTitle("Simple Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
