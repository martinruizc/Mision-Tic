
import javax.swing.*;

import java.awt.*;


public class TablaModelo extends JPanel{
  ConsultaBD_Informe1 modelo = new ConsultaBD_Informe1();

   public TablaModelo(){
    setLayout(new BorderLayout());
    JTable tabla = new JTable(modelo);

    //Panel Scroll
    JScrollPane panel = new JScrollPane(tabla);
    add(panel, BorderLayout.CENTER);
   }
  }

