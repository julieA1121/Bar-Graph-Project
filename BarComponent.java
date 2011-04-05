
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class BarComponent extends JComponent
{
	int max;
	String args[];
	
   public BarComponent(int max, String[] args) {
		// TODO Auto-generated constructor stub
	   this.max	=	max;
	   this.args	=	args;
	}

   //IN THIS METHOD, THE VARIOUS FILLED RECTANGULAR SHAPES ARE DRAWN IN gui
public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      //System.out.println("args[0] "+args[0] +" args[1] " + args[1] +"max = "+ max);
      //CALCULATING THE WIDTH OF RECTANGLE.IT DEPENDS ON THE NUMBER OF ARGUMENTS AND THE WIDTH OF THE GRAPH
      int width  = (Integer.valueOf(args[0])-(5*args.length-1))/(args.length-2);
      //LOOP TO DRAW EACH RECTANGLE
      for (int i=2;i<args.length;i++ )
      {
    	 // double quotient = (Integer.valueOf(args[1])-20)/max;
    	//CALCULATING THE HEIGHT OF EACH RECTANGLE.IT IS RLATIVE TO RECTANGLE OF MAXIMUM HEIGHT
    	  int height =((Integer.valueOf(args[1])-20)*Integer.valueOf(args[i]))/max;
    	  //SETTING DIFFERENT COLOR OF EACH RECTANGLE
    	  g.setColor(new Color(30*i%250, 30*i%250,120));
           
          //DRAWING THE RECTANLE 
    	  g.fillRect((i-2)*width+(5*(i-1)),Integer.valueOf(args[1])-height,width,height);
          //System.out.println(" "+((i-2)*width+(5*(i-1)))+" "+(Integer.valueOf(args[1])-height)+" "+width+" "+height );
             
     }

      
      
   }

}
