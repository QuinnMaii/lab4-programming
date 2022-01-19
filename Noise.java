package characters;

public class Noise {
    private String name;
    private String description;

    public Noise(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Noise(String name) {
        this.name = name;
        this.description = "";
    }


    public String getName() { return this.name; }

    public String describe() { return this.description; }

    @Override
    public String toString() {
        return "Resounded " + this.name + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Noise n = (Noise) o;
        return n.getName().equals(this.name) && n.describe().equals(this.description);
    }

    @Override
    public int hashCode() {
        return name.hashCode() ^ description.hashCode();
    }
}
