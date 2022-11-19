import java.applet.Applet;
import java.awt.*;

public class kri extends Applet {
    int height, width;
    public void init()
    {
        height =getSize().height;
        width =getSize().width;
        setName("myapplet");
    }
    public void paint(Graphics g)
    {
        g.drawRoundRect(23,36,125,125,4,6);
    }
}
