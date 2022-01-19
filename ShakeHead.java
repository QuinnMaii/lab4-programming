package characters;

public interface ShakeHead {
    default void shakeHead(String adj) {
        Object o = this;
        System.out.println(o.toString() + " " + adj + " shook his head.");
    }
}
