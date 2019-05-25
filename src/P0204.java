import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P0204 extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt){
            dispose();
            System.exit(0);
        }

    }

    JButton bt;
    public P0204(String title){
        super(title);
        setSize(1024,768);
        Container cp=getContentPane();
        cp.setBackground(Color.GREEN);
        cp.setLayout(new FlowLayout(FlowLayout.RIGHT));
        bt=new JButton("Exit");
        bt.addActionListener(this);
        cp.add(bt);
        setVisible(true);
        Graphics g=getGraphics();


    }

    public static void main(String[] args) {
        P0204 p0204=new P0204("測試exit");
    }
}
