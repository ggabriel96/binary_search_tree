class Main {
    public static void main(String args[]) {
        Tree t = new Tree(5);
        t.add(1);
        t.add(0);
        t.add(2);
        t.add(3);
        t.add(5); // it doesn't even try to add it again \o/
        t.add(6);
        t.add(7);
        t.add(10);
        t.inorderWalk();
        System.out.println();

        System.out.println("t.size: " + t.size() + " node(s)");

        System.out.println("t.depth: " + t.depth());
        System.out.println("t.root.r.depth: " + t.root.r.depth());
        System.out.println("t.root.r.r.depth: " + t.root.r.r.depth());
        System.out.println("t.root.l.r.depth: " + t.root.l.r.depth());

        System.out.println("t.height: " + t.height());
        System.out.println("t.root.l.height: " + t.root.l.height());
        System.out.println("t.root.r.height: " + t.root.r.height());
        System.out.println("t.root.r.r.height: " + t.root.r.r.height());
        System.out.println("t.root.r.r.r.height: " + t.root.r.r.r.height());

        System.out.println("found " + t.find(0).k);

        System.out.println("min: " + t.min().k);
        System.out.println("max: " + t.max().k);
        System.out.println("t.root.predecessor: " + t.root.predecessor().k);
        System.out.println("t.root.successor: " + t.root.successor().k);

        System.out.println("_____________________________\n");
    }
}
