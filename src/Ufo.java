import GLOOP.*;
public class Ufo{
    GLKegel k1;

    public Ufo(){
        k1 = new GLKegel(0,0,0,7,12);
        k1.drehe(90,0,0);
        k1.setzeFarbe(0,1,0);
    }
    public void bewegeLinks(){k1.verschiebe(-1.5,0,0);}
    public void bewegeRechts(){
        k1.verschiebe(1.5,0,0);
    }
    public void bewegeoben(){
        k1.verschiebe(0,1.5,0);
    }
    public void bewegeunten(){
        k1.verschiebe(0,-1.5,0);
    }
    public void explodiere(){
        Sys.beenden();
    }
    public double gibX(){
        return k1.gibX();
    }
    public double gibY(){
        return k1.gibY();
    }
    public double gibZ(){
        return k1.gibZ();
    }
}
