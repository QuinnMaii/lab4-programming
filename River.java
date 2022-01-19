package places;

public abstract class River {
    private Intensity intensity;
    private Temperature temperature;

    public River(Temperature t, Intensity i) {
        this.temperature = t;
        this.intensity = i;
    }

    @Override
    public String toString() {
        return "River";
    }

    public String describe() {
        return "Water was" + temperature.describe() + ", and the flow was " + intensity.describe() + ".";
    }

    public Intensity getIntensity() {
        return this.intensity;
    }
}
