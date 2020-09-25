/**
 * @author lin
 * @create 2020-09-16 20:05
 */
public class TreeNode {

    class Treenode{
        int val;
        Treenode left;
        Treenode right;
        public Treenode(int x){
            val = x;
        }
    }

    public Treenode reserve(Treenode root){
        if (root == null){
            return null;
        }
        Treenode left = reserve(root.left);
        Treenode right = reserve(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {

    }

}
