/*
 * This file is part of binary_search_tree.
 *
 *  binary_search_tree is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  binary_search_tree is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with binary_search_tree. If not, see <http://www.gnu.org/licenses/>.
 */

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
