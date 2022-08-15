
import javax.swing.*;

import java.awt.*;

public class TablaModeloInf2 extends JPanel{
  ConsultaBD_Informe2 modelo = new ConsultaBD_Informe2();

   public TablaModeloInf2(){
    setLayout(new BorderLayout());
    JTable tabla = new JTable(modelo);

    //Panel Scroll
    JScrollPane panel = new JScrollPane(tabla);
    add(panel, BorderLayout.CENTER);
   }
  }