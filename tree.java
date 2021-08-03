package demo;
import java.util.*;

public class Anand {
	static Scanner sc=null;

	public static void main(String[] args) {
				
	    sc=new Scanner(System.in);
	    Node root=createTree();
	    System.out.println();
	    preOrder(root);
	    System.out.println();
	    inOrder(root);
	    System.out.println();
	    postOrder(root);
		
	}
	static Node createTree()
	{
		Node root=null;
		System.out.println("Enter the data: ");
		int data=sc.nextInt();
		if(data== -1)
		{
			return null; 
		}else {
			root=new Node(data);
			System.out.println("Enter the data for left: "+data);
			root.left=createTree();
			System.out.println("Enter the data for right: "+data);
			root.right=createTree();
			
		}
		return root;
	}
	static void preOrder(Node root)
	{
		if(root== null)
		{
			return;
		}else {
			
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}else {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	static void postOrder(Node root)
	{
		if(root==null)
		{
			return;
		}else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
			
		}
	}
}
class Node
{
	Node left,right;
	int data;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
