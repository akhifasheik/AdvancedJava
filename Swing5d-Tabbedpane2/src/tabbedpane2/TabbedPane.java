/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
package tabbedpane2;
import java.awt.Color;
import javax.swing.*;
 public class TabbedPane {
 JFrame f;
 TabbedPane(){
 f=new JFrame();

 JPanel p1=new JPanel();

 JPanel p2=new JPanel();
 JPanel p3=new JPanel();
 p1.setBackground(Color.CYAN);
 p2.setBackground(Color.MAGENTA);
 p3.setBackground(Color.YELLOW);
 JTabbedPane tp=new JTabbedPane();
 tp.setBounds(50,50,200,200);
 tp.add("CYAN",p1);
 tp.add("MAGENTA",p2);
 tp.add("YELLOW",p3);
 f.add(tp);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
 }
 public static void main(String[] args) {
 new TabbedPane();
 }} 