package labexirsise;
public class DiamondPattern {
  public static void main(String[] args) {
      int n = 5; // Center number
      
      // Upper half (5 to 1)
      for (int i = n; i >= 1; i--) {
          // Print leading spaces (optional, if alignment is needed)
          for (int s = 1; s < i; s++) {
              System.out.print(" ");
          }
          // Left side: i to 5
          for (int j = i; j <= n; j++) {
              System.out.print(j);
          }
          // Right side: 5-1 down to i
          for (int j = n - 1; j >= i; j--) {
              System.out.print(j);
          }
          System.out.println();
      }
      
      // Lower half (2 to 5)
      for (int i = 2; i <= n; i++) {
          // Print leading spaces (optional)
          for (int s = 1; s < i; s++) {
              System.out.print(" ");
          }
          // Left side: i to 5
          for (int j = i; j <= n; j++) {
              System.out.print(j);
          }
          // Right side: 5-1 down to i
          for (int j = n - 1; j >= i; j--) {
              System.out.print(j);
          }
          System.out.println();
      }
  }
}