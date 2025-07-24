package BinaryTree.service;

public class ImportantQuestions {
    
    public int countNoOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        return countNoOfNodes(root.left) + countNoOfNodes(root.right) + 1;
    }

    public int sumOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeigt = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeigt, rightHeight) + 1;
    }
}
