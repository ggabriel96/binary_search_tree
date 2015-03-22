class Tree {
    Node root;

    public Tree(int k) {
        this.root = new Node(k);
        root.p = root.l = root.r = null;
    }

    public Node find(int k) {
        if (k < this.root.k && this.root.l != null) {
            return this.root.l.find(k);
        }
        else if (k > this.root.k && this.root.l != null) {
            return this.root.r.find(k);
        }
        else return this.root;
    }

    public void add(int k) {
        Node n = this.root.find(k);
        if (k < n.k) {
            n.l = new Node(k);
            n.l.p = n;
        }
        else if (k > n.k) {
            n.r = new Node(k);
            n.r.p = n;
        }
    }

    public Node min() {
        return this.root.min();
    }

    public Node max() {
        return this.root.max();
    }

    public int size() {
        return this.root.size();
    }

    public int depth() {
        return this.root.depth();
    }

    public int height() {
        return this.root.height();
    }

    public void inorderWalk() {
        this.root.inorderWalk();
    }
}
