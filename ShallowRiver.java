package places;

public class ShallowRiver extends River {
    private Floor floor = new Floor();
    private Shoal shoal = null;
    private Temperature temperature;
    private Intensity intensity;

    public ShallowRiver(Temperature t, Intensity i, boolean hasShoal) {
        super(t, i);
        if (hasShoal) {
            shoal = new Shoal();
        }
    }

    public class Floor {
        public Floor() {}

        public void touch(Object o) {
            System.out.println(o.toString() + " touched to the bottom.");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() { return 1; }

        @Override
        public String toString() { return "bottom"; }
    }


    public class Shoal extends Floor {
        private Object object;

        public Shoal(){}

        public void addObject(Object o) {
            if (object == null) {
                object = o;
            }
        }

        public String toString() {
            if (object == null) {
                return "shallow";
            }
            return "shallow,, and on it " + object.toString() + ".";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            Shoal s = (Shoal) o;
            return s.object.equals(this.object);
        }

        @Override
        public int hashCode() {
            if (object == null) {
                return 0;
            }
            return object.hashCode();
        }
    }

    public void touchFloor(Object o) {
        floor.touch(o);
    }

    public Shoal getShoal() {
        return shoal;
    }

    public void addObject(Object o) {
        shoal.addObject(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ShallowRiver r = (ShallowRiver) o;
        if (this.shoal == null) {
            if (r.shoal == null) {
                return this.temperature.equals(r.temperature) && this.intensity.equals(r.intensity);
            }
            else {
                return false;
            }
        }
        return this.temperature.equals(r.temperature) && this.intensity.equals(r.intensity) && this.shoal.equals(r.shoal);
    }

    @Override
    public int hashCode() {
        return temperature.hashCode() & intensity.hashCode() & shoal.hashCode();
    }
}
