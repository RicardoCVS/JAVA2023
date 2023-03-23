import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFRames2 extends JFrame implements ActionListener {

    private JLabel labelImagen;
    private JButton botonSeleccionar;

    private JButton botonCancelar;

    public JFRames2() {
        super("Seleccionar imagen");

        labelImagen = new JLabel();
        botonSeleccionar = new JButton("Seleccionar imagen");
        botonSeleccionar.addActionListener(this);
        botonCancelar = new JButton("Salir");
        botonCancelar.addActionListener(this);

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonSeleccionar);
        panelBotones.add(botonCancelar);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panelBotones, BorderLayout.NORTH);
        container.add(labelImagen, BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonSeleccionar) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "gif");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File archivoImagen = chooser.getSelectedFile();
                ImageIcon imagen = new ImageIcon(archivoImagen.getPath());
                labelImagen.setIcon(imagen);
            }
        }else if (e.getSource() == botonCancelar) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new JFRames2();
    }
}
