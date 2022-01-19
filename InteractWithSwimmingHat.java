package characters;
import objects.*;

public interface InteractWithSwimmingHat {
    default void touch(BlackHat h) {
        h.getCurrent().touch(this);
    }

    default void taste(BlackHat h) {
        h.getCurrent().taste(this);
    }
}
