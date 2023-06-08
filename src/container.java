import javax.swing.JFrame;

public class container extends JFrame {
    public container(){
        setTitle("Meu Jogo");
        setSize(1024,728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new container();
    }

}