import java.util.LinkedList;
import java.util.List;

public class IsValidBST {
    List<Integer> res = new LinkedList<>();
    public boolean solution(TreeNode root) {
        res = inOrder(root);
        int length = res.size();
        for(int i=0;i<length-1;i++){
            if(res.get(i) > res.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public List<Integer> inOrder(TreeNode root){
        List<Integer> res = new LinkedList<>();
        if(root == null){
            return res;
        }
        res.addAll(inOrder(root.left));
        res.add(root.val);
        res.addAll(inOrder(root.right));
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        System.out.println("the result is:"+new IsValidBST().solution(root));

    }
}
