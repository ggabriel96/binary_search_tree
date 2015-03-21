class Main {
    public static void main(String args[]) {
        Tree root = new Tree(5);
        root.add(1);
        root.add(0);
        root.add(2);
        root.add(3);
        root.add(5); // it doesn't even try to add it again \o/
        root.add(6);
        root.add(7);
        root.add(10);
        root.inorderWalk();
        System.out.println();

        System.out.println("root.size: " + root.size() + " node(s)");

        System.out.println("root.depth: " + root.depth());
        System.out.println("root.r.depth: " + root.r.depth());
        System.out.println("root.r.r.depth: " + root.r.r.depth());
        System.out.println("root.l.r.depth: " + root.l.r.depth());

        System.out.println("root.height: " + root.height());
        System.out.println("root.l.height: " + root.l.height());
        System.out.println("root.r.height: " + root.r.height());
        System.out.println("root.r.r.height: " + root.r.r.height());
        System.out.println("root.r.r.r.height: " + root.r.r.r.height());

        System.out.println("found " + root.find(0).k);

        System.out.println("min: " + root.min().k);
        System.out.println("max: " + root.max().k);
        System.out.println("root.predecessor: " + root.predecessor().k);
        System.out.println("root.successor: " + root.successor().k);

        System.out.println("_____________________________\n");
        /**********************************************************************/
        root = new Tree(1);
        root.add(2);
        root.add(3);
        root.add(4);
        root.add(5);
        root.add(6);
        root.add(7);
        root.add(0);
        root.inorderWalk();
        System.out.println();

        System.out.println("root.size: " + root.size() + " node(s)");

        System.out.println("root.depth: " + root.depth());
        System.out.println("root.r.depth: " + root.r.depth());
        System.out.println("root.r.r.depth: " + root.r.r.depth());

        System.out.println("root.height: " + root.height());
        System.out.println("root.l.height: " + root.l.height());
        System.out.println("root.r.height: " + root.r.height());
        System.out.println("root.r.r.height: " + root.r.r.height());
        System.out.println("root.r.r.r.height: " + root.r.r.r.height());

        System.out.println("found " + root.find(0).k);

        System.out.println("min: " + root.min().k);
        System.out.println("max: " + root.max().k);
        System.out.println("root.predecessor: " + root.predecessor().k);
        System.out.println("root.successor: " + root.successor().k);
    }
}
