
import javax.swing.table.*;
import java.sql.*;

public class  ConsultaBD_Informe1 extends DefaultTableModel {
  ResultSet datos;
  public ConsultaBD_Informe1(){
      this.addColumn("Identifiación del lider");
      this.addColumn("Nombre");
      this.addColumn("Primer Apellido");
      this.addColumn("Ciudad de residencia");

    try {
      Connection c = DriverManager.getConnection("jdbc:sqlite:/home/martin/Documents/MisonTic/Unidad 5/Reto5/Reto5/BD/ProyectosConstruccion.db");

      Statement stmt = c.createStatement();
      String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
      datos = stmt.executeQuery(consulta);

      while(datos.next()){
        Object [] fila = new Object[4];
        for(int i = 0; i<4; i++){
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

