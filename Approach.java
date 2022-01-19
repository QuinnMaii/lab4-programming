package characters;

public interface Approach {
    default void approach(Object o) {
        System.out.println(this.toString() + " approached the object " + o.toString() + ".");
    }
}
