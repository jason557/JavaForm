import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Form extends JFrame{
    public void init(){
        setTitle("Hello WinForm By Java!!");
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);               
        setVisible(true);
        setResizable(true); 
        setAlwaysOnTop(true);
    }
}
