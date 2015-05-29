//GraphicsLab08
//Jeff Wu and Saahit Valiveti

import java.applet.Applet;
import java.awt.*;

public class GraphicsLab08VW  extends Applet
{
	Rectangle red, green, blue, black, cyan;
    int numColor;
    
    int[] xC, yC;
    int pC;
    
    public void init()
    {
        red = new Rectangle(25, 0, 25, 25);
        green = new Rectangle(50, 0, 25, 25);
        blue = new Rectangle(75, 0, 25, 25);
        cyan = new Rectangle(100, 0, 25, 25);
        black = new Rectangle(125, 0, 25, 25);
        numColor = 0;
        
        xC = new int[10000];
        yC = new int[10000];
        pC = 0;
    }
    
    public void paint(Graphics g) 
    {
        g.setColor(Color.RED);
            g.fillRect(25, 0, 25, 25);
        g.setColor(Color.GREEN);
            g.fillRect(50, 0, 25, 25);
        g.setColor(Color.BLUE);
            g.fillRect(75, 0, 25, 25);
        g.setColor(Color.CYAN);
            g.fillRect(100, 0, 25, 25);
        g.setColor(Color.BLACK);
            g.fillRect(125, 0, 25, 25);
            
        
            
       //g.setColor(numColor);
       for (int num = 0; num < pC; num++)
       {
    	   g.fillRect(xC[num], yC[num], 3,3);
       }
    }
    
    public boolean mouseDown(Event e, int x, int y, Graphics g)
    {
        if(red.inside(x,y))
            //numColor = 1;
        	g.setColor(Color.RED);
        else if(green.inside(x,y))
           // numColor = 2;
        	g.setColor(Color.GREEN);
        else if(blue.inside(x,y))
            //numColor = 3;
        	g.setColor(Color.BLUE);
        else if(cyan.inside(x,y))
           // numColor = 4;
        	g.setColor(Color.CYAN);
        else if(black.inside(x,y))
            //numColor = 5;
        	g.setColor(Color.BLACK);
        /*else
            numColor = 6;*/
        
        /*switch(numColor)
        {
            case 1:
                g.setColor(Color.RED);
                //stuff
                break;
            case 2:
                g.setColor(Color.GREEN);
                //stuff
                break;
            case 3:
                g.setColor(Color.BLUE);
                //stuff
                break;
            case 4:
                g.setColor(Color.CYAN);
                //stuff
                break;
            case 5:
                g.setColor(Color.BLACK);
                //stuff
                break;
            case 6:
                g.setColor(Color.BLACK);
                //stuff
                break;
        }*/
        repaint();
        return true;
    }
    
    public boolean mouseDrag(Event e, int x, int y)
    {
        xC[pC] = x;
        yC[pC] = y;
        pC++;
        repaint();
        return true;
        
    }
    
}
