package characters;
import exceptions.NoTrailException;
import exceptions.UnknownLocationException;
import places.*;
import objects.*;

public class Moomin implements SwimmingMoomin, LookAtShoal, MakeNoise, ShakeHead, InteractWithSwimmingHat, Approach {
    private String name = "Moomin";
    private State state = State.NEUTRAL;
    private Tail tail = new Tail();
    private ShallowRiver river = null;

    public Moomin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setState(State s) {
        this.state = s;
        System.out.println(this.name + " is in a state " + s.describe() + ".");
    }

    public void enterRiver(ShallowRiver r) {
        this.river = r;
        System.out.println(this.toString() + " plunged into the river.");
        System.out.println(r.describe());
    }

    public void exitRiver() {
        this.river = null;
    }

    public void swim() {
        this.swim(river);
    }

    public void swimUsingTail() {
        this.swimUsingTail(river);
    }

    public boolean lookAtShoal() {
        return this.lookAtShoal(river);
    }

    public void touch() {
        river.touchFloor(this);
        this.setState(State.NEUTRAL);
    }

    public void eyes_sparkle() {
        System.out.println("In eyes " + this.name +  " sparkle flashed.");
    }

    public void lookAtView(Window w) {
        System.out.println(this.toString() + " looked out the window.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Moomin m = (Moomin) o;
        if (this.river == null) {
            if (m.river == null) {
                return this.name.equals(m.name) && this.state.equals(m.state);
            }
            else {
                return false;
            }
        }
        return this.name.equals(m.name) && this.state.equals(m.state) && (this.river).equals(m.river);
    }

    public void walk(Forest f, Snufkin s) throws NoTrailException {
        if (f == null) {
            throw new NoTrailException();
        }
        else {
            if (s != null) {
                System.out.println("Walking on an object" + f.toString() + ", " + this.toString() + " pressed against" +s.toString() + ".");
            }
        }
    }
}
