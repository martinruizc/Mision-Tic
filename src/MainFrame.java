
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class MainFrame extends JFrame{

  public void paint(Graphics g) {       
    // Creando MenuBar y agregando componentes
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Informes");
    JMenu m2 = new JMenu("Info");
    mb.add(m1);
    mb.add(m2);
    JMenuItem m11 = new JMenuItem("Informe 1");
    JMenuItem m12 = new JMenuItem("Informe 2");
    JMenuItem m13 = new JMenuItem("Informe 3");
    m1.add(m11);
    m1.add(m12);
    m1.add(m13);
    

    //JPanel panelCargador = new JPanel();

    setLayout(new BorderLayout());
    add(mb, BorderLayout.NORTH);
    //add(panelCargador, BorderLayout.CENTER);
    setSize(1000, 600);
    setVisible(true);
    setTitle("Ministerio de Vivienda");
    
    Toolkit t=Toolkit.getDefaultToolkit();  
    Image i=t.getImage("/home/martin/Documents/MisonTic/Unidad 5/Reto5/Reto5/src/img/logo.png");  
    g.drawImage(i, 0,0,this);
    
  

    
    

    //Métodos de los Items
    m11.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        Informe1 informeLamada1 = new Informe1();
      }
      
    });

    m12.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        Informe2 informe1Llamada2 = new Informe2();        
      }
      
    });

    m13.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        Informe3 informe1Llamada3 = new Informe3();        
      }
      
    });
  
  }

       
  public static void main(String args[]) {
    MainFrame frame = new MainFrame();
    frame.setVisible(true);
  }
}


