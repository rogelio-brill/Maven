package com.brilliomave.p1;

/*
* This class prints the given message on console.
*/

public class MessageUtil {
   private String message;

   // Constructor
   // @param message to be printed
   public MessageUtil(String message) {
      this.message = message;
   }

   // prints the message
   public String printMessage() {
      System.out.println(message);
      return message;
   }

   // add "website url" to the message
   public String salutationMessage() {
      message = "mywebsite" + message;
      System.out.println(message);
      return message;
   }

   // add "www." to the message
   public String exitMessage() {
      message = "www." + message;
      System.out.println(message);
      return message;
   }
}
