package riviera.gui;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Graphics;

public class RoundEdgedBorder extends LineBorder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int arcWidth = 12, arcHeight = 12;
	private Color fillColor = new Color(240, 240, 240);
	
	public RoundEdgedBorder()
	{
		super(Color.red);
	}
	
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
	{ 
		g.setColor(fillColor); 
		g.fillRoundRect(x, y, width, height, arcWidth, arcHeight); 
	}
}
