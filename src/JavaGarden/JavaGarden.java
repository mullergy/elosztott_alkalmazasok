/*
 12. feladat: Kertészet
Neptun-kód: M66MZ0
Müller György
 */
package JavaGarden;

import java.io.*;
import java.util.ArrayList;

public class JavaGarden {
    public static String adatmappa = System.getProperty("user.dir");
    public static String kerteszetfile = "\\kerteszet.txt";
    public static String keszletfile = "\\keszlet.dat";
    public static String vevokfile = "\\vasarlok.txt";
    
    
    
    public static void main(String[] args) {
        //*** Saját mappa létrehozása
        File f = new File(adatmappa + kerteszetfile);
        if (!f.exists()) {
            //*** Nincs a kertészet nevét tároló text file ***
            NevBekero nb = new NevBekero();
            nb.setLocationRelativeTo(null);
            nb.setVisible(true);
            
        } else {
            //GUI indítása
            GardenGUI mainscreen = new GardenGUI();
            mainscreen.setLocationRelativeTo(null);
            mainscreen.setVisible(true);
        }
    }
}
