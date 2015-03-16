# binary_search_tree
A naive implementation of the binary search tree in Java. Keep in mind that I'm learning Java and Trees, so this is not the best code around hehe.

**Some info:**

* `p`, `l` and `r` are the parent, left and right nodes, respectively. `k` is the integer that node holds;

* The `print()` method prints all the nodes in the (sub-)tree rooted at the object calling it - in a weird way!;

* The `inorderWalk()` method prints all the nodes in ascending order;

* The `find()` method searches for the node that contains the int passed as argument. If found, returns it. If not, returns the node that would be its parent if the searched item existed at that moment;

* The `min()` and `max()` methods return the minimum and maximum values being held in the tree rooted at the object calling it;

* The `add()` method uses `find()` to get to the place where the new node should be added. If a node already has the int passed as argument, it ignores it and doesn't add a thing (so there are no duplicates). If the new node is smaller than the current being looked at, it goes to the left; if it's greater, it goes to the right;

* The `size()` method returns the quantity of nodes in the (sub-)tree rooted at the object calling it;

* The `depth()` returns the length of the path from the object calling it to the root of the tree;

* And the `height()` returns the length of the path from the object calling it to the farthest descendant/leaf;

* Finally, the `add_old()` method is an older version of the current `add()`. It was used when I didn't have a `find()` yet. It does the same thing, but the logic to find the right place is "built-in".
