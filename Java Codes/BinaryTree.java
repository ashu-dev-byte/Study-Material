class Node
{
    private Node left;
    private int data;
    private Node right;

    public Node()
    {
        left = null;
        data = 0;
        right = null;
    }

    public Node(int data)
    {
        left=null;
        this.data=data;
        right=null;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node right)
    {
        this.right = right;
    }

}


public class BinaryTree
{
    public static Node insertNode(int data)
    {
        Node n = new Node();
        n.setData(data);
        return n ;
    }

    public static void insert(Node root,Node current)
    {
        if(root==null){
            root = current;
        }

        if(root.getData()>current.getData())
        {
            if(root.getLeft()==null)
            {
                root.setLeft(current);
            }
            else
                insert(root.getLeft(),current);
        }

        if(root.getData()<current.getData())
        {
            if(root.getRight()==null)
            {
                root.setRight(current);
            }
            else
                insert(root.getRight(),current);
        }
    }
    public static boolean search(Node root, int data)
    {

        if (root==null) {
            return false;
        }
        if(data==root.getData()){
            return true;
        }
        if (root.getData() > data)
            return search(root.getLeft(), data);
        else
            return search(root.getRight(), data);
    }
    public static void inOrderDisplay(Node root)
    {

        if(root==null)
            return;
        inOrderDisplay(root.getLeft());
        System.out.print(root.getData()+" ");
        inOrderDisplay(root.getRight());
    }
    public static void preorder(Node root)
    {
        if (root==null)
            return;
        System.out.print(root.getData()+" ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }
    public static void postorder(Node root){
        if(root==null)
            return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getData()+" ");
    }
    public static void main(String[] args)
    {
        Node root = new Node(17);

        insert(root,insertNode(8));
        insert(root,insertNode(56));
        insert(root,insertNode(38));
        insert(root,insertNode(45));
        insert(root,insertNode(3));
        insert(root,insertNode(18));
        insert(root,insertNode(90));

        System.out.println("inorder display of binary tree is");
        inOrderDisplay(root);
        System.out.println();
        System.out.println("preorder display of binary tree is");
        preorder(root);
        System.out.println();
        System.out.println("postorder display of binary tree is");
        postorder(root);
        System.out.println();

        System.out.println(search(root,45));

    }
}


