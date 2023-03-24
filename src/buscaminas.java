import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class buscaminas extends JFrame {

    private final int ANCHO = 10;
    private final int ALTO = 10;
    private final int MINAS = 10;
    private JLabel[][] casillas = new JLabel[ANCHO][ALTO];
    private boolean[][] minas = new boolean[ANCHO][ALTO];
    private int[][] numeros = new int[ANCHO][ALTO];

    public buscaminas() {
        this.setTitle("Buscaminas");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ANCHO, ALTO));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Inicializar las casillas y las minas
        for (int i = 0; i < ANCHO; i++) {
            for (int j = 0; j < ALTO; j++) {
                casillas[i][j] = new JLabel();
                casillas[i][j].setOpaque(true);
                casillas[i][j].setBackground(Color.WHITE);
                casillas[i][j].setHorizontalAlignment(JLabel.CENTER);
                casillas[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(casillas[i][j]);

                minas[i][j] = false;
                numeros[i][j] = 0;
            }
        }

        // Colocar las minas de forma aleatoria
        Random random = new Random();
        int contador = 0;
        while (contador < MINAS) {
            int x = random.nextInt(ANCHO);
            int y = random.nextInt(ALTO);
            if (!minas[x][y]) {
                minas[x][y] = true;
                contador++;
            }
        }
// Calcular los números de cada casilla
        for (int i = 0; i < ANCHO; i++) {
            for (int j = 0; j < ALTO; j++) {
                if (minas[i][j]) {
                    numeros[i][j] = -1;
                } else {
                    int contadorMinas = 0;
                    for (int x = Math.max(0, i - 1); x <= Math.min(ANCHO - 1, i + 1); x++) {
                        for (int y = Math.max(0, j - 1); y <= Math.min(ALTO - 1, j + 1); y++) {
                            if (minas[x][y]) {
                                contadorMinas++;
                            }
                        }
                    }
                    numeros[i][j] = contadorMinas;
                }
            }
        }
// Agregar el evento de clic a cada casilla
        for (int i = 0; i < ANCHO; i++) {
            for (int j = 0; j < ALTO; j++) {
                casillas[i][j].addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        JLabel casilla = (JLabel) e.getSource();
                        int x = -1;
                        int y = -1;

                        // Obtener la posición de la casilla clickeada
                        for (int i = 0; i < ANCHO; i++) {
                            for (int j = 0; j < ALTO; j++) {
                                if (casilla == casillas[i][j]) {
                                    x = i;
                                    y = j;
                                    break;
                                }
                            }
                        }

                        // Revelar la casilla clickeada
                        if (minas[x][y]) {
                            casilla.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "¡Perdiste!");
                            reiniciarJuego();
                        } else {
                            casilla.setBackground(Color.GRAY);
                            casilla.setText(Integer.toString(numeros[x][y]));
                            if (numeros[x][y] == 0) {
                                revelarCasillasVacias(x, y);
                            }
                            if (comprobarVictoria()) {
                                JOptionPane.showMessageDialog(null, "¡Ganaste!");
                                reiniciarJuego();
                            }
                        }
                    }
                });
            }
        }

        this.add(panel);
        this.setVisible(true);
    }

    private void reiniciarJuego() {
        this.dispose();
        new buscaminas();
    }

    private void revelarCasillasVacias(int x, int y) {
        for (int i = Math.max(0, x - 1); i <= Math.min(ANCHO - 1, x + 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(ALTO - 1, y + 1); j++) {
                if (numeros[i][j] == 0 && casillas[i][j].getBackground() == Color.WHITE) {
                    casillas[i][j].setBackground(Color.GRAY);
                    revelarCasillasVacias(i, j);
                } else if (numeros[i][j] != -1 && casillas[i][j].getBackground() == Color.WHITE) {
                    casillas[i][j].setBackground(Color.GRAY);
                    casillas[i][j].setText(Integer.toString(numeros[i][j]));
                }
            }
        }
    }

    private boolean comprobarVictoria() {
        for (int i = 0; i < ANCHO; i++) {
            for (int j = 0; j < ALTO; j++) {
                if (!minas[i][j] && casillas[i][j].getBackground() == Color.WHITE) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new buscaminas();
    }
}
