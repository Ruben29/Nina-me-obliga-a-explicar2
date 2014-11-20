package boletin10.pkg1.pkg2;

import javax.swing.JOptionPane;

public class Juego {

    private int jug1, jug2, numint;
    private boolean perdedor = true;

    public Juego() {
        numint = 0;
        jug1 = 0;
        jug2 = 0;

    }

    public void Recoger() {
        do {
            String respuesta = JOptionPane.showInputDialog("Introduzca un numero a adivinar entre el 1 y el 50 :");
            jug1 = Integer.parseInt(respuesta);
        } while (jug1 < 1 || jug1 > 50);

        do {
            String respuesta2 = JOptionPane.showInputDialog("Introduzca el número de intentos :");
            numint = Integer.parseInt(respuesta2);
            if (numint <= 0 || numint > 20) {
                JOptionPane.showMessageDialog(null, "ATENCIÓN \n El numero de intentos tiene que estar comprendido entre 1 y 20 :");
            }
        } while (numint <= 0 || numint > 20);

    }

    public void Evaluar() {

        for (int contador = 0; contador != numint; contador++) {

            do {
                String respuesta3 = JOptionPane.showInputDialog("Juega tu número entre 1 y 50:");
                jug2 = Integer.parseInt(respuesta3);
            } while (jug2 < 1 || jug2 > 50);
            if (jug2 == jug1) {
                perdedor = false;
                JOptionPane.showMessageDialog(null, "Oooooooh, ENHORABUENA, HAS GANADO.\n ¡¡¡ERES MÁS LISTO QUE UNO DE PCPI!!!");
                contador = numint - 1;
            } else if (jug2 > jug1) {
                if (numint != (contador + 1)) {
                    JOptionPane.showMessageDialog(null, "El número es menor :");

                }
            } else {
                if (numint != (contador + 1)) {
                    JOptionPane.showMessageDialog(null, "El número es mayor :");
                }
            }
        }

        if (perdedor == true) {
            JOptionPane.showMessageDialog(null, "JAJAJAJAJAJAJAJA HAS PERDIDO \n ¡¡¡LOS DE PCPI SON MÁS LISTOS QUE TU!!!");
        }

    }

}
