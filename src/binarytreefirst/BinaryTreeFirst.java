
package binarytreefirst;

class Node{
Node left;
int data;
Node right;
    Node(int data){
    left=null;
    this.data=data;
    right=null;
    }
}
public class BinaryTreeFirst {

    
     static Node add(Node root,int data){
           Node iter=root;
           if(iter==null){
               root=new Node(data);
               return root;
           }
           else if(data<iter.data){
               if(iter.left!=null){
               add(iter.left,data);
               }
               else{
                   System.out.println("Inserted to "+data+" left "+iter.data);
               iter.left=new Node(data);
               }
               return root;
           }
           else if(data>iter.data){
                if(iter.right!=null){
                add(iter.right,data);
                }
                else{
               System.out.println("Inserted to "+data+" right "+iter.data);
               iter.right=new Node(data);
                }
                return root;
           }
           return root;
    }
     
     public static void travers(Node root){
         if(root!=null){
         travers(root.left);
         System.out.println("Traversed"+root.data);
         travers(root.right);
     }
     }
     
     public static void min(Node root){
         while(root.left!=null){
         root=root.left;
         }
         System.out.println("Min="+root.data);
     
     }  
     public static void max(Node root){
         while(root.right!=null){
             root=root.right;
         }
         System.out.println("Max="+root.data);
     }
    
     public static Node search(Node root,int data){
            
         if(root.data==data){
            return root;
            }
             else if(data<root.data){
                 return search(root.left,data);
                 
             }
             else {               
                 return search(root.right,data);
                
             }
    
         
     }
    public static void main(String[] args) {
        Node root=null;
        root=add(root,15);
        root=add(root,3);
        root=add(root,10);
        root=add(root,20);
        root=add(root,30);
        
        
       Node value=search(root,10);
        System.out.println(value.data);
    }
    
}
