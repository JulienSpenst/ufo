import GLOOP.*; 
public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;
    private Ufo meinUfo;

    private Ufo dasUfo;


    Asteroid[]Asteroiden;

    public Ufospiel() {
        kamera = new GLEntwicklerkamera(800, 600);
        kamera.verschiebe(0, 200, 500);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        dasUfo = new Ufo();
        Asteroiden = new Asteroid[50];
        for (int i = 0; i < 50; i++) {
            Asteroiden[i] = new Asteroid(dasUfo);
        }

        run();
    }

    public void run() {
        while (!tastatur.esc()) {
            for (int i = 0; i < 50; i++) {
                Asteroiden[i].astebewege();
            }

            if (tastatur.rechts()) {
                dasUfo.bewegeRechts();
            }
            if (tastatur.links()) {
                dasUfo.bewegeLinks();
            }
            if (tastatur.oben()) {
                dasUfo.bewegeoben();
            }
            if (tastatur.unten()) {
                dasUfo.bewegeunten();
            }
            Sys.warte();
        }
    }
}



