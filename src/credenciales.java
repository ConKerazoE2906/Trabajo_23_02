import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class credenciales {
    private JTextField ingresar_nombre;
    private JTextField ingresar_pasatiempo;
    private JTextField ingresar_id;
    private JTextField ingresar_descripcion;
    private JButton agragarALaBaseButton;
     JPanel pantalla;


    public credenciales() {
        agragarALaBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                INSERTAR insertar_uno = new INSERTAR();
                insertar_uno.ingreso_datos(Integer.parseInt(ingresar_id.getText()),ingresar_nombre.getText(),ingresar_pasatiempo.getText(),ingresar_descripcion.getText());

            }
        });
    }
}
