/**
 * This file is part of binary_search_tree.
 *
 * I dedicate any and all copyright interest in this software to the
 * public domain. I make this dedication for the benefit of the public at
 * large and to the detriment of my heirs and successors. I intend this
 * dedication to be an overt act of relinquishment in perpetuity of all
 * present and future rights to this software under copyright law.
 *
 * For more information, please refer to <http://unlicense.org/>
 */

class Tree {
    public Node root;

    public Tree(int key) {
        this.root = new Node(key);
    }

    public Node find(int key) {
        return this.root.find(key);
    }

    public void add(int key) {
        Node n = this.find(key);
        if (key < n.key) {
            n.left = new Node(key);
            n.left.p = n;
        }
        else if (key > n.key) {
            n.right = new Node(key);
            n.right.p = n;
        }
    }

    public void remove(int key) {
        Node u = this.find(key);
        /* This first 'if' treats the case when u has
         * no children *or* has a right child, but not left.
         */
        if (u.left == null) this.transplant(u, u.right);
        else if (u.right == null) this.transplant(u, u.left);
        else {
            Node v = u.successor();
            /* If u has two children, gotta transplant it
             * with its successor (v). If v is not a child
             * of u, makes v.right be the new child of v.p.
             * Then, v.right receives u's right sub-tree.
             */
            if (v.p != u) {
                this.transplant(v, v.right);
                v.right = u.right;
                v.right.p = v;
            }
            /* Now, v has already taken u's place,
             * except for the last step:
             */
            this.transplant(u, v);
            v.left = u.left;
            v.left.p = v;
            /* transplant u and v so that we set the
             * new parent of v (old u.p). Now, there
             * is not a single reference to u and then
             * it will be freed by the garbage collector
             * (u.left and u.right are intact. That doesn't matter).
             * If v is a child of u (the right one), then
             * only the last step is performed.
             * Important: v.left is null, since v is u's successor.
             */
        }
    }

    /* Adjusts v's references to match u's:
     * u.p.x = v and v.p = u.p (if v is not null).
     * Doesn't touch u.p, u.left and u.right. u is
     * still there as though nothing happened.
     */
    private void transplant(Node u, Node v) {
        if (u.p == null) this.root = v;
        else if (u == u.p.left) u.p.left = v;
        else u.p.right = v;
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
        return this.height();
    }

    public int height() {
        return this.root.height();
    }

    public void inorderWalk() {
        this.root.inorderWalk();
    }
}
