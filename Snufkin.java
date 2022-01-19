package characters;

import places.Coast;
import exceptions.*;

public class Snufkin implements MakeNoise, ShakeHead, Approach {
    private String name;
    private Object location;
    private Object carriedItem;

    public Snufkin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setLocation(Object o) {
        this.location = o;
    }

    public void printLocation() {
        System.out.println(this.name + " located next to the property" + location.toString() + ".");
    }

    public void lean() {
        System.out.println(this.name + " bowed down.");
    }

    public void say(String s) {
        System.out.println(this.name + " said that:");
        System.out.println("\t-- " + s);
    }

    public void carry(Object o) {
        this.carriedItem = o;
        System.out.println(this.toString() + " carried the object " + o.toString() + ".");
    }

    public void walk() throws UnknownLocationException {
        if (this.location instanceof Coast) {
            System.out.println(this.toString() + " walked along the coast.");
        }
        else { throw new UnknownLocationException(this.toString() + " can't walk in this area."); }
    }

    public void stop() {
        System.out.println(this.name + "has stopped.");
    }
}
