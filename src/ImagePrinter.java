import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class ImagePrinter extends JFrame implements ActionListener, Printable {
    private JLabel imageLabel;
    private JButton printButton;
    private JButton selectButton;
    private BufferedImage imageToPrint;

    public ImagePrinter() {
        super("Image Printer");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear los componentes de la interfaz
        imageLabel = new JLabel();
        printButton = new JButton("Imprimir");
        printButton.addActionListener(this);
        selectButton = new JButton("Seleccionar imagen");
        selectButton.addActionListener(this);

        // Agregar los componentes a la ventana
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(selectButton);
        buttonPanel.add(printButton);

        add(imageLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Configurar la ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método para cargar la imagen seleccionada
    private void loadImage(File file) {
        try {
            imageToPrint = ImageIO.read(file);
            imageLabel.setIcon(new ImageIcon(imageToPrint));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Implementar el método print para que se pueda imprimir la imagen
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D g2d = (Graphics2D)graphics;
            double x = pageFormat.getImageableX();
            double y = pageFormat.getImageableY();
            double w = pageFormat.getImageableWidth();
            double h = pageFormat.getImageableHeight();
            double imageWidth = imageToPrint.getWidth();
            double imageHeight = imageToPrint.getHeight();
            double scaleX = w / imageWidth;
            double scaleY = h / imageHeight;
            double scale = Math.min(scaleX, scaleY);

            g2d.translate(x, y);
            g2d.scale(scale, scale);
            g2d.drawImage(imageToPrint, 0, 0, null);
            return Printable.PAGE_EXISTS;
        } else {
            return Printable.NO_SUCH_PAGE;
        }
    }

    // Implementar el método actionPerformed para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == selectButton) {
            // Mostrar un cuadro de diálogo para que el usuario seleccione la imagen
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                loadImage(file);
            }
        } else if (event.getSource() == printButton) {
            // Crear una instancia de PrinterJob para imprimir la imagen
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);

            // Mostrar el cuadro de diálogo para imprimir
            if (job.printDialog()) {
                try {
                    job.print();
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear la instancia de la aplicación
        new ImagePrinter();
    }
}
