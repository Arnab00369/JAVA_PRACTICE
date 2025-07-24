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
      innt value = scanner.nextInt();
      root = new Node(value);

   }
}