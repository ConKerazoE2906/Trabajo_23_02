import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXION {

    String servidor;
    String usuario;
    String password;
    String mensaje;

    public CONEXION(String servidor, String usuario, String password) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.password = password;
    }
    public CONEXION(){

    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public void conexionLocal(String servidor, String usuario, String password){

        try (Connection miconnexion= DriverManager.getConnection(servidor,usuario,password)){
            if (miconnexion!=null){
                mensaje="conexion correcta";
                //System.out.println(mensaje);
            }
        }
        catch (SQLException e){
            mensaje="Conexion fallida";
            //System.out.println(mensaje);
            e.printStackTrace();
        }
    }
}
