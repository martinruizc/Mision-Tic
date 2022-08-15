
import javax.swing.*;

import java.awt.*;

class Informe2 extends JFrame{

  Informe2(){
    TablaModeloInf2 tabla = new TablaModeloInf2();
    JPanel panelInforme2 = new JPanel();
    panelInforme2.setLayout(new BorderLayout());
    panelInforme2.add(tabla, BorderLayout.CENTER);
    add(panelInforme2);

    setTitle("Segundo informe");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setSize(1000, 600);
    setVisible(true);
 
  }
}  