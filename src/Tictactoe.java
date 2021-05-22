import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
public class Tictactoe implements ActionListener
{
     JFrame jf;
    int count=0;
    String str=" " ;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    boolean win=false;
    Color c;
    Tictactoe()
  {
 jf=new JFrame();
  jf.setSize(400,300);
  jf.setLocationRelativeTo(null);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jf.setLayout(new GridLayout(3,3));
  
  jb1= new JButton();
  jf.add(jb1);
  jb1.addActionListener(this);
  jb2= new JButton();
  jf.add(jb2);
  jb2.addActionListener(this);
  jb3= new JButton();
  jf.add(jb3);
  jb3.addActionListener(this);
  jb4= new JButton();
  jf.add(jb4);
  jb4.addActionListener(this);
  jb5= new JButton();
  jf.add(jb5);
  jb5.addActionListener(this);
  jb6= new JButton();
  jf.add(jb6);
  jb6.addActionListener(this);
  jb7= new JButton();
  jf.add(jb7);
  jb7.addActionListener(this);
  jb8= new JButton();
  jf.add(jb8);
  jb8.addActionListener(this);
  jb9= new JButton();
  jf.add(jb9);
  jb9.addActionListener(this);
          
  
  jf.setVisible(true);
 
  }
   public static void main(String[] args)
   {
     new Tictactoe();   
   }    
   public void actionPerformed(ActionEvent e)
   {
       count=count+1;
       if(count%2==0)
       {
        str="0"; 
        c=Color.ORANGE;
       }  
       else
       {
         str="X";
         c=Color.PINK;
       }
       Font f=new Font("Arial", 0, 60);
       if(e.getSource()==jb1)
       {
         jb1.setText(str);
         jb1.setBackground(c);
         jb1.setFont(f);
         jb1.setEnabled(false);
       }  
       if(e.getSource()==jb2)
       {
         jb2.setText(str);
         jb2.setBackground(c);
         jb2.setFont(f);
         jb2.setEnabled(false);
       } 
       if(e.getSource()==jb3)
       {
         jb3.setText(str);
         jb3.setBackground(c);
         jb3.setFont(f);
         jb3.setEnabled(false);
       }  
       if(e.getSource()==jb4)
       {
         jb4.setText(str);
         jb4.setBackground(c);
         jb4.setFont(f);
         jb4.setEnabled(false);
       }  
       if(e.getSource()==jb5)
       {
         jb5.setText(str);
         jb5.setBackground(c);
         jb5.setFont(f);
         jb5.setEnabled(false);
       }  
       if(e.getSource()==jb6)
       {
         jb6.setText(str);
         jb6.setBackground(c);
         jb6.setFont(f);
         jb6.setEnabled(false);
       }  
       if(e.getSource()==jb7)
       {
         jb7.setText(str);
         jb7.setBackground(c);
         jb7.setFont(f);
         jb7.setEnabled(false);
       }  
       if(e.getSource()==jb8)
       {
         jb8.setText(str);
         jb8.setBackground(c);
         jb8.setFont(f);
         jb8.setEnabled(false);
       }  
       if(e.getSource()==jb9)
       {
         jb9.setText(str);
         jb9.setBackground(c);
         jb9.setFont(f);
         jb9.setEnabled(false);
       } 
       winPossibilities();
   
   }
   void winPossibilities()
   {   //horizontal win possibilities
       if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb2.getText()!="")
       {
        win=true;
       }
       else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb5.getText()!="")
       {
                win=true;

       }
       else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText()!="")
       {
               win=true;

       }
       //column possibilities
         else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText()!="")
       {
                win=true;

       }
         else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText()!="")
       {
                 win=true;

       }
         else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText()!="")
       {
                win=true;

       }
         //diagonal possibilities
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText()!="")
       {
                 win=true;

       }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText()!="")
       {
                win=true;

       }
        else
       {
                   win=false;
      
       }
     whoWin();
   }
   void whoWin()
   {
       if(win==true)
       {
           JOptionPane.showMessageDialog(jf,str+" wins");
               restart();
       }
       else if(win==false && count==9)
       {
           JOptionPane.showMessageDialog(jf, "MATCH DRAW");
               restart();    
       }
    
   }
     void restart()
     {
        int i=JOptionPane.showConfirmDialog(jf, "Do you want to play game again ?");
        if(i==0)
        {
            count=0;
            str="";
            win=false;
            
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");
            
            jb1.setEnabled(true);
            jb2.setEnabled(true);
            jb3.setEnabled(true);
            jb4.setEnabled(true);
            jb5.setEnabled(true);
            jb6.setEnabled(true);
            jb7.setEnabled(true);
            jb8.setEnabled(true);
            jb9.setEnabled(true);
            
            jb1.setBackground(null);
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);
        }
        else if(i==1)
        {
            System.exit(0);
        }
        else if(i==2)
        {
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);
        }
  
    }       
}
