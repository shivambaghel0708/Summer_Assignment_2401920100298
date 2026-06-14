

import music.playable;
import music.string.veena;
import music.wind.saxophone;

public class test {
    public static void main(String[] args) {
        veena veena=new veena();
        veena.play();
        saxophone saxophone=new saxophone();
        saxophone.play();
         playable p;
         p=new veena();
         p.play();
         p=new saxophone();
         p.play();
    }
    
}
