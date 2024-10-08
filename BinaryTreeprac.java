import java.util.*;


/*Build*/
//public class BinaryTreeprac {
//static class Node{
//    int data;Node left;Node right;
//    Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right=null;}}
//    static class BinaryTree{
//    static int idx=-1;
//    public static Node buildTree(int [] nodes){
//        idx++;
//        if (nodes[idx]==-1){return null;}
//        Node newNode=new Node(nodes[idx]);
//        newNode.left=buildTree(nodes);
//        newNode.left=buildTree(nodes);
//return newNode;}}
//    public static void main(String[] args) {
//int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//BinaryTree tree=new BinaryTree();
//Node root=tree.buildTree(nodes);
//        System.out.println(root.data);}}
/*BUILD TREE PREORDER*/
//public class BinaryTreeprac {
//    static class Node{
//        int data;Node left;Node right;
//    Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right=null;}}
//    static class BinaryTree{
//        static int idx=-1;
//        public static Node buildTree(int [] nodes){
//            idx++;
//            if (nodes[idx]==-1){return null;}
//            Node newNode=new Node(nodes[idx]);
//            newNode.left=buildTree(nodes);
//            newNode.right=buildTree(nodes);
//            return newNode;}}
//    public static void main(String[] args) {
//        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinaryTree tree=new BinaryTree();
//        Node root =tree.buildTree(nodes);
//        System.out.println(root.data);}
import java.util.LinkedList;

public class BinaryTreeprac {
    static class Node{
        int data;Node left;Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;}}
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int [] nodes){
            idx++;
            if (nodes[idx]==-1){return null;}
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;}
    public static void preOrder(Node root){
            if (root==null){return;}
        System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);}
        public static void inOrder(Node root){
            if (root==null){return;}
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);}
        public static void postOrder(Node root){
            if (root==null){return;}
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");}
//    public static void levelOrder(Node root){
//            if (root==null){return ;}
//            Queue <Node>q=new LinkedList<>();
//            q.add(root);
//            q.add(null);
//            while (!q.isEmpty()){
//                Node currNode=q.remove();
//                if (currNode==null) {
//                    System.out.println();
//                    if (q.isEmpty()) {break;}
//                    else {q.add(null);}}
//                else {System.out.print(currNode.data+" ");
//                    if (currNode.left!=null){q.add(currNode.left);}
//                    if (currNode.right!=null){q.add(currNode.right);}}}}}
        public static void levelOrder(Node root){
        if (root==null){return;}
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode=q.remove();
            if (currNode==null){
                System.out.println();
                if (q.isEmpty()){break;}
                else{q.add(null);}}
            else {
                System.out.print(currNode.data+" ");
            if (currNode.left!=null){q.add(currNode.left);}
                if (currNode.right!=null){q.add(currNode.right);}}}}
    public static int heightOftree(Node root){
            if (root==null){return 0;}
            int lh=heightOftree(root.left);
            int rh=heightOftree(root.right);
            return Math.max(lh,rh)+1;}
        public static int count(Node root){
            if (root==null){return 0;}
            int leftCount=count(root.left);
            int rightCount=count(root.right);
            return leftCount+rightCount+1;}

        public static int sumOfNodes(Node root){
            if (root==null){return 0;}
            int leftSum=sumOfNodes(root.left);
            int rightSum=sumOfNodes(root.right);
            return leftSum+rightSum+root.data;}
public static int diameter(Node root){
            if (root==null){return 0;}
            int ldiam=diameter(root.left);
            int rdiam=diameter(root.right);
            int lh=heightOftree(root.left);
            int rh=heightOftree(root.right);
            int selfdiamter=lh+rh+1;
            return Math.max(ldiam,Math.max(rdiam,selfdiamter));}}
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
//        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
//        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println('\n'+"----------------------");
    tree.preOrder(root);
        System.out.println("\n"+"----------------------");
        tree.inOrder(root);
        System.out.println('\n'+"----------------------");
    tree.postOrder(root);
        System.out.println('\n'+"----------------------");
    tree.levelOrder(root);
        System.out.println("The height of the given tree in terms of Nodes is "+tree.heightOftree(root));
        System.out.println("The number of Nodes in the tree are "+tree.count(root));
        System.out.println("The sum of the Nodes of the tree ");
        System.out.println("The diameter of the tree is "+tree.diameter(root));}}