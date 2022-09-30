
public class ShuffleCipher implements MessageEncoder {
   
   private int n;
   
   public ShuffleCipher(int newN) {
      n = newN;
   }
   
   public void encode(String plainText) {
      for (int i = 0; i < n; i++) {
         double lenText = plainText.length();
         String result = "";
         
         int midNum = (int)Math.round(lenText / 2);
         
         String plainTextA = plainText.substring(0, midNum);
         String plainTextB = plainText.substring(midNum, (int)lenText);
         
         if ((lenText % 2) == 0) {
            for (int j = 0; j < midNum; j++) {
               result += (plainTextA.substring(j, j + 1) + plainTextB.substring(j, j + 1));
            }
         }
         else {
            for (int j = 0; j < midNum - 1; j++) {
               result += (plainTextA.substring(j, j + 1) + plainTextB.substring(j, j + 1));
            }
            result += plainTextA.substring(midNum - 1, midNum);
         }
         
         plainText = result;
         
      }
      
      System.out.println(plainText);
   }

}