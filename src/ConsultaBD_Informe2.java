
import javax.swing.table.*;
import java.sql.*;

public class  ConsultaBD_Informe2 extends DefaultTableModel {
  ResultSet datos;
  public ConsultaBD_Informe2(){
      this.addColumn("Identifiación del Proyecto");
      this.addColumn("Constructora");
      this.addColumn("Número de habitaciones");
      this.addColumn("Ciudad");

    try {
      Connection c = DriverManager.getConnection("jdbc:sqlite:/home/martin/Documents/MisonTic/Unidad 5/Reto5/Reto5/BD/ProyectosConstruccion.db");

      Statement stmt = c.createStatement();
      String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND (Ciudad = 'Santa Marta' OR Ciudad ='Barranquilla' OR Ciudad = 'Cartagena');";
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

