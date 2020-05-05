import javax.swing.*;

public class Main{
    public static void main(String[] args){
        JFrame frame=new JFrame("Block Breaker By Aman Thukral");
        BlockBreakerPanel panel=new BlockBreakerPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(490,600);
        frame.setResizable(false);
    }
}
