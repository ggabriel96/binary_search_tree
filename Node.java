class Node {
    int k;
    Node p, l, r;

    public Node(int k) {
        this.k = k;
        this.p = this.l = this.r = null;
    }

    public Node find(int k) {
        if (k < this.k && this.l != null) return this.l.find(k);
        else if (k > this.k && this.r != null) return this.r.find(k);
        else return this;
    }

    public Node min() {
        if (this.l != null) return this.l.min();
        else return this;
    }

    public Node max() {
        if (this.r != null) return this.r.max();
        else return this;
    }

    public Node predecessor() {
        if (this.l != null) return this.l.max();
        else return this;
    }

    public Node successor() {
        if (this.r != null) return this.r.min();
        else return this;
    }

    public int size() {
        int size = 1;
        if (this.r != null) size += this.r.size();
        if (this.l != null) size += this.l.size();
        return size;
    }

    public int depth() {
        if (this.p != null) return 1 + this.p.depth();
        else return 0;
    }

    public int height() {
        if (this.l != null && this.r != null) {
            return 1 + Math.max(this.l.height(), this.r.height());
        }
        else if (this.l != null) {
            return 1 + this.l.height();
        }
        else if (this.r != null) {
            return 1 + this.r.height();
        }
        else return 0;
    }

    public void inorderWalk() {
        if (this.l != null) this.l.inorderWalk();
        { // actual printing
            if (this.l != null) System.out.print(this.l.k);
            else System.out.print("null");

            if (this.p != null) System.out.print("\t<- " + this.k + " -> \t");
            else System.out.print("\t<< " + this.k + " >> \t");

            if (this.r != null) System.out.println(this.r.k);
            else System.out.println("null");
        }
        if (this.r != null) this.r.inorderWalk();
    }
}
