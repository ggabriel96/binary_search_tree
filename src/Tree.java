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

    public void remove(Node u) {
        if (u.l == null) this.transplant(u, u.r);
        else if (u.r == null) this.transplant(u, u.l);
        else {
            Node v = u.successor();
            if (v.p != u) {
                this.transplant(v, v.r);
                v.r = u.r;
                v.r.p = v;
            }
            this.transplant(u, v);
            v.l = u.l;
            v.l.p = v;
        }
    }

    private void transplant(Node u, Node v) {
        if (u.p == null) this.root = v;
        else if (u == u.p.l) u.p.l = v;
        else u.p.r = v;
        if (v != null) v.p = u.p;
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
