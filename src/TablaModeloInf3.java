
import javax.swing.*;

import java.awt.*;

public class TablaModeloInf3 extends JPanel{
  ConsultaBD_Informe3 modelo = new ConsultaBD_Informe3();

   public TablaModeloInf3(){
    setLayout(new BorderLayout());
    JTable tabla = new JTable(modelo);

    //Panel Scroll
    JScrollPane panel = new JScrollPane(tabla);
    add(panel, BorderLayout.CENTER);
   }
  }