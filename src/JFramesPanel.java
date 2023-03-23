import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Thu Mar 23 18:36:10 CET 2023
 */



/**
 * @author mati
 */
public class JFramesPanel extends JPanel {
    public JFramesPanel() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        numeroDirecto.setText("1");
    }

    private void button2(ActionEvent e) {
        numeroDirecto.setText("2");
    }

    private void button3(ActionEvent e) {
        numeroDirecto.setText("3");
    }

    private void button4(ActionEvent e) {
        numeroDirecto.setText("4");
    }

    private void button5(ActionEvent e) {
        numeroDirecto.setText("5");
    }

    private void button6(ActionEvent e) {
        numeroDirecto.setText("6");
    }

    private void button7(ActionEvent e) {
        numeroDirecto.setText("7");
    }

    private void button8(ActionEvent e) {
        numeroDirecto.setText("8");
    }

    private void button9(ActionEvent e) {
        numeroDirecto.setText("9");
    }
    private void multiplicar(ActionEvent e) {
        double n1 = Double.parseDouble(numeroDirecto.getText());
        operacion.setText("multiplicar");

    }



    private void numeroDirecto(ActionEvent e) {
        // Obtiene el botón que ha generado el evento
        JButton btn = (JButton) e.getSource();

        // Obtiene el número que se está mostrando actualmente en el botón
        String numeroActual = numeroDirecto.getText();

        // Obtiene el número que representa el botón que ha sido presionado
        String nuevoNumero = btn.getText();

        // Concatena el número nuevo al número actual
        String numeroFinal = numeroActual + nuevoNumero;

        // Actualiza el número que se muestra en el botón
        numeroDirecto.setText(numeroFinal);
    }

    private void borrar(ActionEvent e) {
        // TODO add your code here
    }

    private void dividir(ActionEvent e) {
operacion.setText("dividir");
    }

    private void sumar(ActionEvent e) {
        operacion.setText("sumar");

            double numeroActual = Double.parseDouble(numeroDirecto.getText());
            numeroActual = numeroActual + Double.parseDouble(numeroDirecto.getText());
            operacion.setText(String.valueOf(numeroActual));

        }

    private void restar(ActionEvent e) {
        operacion.setText("restar");
    }

    private void igual(ActionEvent e) {
        // TODO add your code here
    }

    private void button13(ActionEvent e) {
        // TODO add your code here
    }

    private void button0(ActionEvent e) {
        numeroDirecto.setText("0");
    }

    private void operacion(ActionEvent e) {
        operacion.setText("");
    }
    private void resultado(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        // Obtiene el botón que ha generado el evento
        Double n1 = Double.parseDouble(numeroDirecto.getText());
        if(operacion.getText().equals("sumar")){
            double numeroActual = Double.parseDouble(numeroDirecto.getText());
            numeroActual = numeroActual + Double.parseDouble(numeroDirecto.getText());
            operacion.setText(String.valueOf(numeroActual));
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ricardo Castro Vizcaya
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        borrar = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        multiplicar = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        dividir = new JButton();
        sumar = new JButton();
        restar = new JButton();
        igual = new JButton();
        button0 = new JButton();
        resultado = new JButton();
        numeroDirecto = new JButton();
        operacion = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- button1 ----
        button1.setText("1");
        button1.addActionListener(e -> {
			button1(e);
		});
        add(button1, "cell 0 0");

        //---- button2 ----
        button2.setText("2");
        button2.addActionListener(e -> {
			button2(e);
		});
        add(button2, "cell 1 0");

        //---- button3 ----
        button3.setText("3");
        button3.addActionListener(e -> {

			button3(e);
		});
        add(button3, "cell 2 0");

        //---- borrar ----
        borrar.setText("DEL");
        borrar.addActionListener(e -> {
			borrar(e);
		});
        add(borrar, "cell 3 0");

        //---- button4 ----
        button4.setText("4");
        button4.addActionListener(e -> {
			button4(e);
		});
        add(button4, "cell 0 1");

        //---- button5 ----
        button5.setText("5");
        button5.addActionListener(e -> {

			button5(e);
		});
        add(button5, "cell 1 1");

        //---- button6 ----
        button6.setText("6");
        button6.addActionListener(e -> {

			button6(e);
		});
        add(button6, "cell 2 1");

        //---- multiplicar ----
        multiplicar.setText("*");
        multiplicar.addActionListener(e -> {

			multiplicar(e);
		});
        add(multiplicar, "cell 3 1");

        //---- button7 ----
        button7.setText("7");
        button7.addActionListener(e -> {

			button7(e);
		});
        add(button7, "cell 0 2");

        //---- button8 ----
        button8.setText("8");
        button8.addActionListener(e -> {

			button8(e);
		});
        add(button8, "cell 1 2");

        //---- button9 ----
        button9.setText("9");
        button9.addActionListener(e -> {

			button9(e);
		});
        add(button9, "cell 2 2");

        //---- dividir ----
        dividir.setText("/");
        dividir.addActionListener(e -> {
			dividir(e);
		});
        add(dividir, "cell 3 2");

        //---- sumar ----
        sumar.setText("+");
        sumar.addActionListener(e -> {
			sumar(e);
		});
        add(sumar, "cell 0 3");

        //---- restar ----
        restar.setText("-");
        restar.addActionListener(e -> {
			restar(e);
		});
        add(restar, "cell 1 3");

        //---- igual ----
        igual.setText("=");
        igual.addActionListener(e -> {
			igual(e);
		});
        add(igual, "cell 2 3");

        //---- button0 ----
        button0.setText("0");
        button0.addActionListener(e -> {
			button0(e);
		});
        add(button0, "cell 3 3");

        //---- resultado ----
        resultado.addActionListener(e -> resultado(e));
        add(resultado, "cell 0 4");

        //---- numeroDirecto ----
        numeroDirecto.addActionListener(e -> numeroDirecto(e));
        add(numeroDirecto, "cell 1 4");

        //---- operacion ----
        operacion.addActionListener(e -> operacion(e));
        add(operacion, "cell 2 4");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ricardo Castro Vizcaya
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton borrar;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton multiplicar;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton dividir;
    private JButton sumar;
    private JButton restar;
    private JButton igual;
    private JButton button0;
    private JButton resultado;
    private JButton numeroDirecto;
    private JButton operacion;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CALCULADORA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JFramesPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
