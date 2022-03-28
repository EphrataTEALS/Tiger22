package sampleCode.ObjSuper;

public class CellPhone {
   private String ownerName;
   private String model;
   private int version;
   
   public CellPhone(String oN, String m, int v) {
      ownerName = oN;
      model = m;
      version = v;
   }
   
   public String getOwnerName() {
      return ownerName;
   }
   
   public String getModel() {
      return model;
   }
   
   public int getVersion() {
      return version;
   }
   
   public String toString() {
      /*
       * TODO (Step 1): Complete this method.
       * When you print a cell phone, it should be formatted like the following example:
       *
       *    "Jim's CellPhone(iPhone 11)"
       */
      return "";
   }
   
   public boolean equals(Object obj) {
      /*
       * TODO (Step 2): Complete this method.
       * Two CellPhones should be seen as equal if they have the same model and version.
       * Remember that because the `equals()` method is first defined in the `Object` class,
       * the parameter must be really generic (a generic Object).
       * In order to use CellPhone functionality on the `obj` parameter,
       * you will need to cast it to a CellPhone:
       *
       *    CellPhone objAsCellPhone = (CellPhone) obj;
       */
      return false;
   }
   
   public void sendText(CellPhone receiver) {
      // a method for this phone (the sender) to send a text to a single other phone (the receiver)
      System.out.println(ownerName + " is sending a text to " + receiver.getOwnerName());
   }
}