package characters;
import exceptions.NoRiverException;
import places.Intensity;
import places.ShallowRiver;
import objects.BlackHat;

public interface SwimmingMoomin {
    default void swim(ShallowRiver r) throws NoRiverException {
        if (r == null) {
            throw new NoRiverException();
        }
        else {
            System.out.println(this.toString() + " dog-like swam down the river.");
            if ((r.getIntensity().equals(Intensity.STRONG)) && (this instanceof Moomin)) {
                ((Moomin) this).setState(State.UNCERTAIN);
            }
        }
    }

    default void reachSurface() {
        System.out.println(this.toString() + " reached Surface!");
        ((Moomin) this).exitRiver();
    }

    default void swimAgainstFlowWithAHat(ShallowRiver r, BlackHat h) throws NoRiverException {
        if (r == null) {
            throw new NoRiverException();
        }
        else {
            swim(r);
            System.out.println("Swimming against the current while holding your hat was hard..");
            if (this instanceof Moomin) {
                ((Moomin) this).setState(State.TIRED);
            }
        }
    }

    default void swimUsingTail(ShallowRiver r) {
        if (r == null) {
            throw new NoRiverException();
        }
        else {
            System.out.println(this.toString() + " taxied his tail.");
        }
    }

}
