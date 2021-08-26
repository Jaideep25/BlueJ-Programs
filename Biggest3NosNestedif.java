class Biggest3NosNestedif {
   public static void main(int x, int y, int z) {
      if (x > y) {
         if (x > z)
            System.out.println(x + " is biggest number");
         else
            System.out.println(z + " is biggest number");
      } else {
         if (y > z)
            System.out.println(y + " is biggest number");
         else
            System.out.println(z + " is biggest number");
      }
   }
}