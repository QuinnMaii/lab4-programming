/*
+ Then a low whistle sounded under the window, and Moomintroll's heart jumped for joy.
+ He quietly walked over to the window and looked out.
+ Whistle meant: top secret!
+ Snufkin was standing by the rope ladder below.

+ Moomintroll shook his head fervently.

+ Snufkin leaned towards him and said even more quietly:
+ -- The hat washed up on land, on a sandbar a little further down the river.

+ Moomintroll's eyes sparkled.

+ Like shadows, they slipped through the dewy garden to the river.


---
Moomin thought about it.
Moomintroll slipped into the warm water and paddled along the river like a dog.
The current was strong here, and at first he felt insecure.
But then he saw a shallow, and there was something black on it.
He swung his tail and immediately felt the bottom with his paws.
---


+ A dark stream stretched downstream from the hat.
“That was the magic red water that Snufkin was talking about.
+ Moomintroll stuck his paw into it and licked it carefully.

+ And, beside himself with delight, he let out his most joyful war cry: "Pee-ho!"

+ Swimming against the current, towing a heavy hat behind him, was not easy, and, having reached the shore, he felt terribly tired.

+ Snufkin picked up his hat and set off on his way back along the river bank. When he reached the bridge, he suddenly stopped.

+ Snufkin shook his head sadly.

Walking through the forest, Moomintroll pressed closer and closer to Snufkin.
From both sides of the path, the rustle and rustle of sneaking steps were heard, it was eerie.
At times, small luminous eyes peered out from behind the trunks of the trees, at times someone called out to them from the ground or from the tree bushes.
 */

import characters.*;
import exceptions.UnknownLocationException;
import objects.*;
import places.*;

public class Scene {
    public static void main(String[] args) throws UnknownLocationException {
        Moomin moomin = new Moomin("Moomintroll");
        Snufkin snufkin = new Snufkin("Snufkin");
        snufkin.setLocation(new WoodenLadder());
        Window w = new Window();
        snufkin.makeNoise(new Noise("Whistling", "top secret whistle") {
            private String location = w.toString();

            @Override
            public String toString() {
                return  "Close to property " + this.location + " resounded " + this.getName() + ".";
            }
        });
        moomin.approach(w);
        moomin.lookAtView(w);
        snufkin.printLocation();
        moomin.setState(State.HAPPY);
        System.out.println();

        moomin.shakeHead("with heat");
        snufkin.lean();
        snufkin.say("The hat washed up on land, on a sandbar a little further down the river.");
        moomin.eyes_sparkle();
        System.out.println();

        ShallowRiver river = new ShallowRiver(Temperature.WARM, Intensity.STRONG, true);
        BlackObject black = new BlackHat();
        river.addObject(black);

        {
            class Union implements Approach {
                private Object[] union;
                public Union(Object ... o) {
                    this.union = o;
                }

                @Override
                public String toString() {
                    StringBuilder s = new StringBuilder();
                    for (int i = 0; i < union.length; i++) {
                        if (i != 0) {
                            s.append(" and ");
                        }
                        s.append(union[i].toString());
                    }
                    return s.toString();
                }

                @Override
                public void approach(Object o) {
                    System.out.println(this.toString() + " approached the object " + o.toString() + ".");
                }
            }

            Union u = new Union(moomin, snufkin);
            u.approach(river);
        }

        System.out.println();
        System.out.println("---");

        moomin.setState(State.THINKING);
        moomin.enterRiver(river);
        moomin.swim();
        boolean lookForShoal = moomin.lookAtShoal();
        if (lookForShoal) {
            moomin.swimUsingTail();
            moomin.touch();
        }

        System.out.println("---");
        System.out.println();

        BlackHat hat = (BlackHat) black;
        hat.setRiver(river);
        hat.describe();
        moomin.taste(hat);
        moomin.setState(State.ECSTATIC);
        moomin.makeNoise(new Noise("cry \"Pee-ho\"", "the most joyful war cry of Moomintroll"));

        moomin.swimAgainstFlowWithAHat(river, hat);
        moomin.reachSurface();
        Coast c = new Coast();
        snufkin.setLocation(c);
        snufkin.carry(hat);
        snufkin.walk();

        snufkin.approach(new Bridge());
        snufkin.stop();

        snufkin.shakeHead("contritely");

        System.out.println();

        Forest f = new Forest(10);
        moomin.walk(f, snufkin);

        f.hideBehindTrees();
        f.makeNoisesFromSidesOfTrail(new Noise("rustle"));
        f.makeNoisesFromSidesOfTrail(new Noise("swish"));
        f.call();

    }
}
