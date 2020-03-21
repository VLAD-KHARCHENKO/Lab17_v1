import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {
    private Line line;
    private Circle circle;
    private Circle circle1;
    private Circle circle2;
    public GraphicsPanel() {
        line = new Line(285, 165, 317, 165);
        circle = new Circle(250, 100, 100, 100);
        circle1 = new Circle(309, 120, 20, 20);
        circle2 = new Circle(275, 120, 20, 20);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line);
        g2.draw(circle);
        g2.draw(circle1);
        g2.draw(circle2);


    }

    @Override
    public String toString() {
        return "GraphicsPanel{" +
                "line=" + line +
                ", circle=" + circle +
                ", circle1=" + circle1 +
                ", circle2=" + circle2 +
                '}';
    }
}

