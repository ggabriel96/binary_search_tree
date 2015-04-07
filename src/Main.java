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

class Main {
    public static void main(String args[]) {
        Tree t = new Tree(5);
        t.add(1);
        t.add(0);
        t.add(2);
        t.add(3);
        t.add(5); // it doesn't even try to add it again \o/
        t.add(6);
        t.add(7);
        t.add(10);
        System.out.println("Original tree:");
        t.inorderWalk();
        System.out.println();

        System.out.println("t.size: " + t.size() + " node(s)");

        System.out.println("t.depth: " + t.depth());
        System.out.println("t.root.right.depth: " + t.root.right.depth());
        System.out.println("t.root.right.right.depth: " + t.root.right.right.depth());
        System.out.println("t.root.left.right.depth: " + t.root.left.right.depth());

        System.out.println("t.height: " + t.height());
        System.out.println("t.root.left.height: " + t.root.left.height());
        System.out.println("t.root.right.height: " + t.root.right.height());
        System.out.println("t.root.right.right.height: " + t.root.right.right.height());
        System.out.println("t.root.right.right.right.height: " + t.root.right.right.right.height());

        System.out.println("found " + t.find(0).key);

        System.out.println("min: " + t.min().key);
        System.out.println("max: " + t.max().key);
        System.out.println("t.root.predecessor: " + t.root.predecessor().key);
        System.out.println("t.root.successor: " + t.root.successor().key);

         while (true) {
            System.out.println();
            t.remove(t.root.key);
            if (t.root != null) t.inorderWalk();
            else break;
        }

        System.out.println(t.root);
        System.out.println(t);

        //System.out.println("_____________________________\n");
    }
}
