import javax.swing.JFrame;

public class App extends JFrame {

    
    App(){
    super("Snake Game");
    add(new Board());
    pack();

    setLocationRelativeTo(null);
    setResizable(false);

   
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Board snake = new Board();
    add(snake);

   

     setVisible(true);

    snake.requestFocusInWindow();

    }
    public static void main(String[] args) throws Exception {
    System.out.println("hhhhhhhhhh");
        new App().setVisible(true);
    }
}

