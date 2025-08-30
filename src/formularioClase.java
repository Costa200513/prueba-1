import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class formularioClase extends JFrame
{

    private JPanel ventana;
    private JLabel lblTitulo1;
    private JCheckBox chkGuitarra;
    private JCheckBox chkCine;
    private JRadioButton rbtnMasculino;
    private JRadioButton rbtnFemenino;
    private JLabel lblTitulo2;
    private JButton btnEnviar;
    private JPasswordField pwdContra;
    private JCheckBox chkMostrar;
    private JCheckBox chkAceptar;


    public formularioClase()
    {

        btnEnviar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                StringBuilder respuestas = new StringBuilder("Tus respuestas: \n");
                //checkBox
                if(chkGuitarra.isSelected())
                {
                    respuestas.append("Toco la guitarra");
                }
                if(chkCine.isSelected())
                {
                    respuestas.append("Voy al cine");
                }
                verBotones(respuestas);

                JOptionPane.showMessageDialog(null, respuestas);
            }
        });

        chkMostrar.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent chkMostrar)
            {
                if(chkMostrar.getStateChange() == ItemEvent.SELECTED)
                {
                    pwdContra.setEchoChar((char) 0);
                }
                else
                {
                    pwdContra.setEchoChar('*');
                }
            }
        });

        chkAceptar.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent chkAceptar)
            {
                if(chkAceptar.getStateChange() == ItemEvent.SELECTED)
                {
                    btnEnviar.setEnabled(true);
                }
                else
                {
                    btnEnviar.setEnabled(false);
                }
            }
        });
    }
    public void verBotones(StringBuilder respuestas)
    {
        //Radio Botones
        if(rbtnMasculino.isSelected())
        {
            respuestas.append("\nSexo: Masculino");
        }
        else if(rbtnFemenino.isSelected())
        {
            respuestas.append("\nSexo: Femenino");
        }
    }
    public static void main(String[] args)
    {
        formularioClase ventana = new formularioClase();
        ventana.setContentPane(ventana.ventana);
        ventana.setBounds(300,200,400,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
