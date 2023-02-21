import GLOOP.*; 
public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;
    private Ufo meinUfo;
    public Ufo k1;

    public Ufospiel() {
        kamera = new GLEntwicklerkamera(800, 600);
        kamera.verschiebe(0, 200, 500);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        k1 = new Ufo();
        run();
    }
    public void run(){
        while(!tastatur.esc()){
            if(tastatur.rechts()){
                k1.bewegeRechts();
            }
            if(tastatur.links()){
                k1.bewegeLinks();
            }
            if(tastatur.oben()){
                k1.bewegeoben();
            }
            if(tastatur.unten()){
                k1.bewegeunten();
            }
            Sys.warte();
        }
    }
}
