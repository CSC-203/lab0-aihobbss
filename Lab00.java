public class Lab00
{
   public static void main(String[] args) {
      //initializing variables
      int x = 5;
      String y = " hello";
      double z = 9.8;

      //printing variables
      System.out.print("x:" + x);
      System.out.print(" y:" + y);
      System.out.print(" z:" + z);
      System.out.println();

      //array
      int[] nums = {3, 6, -1, 2};
      for (int item: nums) {
         System.out.println(item);
      }

      //call a function
      char l = 'l';
      int numFound = CharCount(y, l);
      System.out.println("Found: " + numFound);

      //counting for loop
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
      }
   }
      public static int CharCount(String s, char c) {
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == c) {
            count++;
         }
      }
      return count;

   }
}
