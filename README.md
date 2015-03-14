# binary_search_tree
A naive implementation of the binary search tree in Java. Keep in mind that I'm learning Java and Trees, so this is not the best code around hehe.

**Some info:**

* `p`, `l` and `r` are the parent, left and right leafs, respectively. `k` is the integer that leaf holds.

* The `print()` method prints all the leafs in the (sub-)tree rooted at the object calling it - in a strange way.

* The `find()` method searches for the leaf that contains the int passed as argument. If found, returns it. If not, returns the leaf that would be its parent if the searched leaf existed at that moment.

* The `add()` method uses `find()` to get to the place where the new leaf should be added. If a leaf already has that int passed as argument, it ignores it and doesn't add a thing (so there are no duplicates). If the new leaf is smaller than the current being looked at, it goes to the left; if it's greater, it goes to the right.

* The `size()` method returns the quantity of leafs in the (sub-)tree rooted at the object calling it.

* And the `depth()` returns the length of the path from the object calling it to the root of the tree.

* Finally, the `add_old()` method is an older version of the current `add()`. It was used when I didn't have a `find()` method yet. It does the same thing, but the logic to find the right place is "built-in".
