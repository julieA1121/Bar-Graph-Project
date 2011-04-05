import javax.swing.JFrame;

public class BarGraph
{

   public static void main (String args[])
   {
      JFrame frame = new JFrame();
      //SETTING THE SIZE OF THE GRAPHICAL COMPONENET
            final int FRAME_WIDTH = Integer.valueOf(args[0])+10;
            final int FRAME_HEIGHT = Integer.valueOf(args[1])+10;
            int max = findMax(args);
            max = max;
            frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("chartsproject.Main");
            BarComponent component = new BarComponent(max,args);
            frame.add(component);
            
            frame.setVisible(true);

   }
   
   //FINDIND THE MAXIMUM AMONG ALL ARGUMENTS
   static int  findMax(String args[]){
	   
	   int max = Integer.valueOf(args[2]);
	   for(int i=3;i<args.length;i++)	{
		   System.out.print(args[i]+"  ");
		   if(Integer.valueOf(args[i])>max)	{
			   max = Integer.valueOf(args[i]);
	   }
	   }
	   return max;
   }
}
