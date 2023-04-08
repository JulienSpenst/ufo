import GLOOP.*;
public class Ufo{
    GLKegel k1;
    GLTafel t1,t2;
    int T;
    int L=3;
    boolean istExplodieret=false;

    public Ufo(){
        k1 = new GLKegel(0,0,0,7,12);
        k1.drehe(90,0,0);
        k1.setzeFarbe(0,1,0);
        t1=new GLTafel(0,100,100,500,250);
        t1.setzeText("Game Over",100);
        t1.setzeSichtbarkeit(false);
        t2=new GLTafel(-500,600,100,100,50);
        t2.setzeText("Leben: "+L,50);
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
        istExplodieret=true;
        t1.setzeSichtbarkeit(true);
        t2.setzeSichtbarkeit(false);
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

    public void Leben(boolean Getroffen){
        if(T==0){
            L--;
            t2.setzeText("Leben: "+L,50);
            T=100;
            if(L==0){
                this.explodiere();
            }
        }
            }
            public void timer(){
                if(!(T==0)){
                    T--;
                }
            }
            public void Reset(){
            k1.setzePosition(0,0,0);
            L=3;
            T=0;
            t1.setzeSichtbarkeit(false);
            t2.setzeSichtbarkeit(true);
            istExplodieret=false;
            t2.setzeText("Leben: "+L,50);
            }
            public boolean istExplodieret(){
            return istExplodieret;
            }
}
