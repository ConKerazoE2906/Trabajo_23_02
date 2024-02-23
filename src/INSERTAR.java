import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class INSERTAR {

    int id;
    String nombre_apellido;
    String pasatiempo;
    String descripcion;


    public INSERTAR(int id, String nombre_apellido, String pasatiempo, String descripcion) {
        this.id = id;
        this.nombre_apellido = nombre_apellido;
        this.pasatiempo = pasatiempo;
        this.descripcion = descripcion;
    }

    public INSERTAR(){}

    public void ingreso_datos(int id, String nombre_apellido, String pasatiempo, String descripcion){
        try(Connection conexion_2 = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10686342", "sql10686342","FZI2EyHqCS")){

            String sql="INSERT INTO pasatiempos(id, nombre, pasatiempos, descripcion)values(?,?,?,?)";

            try(PreparedStatement preparedStatement = conexion_2.prepareStatement(sql)){
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2,nombre_apellido);
                preparedStatement.setString(3,pasatiempo);
                preparedStatement.setString(4, descripcion);
                int filasAfectadas=preparedStatement.executeUpdate();

                if (filasAfectadas>0){
                    System.out.println("Insercion exitosa");
                }
                else {
                    System.out.println("Insercion fallida");
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }


    }
}
