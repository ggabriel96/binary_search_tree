# binary_search_tree
An implementation of the binary search tree in Java. Keep in mind that I'm learning Java and Trees, so this may not be the best code around hehe.

**Some info:**

* `p`, `l` and `r` are the parent, left and right nodes, respectively. `k` is the integer that node holds;

* The `find()` method searches for the node that contains the int passed as argument. If found, returns it. If not, returns the node that would be its parent if the searched item existed at that moment;

* The `add()` method uses `find()` to get to the place where the new node should be added. If a node already has the int passed as argument, it ignores it and doesn't add a thing (*so there are no duplicates*). If the new node is smaller than the current being looked at, it goes to the left; if it's greater, it goes to the right;

* The `remove()` method uses `transplant()` (that performs a swap between nodes) to remove the node passed as argument from its tree. Treats all possible cases and if it has two children, it will be replaced by its successor;

* The `min()` and `max()` methods return the node that holds the minimum and maximum values of the tree rooted at the object calling it;

* The `predecessor()` and `sucessor()` methods return the predecessor (`max()` of its left child) and successor (`min()` of the right child) of the object calling it. If the respective child doesn't exist, returns itself;

* The `size()` method returns the quantity of nodes in the (sub-)tree rooted at the object calling it;

* The `depth()` returns the length of the path from the object calling it to the root of the tree;

* The `height()` returns the length of the path from the object calling it to the farthest descendant/leaf;

* And the `inorderWalk()` method prints all the nodes in ascending order. Now that print() is gone (its existence was kinda redundant), I made it a little more verbose;

* Finally, the `add_old()` method is an older version of the current `add()`. It was used when I didn't have a `find()` yet. It does the same thing, but the logic to find the right place is "built-in".

**Important:** some of this code is based on Cormen's Introduction to Algorithms and Open Data Structures code and content/info about trees. I'm really thankful for their effort on writing their books and this repository wouldn't have all these methods if it weren't for them.

**Links:**

* [Introduction to Algorithms, by Cormen et al](www.mitpress.mit.edu/books/introduction-algorithms)
* [Open Data Structures](www.opendatastructures.org)
