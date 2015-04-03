/**
 * Created by surazzzzz5 on 4/3/2015.
 */
public class main {
    public static void main(String[] args) {
        Pipes pipes = new Pipes();
        sound sounds = new sound();
        Bird birds = new Bird();
        Control control = new Control();
        birds.showBirds();
        pipes.showPipes();
        control.goUp();
        sounds.playSound();


    }
}
