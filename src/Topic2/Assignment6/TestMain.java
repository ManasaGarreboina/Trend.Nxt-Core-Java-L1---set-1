package Topic2.Assignment6;

import Topic2.Music.Playable;
import Topic2.Music.string.Veena;
import Topic2.Music.wind.Saxophone;

public class TestMain {
	public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps; /*c. Place the above instances in a variable of type Playable and then call play().*/
        pv = new Veena();
        ps = new Saxophone();
        
        v.play(); /*a. Create an instance of Veena and call play() method*/
        s.play(); /*b. Create an instance of Saxophone and call play() method*/
        
        pv.play(); /*c. Place the above instances in a variable of type Playable and then call play().*/
        ps.play();
        
    }
}
