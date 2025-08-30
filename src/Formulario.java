import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario extends JFrame
{
    private JPanel ventana;


    public static void main(String[] args)
    {
        Formulario ventana = new Formulario();
        ventana.setContentPane(ventana.ventana);
        ventana.setBounds(300,200,400,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
