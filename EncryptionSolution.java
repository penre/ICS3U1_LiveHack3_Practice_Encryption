class EncryptionSolution extends ConsoleProgram {

  /**
  * A program the encrypts a message inputted by the user SOLUTION
  * @author: C. Chen
  */
  
  public void run() {
    // Declare variables
    String strMessage;
    int intShift;
    String strEncryption;

    // Output title
    System.out.println("**** Encryption Program ****");

    // Get message and shift amount from user
    strMessage = readLine("Enter the message to encrypt: ");
    intShift = readInt("Enter the shift amount: ");

    // Encrypt the message
    strEncryption = encryptMessage(strMessage, intShift);

    // Output the encrypted message
    System.out.println("Here is your encrypted message: " + strEncryption);
  }

  /**
   * Encrypts a message
   * 
   * @param message string to encrypt
   * @param shift how much to shift the message by
   * @throws shift is less than 1
   * @return the encrypted message
   */
  public String encryptMessage(String message, int shift) {
    // Exception if shift < 1
    if (shift < 1) {
      throw new IllegalArgumentException("Illegal shift value. Shift must be greater than 1.");
    }

    // Declare variable
    String result = "";

    // Loop message and shift each character
    for (int i = 0; i < message.length(); i++) {
      result += (char)(' ' + ((message.charAt(i) - ' ' + shift) % 95));
    }

    // Return result
    return result;
  }
}