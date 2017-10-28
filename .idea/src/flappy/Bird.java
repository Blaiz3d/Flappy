package flappy;

/**
 * Created by manta on 26-Oct-17.
 */
import java.util.Random;

public class Bird {

    private int xPosition;
    private int yPosition;
    private int id;

    private Bird(){
        id = new Random().nextInt();
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getId() {
        return id;
    }

    private static class BirdHolder {
        static final Bird INSTANCE = new Bird();
    }

    public static Bird getInstance() {
        return BirdHolder.INSTANCE;
    }
}

