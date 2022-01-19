package characters;

public interface MakeNoise {
    default void makeNoise(Noise n) {
        System.out.println(n.toString() + " This was " + n.describe() + ".");
    }
}
