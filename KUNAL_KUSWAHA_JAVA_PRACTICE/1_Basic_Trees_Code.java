class 1_Basic_Trees_Code{
   public BinaryTree(){

   }
   private static class Node{
      int value;
      Node left;
      Node right;

      public Node(int value){
         this.value = value;
      }
   }

   private Node root;

   //Insert elements
   public void populate(Scanner scanner){
      System.out.println("Enter the root node value = ");
      int value = scanner.nextInt();
      root = new Node(value);
      populate(scanner,root);
   }

   private void populate(Scanner scanner, Node node){
      System.out.println("Do you want to enter left of "+node.value);
      boolean left = scanner.nextBoolean();
      if(left){
         System.out.println("Enter the value of left node = "+node.value);
         node.left = new Node(value);
         populate(scanner, node.left);
      }
   }
}