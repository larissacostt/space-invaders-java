import javax.swing.JFrame;
import game.SpaceInvaders;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame ("Space Invaders");

        int tileSize =32;
        int rows = 16;
        int columns = 16;
        int boardWidth = tileSize * columns;
        int boardHeight = tileSize * columns;

        JFrame frame = new JFrame("Space Invaders");
        frame.setVisible(true);
        frame.setSize(boardHeight, boardWidth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpaceInvaders spaceInvaders = new SpaceInvaders();
        frame.add(spaceInvaders);
        frame.pack();
        frame.setVisible(true);
    }
}

