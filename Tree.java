class Tree {
    int k;
    Tree p, l, r;

    public Tree(int k) {
        this.k = k;
        this.p = this.l = this.r = null;
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

    public Tree min() {
        if (this.l != null) return this.l.min();
        else return this;
    }

    public Tree max() {
        if (this.r != null) return this.r.max();
        else return this;
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

    // Throws NullPointerException if deleting root
    // and one of its children is null
    public void remove() {
        if (this.l == null && this.r == null) {
            if (this == this.p.l) this.p.l = null;
            else this.p.r = null;
            this.p = null;
        }
        else if (this.l != null && this.r == null) {
            this.l.p = this.p;
            if (this == this.p.l) this.p.l = this.l;
            else this.p.r = this.l;
            this.p = null;
        }
        else if (this.r != null && this.l == null) {
            this.r.p = this.p;
            if (this == this.p.l) this.p.l = this.r;
            else this.p.r = this.r;
            this.p = null;
        }
        else {
            Tree s = this.successor();
            this.k = s.k;
            s.remove();
        }
    }

    public Tree predecessor() {
        if (this.l != null) return this.l.max();
        else return this;
    }

    public Tree successor() {
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
