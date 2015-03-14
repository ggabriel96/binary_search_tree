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

        System.out.println("root.depth: " + root.depth());
        System.out.println("root.r.depth: " + root.r.depth());
        System.out.println("root.r.r.depth: " + root.r.r.depth());
        System.out.println("root.l.r.depth: " + root.l.r.depth());

        System.out.println("found " + root.find(0).k);

        System.out.println(root.size() + " node(s)");
    }
}
