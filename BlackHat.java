package objects;

import places.*;

public class BlackHat extends BlackObject {
    private River river;
    private Сurrent current;

    public static class Сurrent {
        private Color color = Color.RED;

        @Override
        public String toString() {
            return "a dark stream.";
        }

        public void touch(Object o) {
            System.out.println(o.toString() + " touched the stream.");
        }

        public void taste(Object o) {
            this.touch(o);
            System.out.println(o.toString() + " licked paw.");
        }
    }

    public Сurrent getCurrent() {
        if (river == null) {
            return null;
        }
        if (current == null) {
            current = new Сurrent();
        }
        return current;
    }

    public void setRiver(River r) {
        this.river = r;
        if (current == null && r != null) {
            current = new Сurrent();
        }
        if (r == null && current != null) {
            current = null;
        }
    }

    public void describe() {
        System.out.println("Stretched from the hat " + current.toString() + ".");
    }

    @Override
    public String toString() {
        return "black hat" ;
    }
}
