import GLOOP.*; 
public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;
    private Ufo meinUfo;

    private Ufo dasUfo;
    GLTafel t1;
    int S=0;
    int H=0;


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
        t1=new GLTafel(500,600,100,100,50);
        t1.setzeText("Score: "+S,25);
        run();
    }

    public void run() {
        while (!tastatur.esc()) {
            if (!dasUfo.istExplodieret()) {
                for (int i = 0; i < 50; i++) {
                    Asteroiden[i].astebewege();
                }

                if (tastatur.rechts() && dasUfo.gibX() < 700) {
                    dasUfo.bewegeRechts();
                }
                if (tastatur.links() && dasUfo.gibX() > -700) {
                    dasUfo.bewegeLinks();
                }
                if (tastatur.oben() && dasUfo.gibY() < 700) {
                    dasUfo.bewegeoben();
                }
                if (tastatur.unten() && dasUfo.gibY() > -250) {
                    dasUfo.bewegeunten();
                }

                dasUfo.timer();
                S++;
                if (S % 100 == 0) {
                    H++;
                    t1.setzeText("Score: " + H, 25);
                }
            }
            if (tastatur.istGedrueckt('r')&&dasUfo.istExplodieret) {
                dasUfo.Reset();
                for (int i = 0; i < 50; i++) {
                    Asteroiden[i].Reset();
                    H=0;
                    S=0;
                }
            }
            Sys.warte();
            }
        }
    }




