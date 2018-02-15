import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
/*<applet code=setBackgroundCheck.class width=500 height=500>
</applet>
*/
public class setBackgroundCheck extends Applet implements ItemListener{
	Choice c=new Choice("Background Color: ");
	
	public void init(){
		c.add("RED");
		c.add("GREEN");
		c.add("YELLOW");
		add(c);
		addItemListener(this);
	}
	public void getItem(ItemEvent ie){
		String s=ie.getSelectedItem();
		if(s.equals("RED"))setBackground(Color.red);
		if(s.equals("GREEN"))setBackground(Color.green);
		if(s.equals("YELLOW"))setBackground(Color.yellow);
	}
}