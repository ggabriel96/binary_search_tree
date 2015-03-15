class Tree {
    int k;
    Tree p, l, r;

    /* ~~~~~~~~~~~~~~~ Class methods ~~~~~~~~~~~~~~~ */

    public Tree(int k) {
        this.k = k;
        this.p = this.l = this.r = null;
    }

	/* ~~~~~~~~~~~~~~~ Instance methods ~~~~~~~~~~~~~~~ */
    public void print() {
        System.out.println(this + ": " + this.l + " <- (" + this.k + ") -> " + this.r);
        if (this.l != null) this.l.print();
        if (this.r != null) this.r.print();
    }

    public Tree find(int k) {
        if (k < this.k && this.l != null) {
            return this.l.find(k);
        }
        else if (k > this.k && this.r != null) {
            return this.r.find(k);
        } else {
            return this;
        }
    }

    public void add(int k) {
        Tree q = this.find(k);
        if (k < q.k) {
            q.l = new Tree(k);
            q.l.p = q;
        }
        else if (k > q.k) {
            q.r = new Tree(k);
            q.r.p = q;
        }
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

    /* ~~~~~~~~~~~~~~~ Old methods ~~~~~~~~~~~~~~~ */
    public void add_old(Tree p, int k) {
        if (k < this.k) {
            if (this.l != null) this.l.add_old(this.l, k);
            else {
                this.l = new Tree(k);
                this.l.p = p;
            }
        }
        else if (k > this.k) {
            if (this.r != null) this.r.add_old(this.r, k);
            else {
                this.r = new Tree(k);
                this.r.p = p;
            }
        }
    }
}
