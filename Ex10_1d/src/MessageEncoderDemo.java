
public class MessageEncoderDemo {

   public static void main(String[] args) {
      SubstitutionCipher A = new SubstitutionCipher(3);
      
      SubstitutionCipher B = new SubstitutionCipher(4);
      
      ShuffleCipher C = new ShuffleCipher(1);
      
      ShuffleCipher D = new ShuffleCipher(3);
      
      A.encode("a");
      B.encode("d");
      C.encode("abcdefghi");
      D.encode("wsdvcder");
   }

}