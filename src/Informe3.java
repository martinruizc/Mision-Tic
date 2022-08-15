
import javax.swing.*;

import java.awt.*;

class Informe3 extends JFrame{

  Informe3(){
    TablaModeloInf3 tabla = new TablaModeloInf3();
    JPanel panelInforme3 = new JPanel();
    panelInforme3.setLayout(new BorderLayout());
    panelInforme3.add(tabla, BorderLayout.CENTER);
    add(panelInforme3);

    setTitle("Tercer Informe");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setSize(1000, 600);
    setVisible(true);
 
  }
}