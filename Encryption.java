class Encryption extends ConsoleProgram {

  /**
  * A program the encrypts a message inputted by the user
  * @author: peter zhang
  */
  
  public void run() {
    int shiftAmount;
    String encryptMessage;
    String strMessage;

    System.out.println("**** ENCRYPTING PROGRAM *****");
    strMessage = readLine("What is your message? ");
    shiftAmount = readInt("What is your shift amount? ");

    encryptMessage = encryptMessage(strMessage , shiftAmount);

    System.out.println("The encrypted message is: " + encryptMessage);

    
  }
  /**
   * 
   * @param message
   * @param shift
   */
  public String encryptMessage(String message, int shift) {

    String result = "";

    for (int i = 0; i < message.length(); i++){
      result += (char)( ' ' + ((message.charAt(i) - ' ' + shift) % 95));
    }
    return result;
  }

}
