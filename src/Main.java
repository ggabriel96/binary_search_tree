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
        System.out.println("t.root.r.depth: " + t.root.r.depth());
        System.out.println("t.root.r.r.depth: " + t.root.r.r.depth());
        System.out.println("t.root.l.r.depth: " + t.root.l.r.depth());

        System.out.println("t.height: " + t.height());
        System.out.println("t.root.l.height: " + t.root.l.height());
        System.out.println("t.root.r.height: " + t.root.r.height());
        System.out.println("t.root.r.r.height: " + t.root.r.r.height());
        System.out.println("t.root.r.r.r.height: " + t.root.r.r.r.height());

        System.out.println("found " + t.find(0).k);

        System.out.println("min: " + t.min().k);
        System.out.println("max: " + t.max().k);
        System.out.println("t.root.predecessor: " + t.root.predecessor().k);
        System.out.println("t.root.successor: " + t.root.successor().k);

         while (true) {
            System.out.println();
            t.remove(t.root);
            if (t.root != null) t.inorderWalk();
            else break;
        }

        System.out.println(t.root);
        System.out.println(t);

        //System.out.println("_____________________________\n");
    }
}
