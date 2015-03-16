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
        root.print();
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
        root.inorderWalk();
        System.out.println("\n");
        /**********************************************************************/
        Tree root2 = new Tree(1);
        root2.add(2);
        root2.add(3);
        root2.add(4);
        root2.add(5);
        root2.add(6);
        root2.add(7);
        root2.add(0);
        System.out.println("root2.size: " + root2.size() + " node(s)");
        System.out.println("root2.depth: " + root2.depth());
        System.out.println("root2.height: " + root2.height());
        System.out.println("root2.r.r.height: " + root2.r.r.height());
        System.out.println("found " + root2.find(7).k);
        root2.inorderWalk();
    }
}
