
public class SubstitutionCipher implements MessageEncoder {
   
   private int shift;
   
   public SubstitutionCipher(int newShift) {
      shift = newShift;
   }
   
   public void encode(String plainText) {
     char cPlainText = plainText.charAt(0);
      int iPlainText = (int)cPlainText;
      iPlainText = iPlainText + shift;
      cPlainText = (char)iPlainText;
      plainText = Character.toString(cPlainText);
      
      System.out.println(plainText);
   }

}