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

class Node {
    public int key;
    public Node p, left, right;

    public Node(int key) {
        this.key = key;
        this.p = this.left = this.right = null;
    }

    public Node find(int key) {
        if (key < this.key && this.left != null) return this.left.find(key);
        else if (key > this.key && this.right != null) return this.right.find(key);
        else return this;
    }

    public Node min() {
        if (this.left != null) return this.left.min();
        else return this;
    }

    public Node max() {
        if (this.right != null) return this.right.max();
        else return this;
    }

    public Node predecessor() {
        if (this.left != null) return this.left.max();
        else return this;
    }

    public Node successor() {
        if (this.right != null) return this.right.min();
        else return this;
    }

    public int size() {
        int size = 1;
        if (this.right != null) size += this.right.size();
        if (this.left != null) size += this.left.size();
        return size;
    }

    public int depth() {
        if (this.p != null) return 1 + this.p.depth();
        else return 0;
    }

    public int height() {
        if (this.left != null && this.right != null) {
            return 1 + Math.max(this.left.height(), this.right.height());
        }
        else if (this.left != null) {
            return 1 + this.left.height();
        }
        else if (this.right != null) {
            return 1 + this.right.height();
        }
        else return 0;
    }

    public void inorderWalk() {
        if (this.left != null) this.left.inorderWalk();

        if (this.left != null) System.out.print(this.left.key);
        else System.out.print("null");

        if (this.p != null) System.out.print("\t<- " + this.key + " -> \t");
        else System.out.print("\t<< " + this.key + " >> \t");

        if (this.right != null) System.out.println(this.right.key);
        else System.out.println("null");

        if (this.right != null) this.right.inorderWalk();
    }
}
