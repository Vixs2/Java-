import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solution {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Mi actividad");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JButton boton = new JButton("Presionar");
        boton.setBounds(80, 20, 120, 30);

        JLabel etiqueta = new JLabel("Esperando acción...");
        etiqueta.setBounds(80, 60, 200, 30);

        ventana.add(boton);
        ventana.add(etiqueta);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("El botón ha sido presionado.");
            }
        });

        ventana.setVisible(true);
    }
}