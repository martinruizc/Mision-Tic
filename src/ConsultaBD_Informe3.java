
import javax.swing.table.*;
import java.sql.*;

public class  ConsultaBD_Informe3 extends DefaultTableModel {
  ResultSet datos;
  public ConsultaBD_Informe3(){
      this.addColumn("Identifiación de la Compra");
      this.addColumn("Constructora");
      this.addColumn("Banco Vinculado");
      

    try {
      Connection c = DriverManager.getConnection("jdbc:sqlite:/home/martin/Documents/MisonTic/Unidad 5/Reto5/Reto5/BD/ProyectosConstruccion.db");

      Statement stmt = c.createStatement();
      String consulta = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE Proveedor ='Homecenter' AND Ciudad = 'Salento';";
      datos = stmt.executeQuery(consulta);

      while(datos.next()){
        Object [] fila = new Object[3];
        for(int i = 0; i<3; i++){
          fila[i] = datos.getObject(i+1);
        }
        this.addRow(fila);
      }
      c.close();
      System.out.println("La consulta se realizó con éxito");
      
  
    } catch (Exception e) {
    System.err.println(e.getClass().getName() + ": " + e.getMessage());
    }
  }
}

