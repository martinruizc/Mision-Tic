
import javax.swing.*;

import java.awt.*;

class Informe1 extends JFrame{

  Informe1(){
    TablaModelo tabla = new TablaModelo();
    JPanel panelInforme1 = new JPanel();
    panelInforme1.setLayout(new BorderLayout());
    panelInforme1.add(tabla, BorderLayout.CENTER);
    add(panelInforme1);

    setTitle("Primer Informe");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setSize(1000, 600);
    setVisible(true);
 
  }
}
