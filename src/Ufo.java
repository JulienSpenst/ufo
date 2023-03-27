import GLOOP.*;
public class Ufo{
    GLKegel k1;

    public Ufo(){
        k1 = new GLKegel(0,0,0,5,10);
        k1.drehe(90,0,0);
        k1.setzeFarbe(136,0,255);
    }
    public void bewegeLinks(){k1.verschiebe(-2,0,0);}
    public void bewegeRechts(){
        k1.verschiebe(2,0,0);
    }
    public void bewegeoben(){
        k1.verschiebe(0,2,0);
    }
    public void bewegeunten(){
        k1.verschiebe(0,-2,0);
    }
    public void explodiere(){
    }
}
