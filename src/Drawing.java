import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing extends JFrame implements ActionListener, MouseListener {
    Graphics G;
    JButton button1;
    JButton button2;
    int x,y,x1,y1;


    Drawing(String title){
        super(title);
        setSize(1024,720);
        setBackground(Color.GREEN);
        Container container=getContentPane();
        button1=new JButton("畫圓");
        button1.addActionListener(this);
        button2=new JButton("畫線");
        button2.addActionListener(this);
        container.setBackground(getBackground());
        setLayout(new FlowLayout(FlowLayout.LEFT));
        container.add(button1);
        container.add(button2);
        addMouseListener(this);
        setVisible(true);
        G=getGraphics();
    }

    public static void main(String[] args) {
        new Drawing("Drawing");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){

            G.drawOval(x,y,100,100);

        }else if(e.getSource()==button2){
            G.drawLine(x,y,x1,y1);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
