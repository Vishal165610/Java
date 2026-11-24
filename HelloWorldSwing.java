import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

 class HelloWorldSwing extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call superclass method
        g.drawString("Hello, World!", 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new HelloWorldSwing());
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}