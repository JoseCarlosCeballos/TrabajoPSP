/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPSP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario DAM 2
 */
public class TrabajoPSP {

    public static void main(String[] args) throws Exception {

        HiloUno hilouno = new HiloUno();
        hilouno.run();

    }

    public class Fichero {

        File fichero = new File("../src/Ficheros/normal.txt");
        File ficheroCod = new File("../src/Ficheros/codificado.txt");
    }

    public static class HiloUno implements Runnable {

        @Override
        public void run() {
            Robot r = null;
            try {
                r = new Robot();
            } catch (AWTException ex) {
                Logger.getLogger(TrabajoPSP.class.getName()).log(Level.SEVERE, null, ex);
            }
            int[] executeNotepad = {KeyEvent.VK_WINDOWS, KeyEvent.VK_N, KeyEvent.VK_O, KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_P, KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_PERIOD, KeyEvent.VK_ENTER};
            for (int i = 0; i < executeNotepad.length; i++) {
                r.delay(500);
                r.keyPress(executeNotepad[i]);
                r.keyRelease(executeNotepad[i]);
            }
        }
    }
}
