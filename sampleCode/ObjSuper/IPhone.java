package sampleCode.ObjSuper;

public class IPhone extends CellPhone {
   public IPhone(String oN, int v) {
      super(oN, "iPhone", v);
   }
   
   public void sendText(CellPhone receiver) {
      /*
       * TODO (step 3): Complete this method.
       * Because we are in the `IPhone` class, we know that this phone (the sender) is an IPhone.
       * Check if the receiver phone is an IPhone too (if the model is equal to "IPhone").
       * If so, this method should print a message formatted like the following:
       *
       *    "Jim is sending a blue text to Emma"
       *
       * If the receiver phone is not an IPhone, the output message should be formatted like the following:
       *
       *    "Jim is sending a green text to Moby"
       */
      super.sendText(receiver);
   }
}