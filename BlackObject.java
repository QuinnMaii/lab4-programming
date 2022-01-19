package objects;

public class BlackObject {
    private Color color = Color.BLACK;

    @Override
    public String toString() {
        return "something black";
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
    public int hashCode() {
        return 1;
    }
}
