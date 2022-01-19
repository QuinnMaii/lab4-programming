package objects;

public class Bridge {
        @Override
        public String toString() { return "Bridge";}

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
}
