package characters;
import places.ShallowRiver;
import places.ShallowRiver.*;

public interface LookAtShoal {
    default boolean lookAtShoal(ShallowRiver r) {
        Shoal a = r.getShoal();
        if (a != null) {
            System.out.println(this.toString() + " see " + a.toString());
            return true;
        }
        else {
            System.out.println(this.toString() + "did not see the shallows");
            return false;
        }
    }
}
