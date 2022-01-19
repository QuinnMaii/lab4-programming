package places;
import characters.*;
import exceptions.NoRiverException;
import exceptions.NoTrailException;
import exceptions.NoTreeException;

/* From both sides of the path, the rustle and rustle of sneaking steps were heard, it was eerie.
At times, small luminous eyes peeked out from behind the trunks of trees, at times someone called out to them from the ground or from the tree bushes.*/

public class Forest{
    private Trail trail = new Trail();
    private int forestSize = 20;
    private Tree[] trees;
    private Entities entities = new Entities();

    public Forest(int forestSize) {
        this.forestSize = forestSize;
        trees = new Tree[forestSize];
        for (int i = 0; i < trees.length; i++) {
            trees[i] = new Tree();
        }
    }

    public class Trail {
    }

    public String toString() {
        return "Forest";
    }

    public class Tree {
        public class Trunk {
            @Override
            public String toString() {
                return "tree trunks";
            }
        }
        private Trunk trunk = new Trunk();

        public String describeTrunks() {
            return "tree trunks";
        }
    }

    public class Entities {
        @Override
        public String toString() {
            return "Entities";
        }

        public void makeNoisesFromSidesOfTrail(Noise n, Trail t) throws NoTrailException {
            if (t == null) {
                throw new NoTrailException();
            } else {
                System.out.println("On both sides of the path " + n.toString());
            }
        }

        public void hideBehindTrees(Tree[] t) throws NoTreeException {
            if (t == null) { throw new NoTreeException(); }
            else {
                System.out.println("At times due to " + t[0].describeTrunks() + " small glowing eyes peeked out.");
            }
        }

        public void call() {
            System.out.println(this.toString() + " called out to the travelers.");
        }
    }

    public void makeNoisesFromSidesOfTrail(Noise n) {
        entities.makeNoisesFromSidesOfTrail(n, trail);
    }

    public void hideBehindTrees() {
        entities.hideBehindTrees(trees);
    }

    public void call() {
        entities.call();
    }

}
