import GLOOP.*;

public class Asteroid{
    GLKugel kug1;
    double xPos;
    double pY;
    Ufo dasUfo;
    public Asteroid(Ufo pUfo){
        kug1 = new GLKugel(Math.random()*1000 - 500,1000,0,50);
        dasUfo = pUfo;
    }
    public void astebewege(){kug1.verschiebe(0,-1,0);
        pY = kug1.gibY();
        if (pY < -350) {
        kug1.setzePosition(Math.random()*1000 - 500, 1000, 0);
    }
    }

    public double gibX(){
        return kug1.gibX();
    }
}
