
    import java.applet.*;
import java.awt.*;
    public class dfdf extends Applet
    {
        int height, width;
        public void init()
        {
            height =getSize().height;
            width =getSize().width;
            setName("myapplet");
        }
        public void paint(Graphics g)
        {
            g.drawRoundRect(15,45,140,130,4,8);
        }
    }


