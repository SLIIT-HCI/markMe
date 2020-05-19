
class MessageApp { // 0.5 marks
   public void ReadMessageList() {  // 0.5 marks
      System.out.println("Read email ..");
   }
   public void SendMessage() {  // 0.5 marks
      System.out.println("Send email ..");
   }
   public void ReadMessage() { // 0.5 marks
      System.out.println("Reading current email .. ");
   }

}

class SoftwarePackage { // 1 mark
   public void Open() {
      System.out.println("Opening Package"); // 0.5 marks
   }
   public void Close() {
      System.out.println("Closing Package"); // 0.5 marks
   } 

}

interface Command { // 1 mark
   void execute();
}

// 1.5 marks each for class (give 0.5 marks each for property and two methods)
class MessageAppReadMessageList implements Command {
    MessageApp myApp; 

    public MessageAppReadMessageList(MessageApp myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.ReadMessageList();
    }
}

// 1.5 marks for class
class MessageAppSendMessage implements Command {
    MessageApp myApp;

    public MessageAppSendMessage(MessageApp myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.SendMessage();
    }
}

// 1.5 marks for class
class MessageAppReadMessage implements Command {
    MessageApp myApp;

    public MessageAppReadMessage(MessageApp myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.ReadMessage();
    }
}
// 0.5 marks for using Command interface correctly in all of the above 3 classes

// 1.5 marks for class
class SoftwarePackageOpen implements Command {
    SoftwarePackage myApp;

    public SoftwarePackageOpen(SoftwarePackage myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.Open();
    }
}

// 1.5 marks for class
class SoftwarePackageClose implements Command {
    SoftwarePackage myApp;

    public SoftwarePackageClose(SoftwarePackage myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.Close();
    }
}
// 1 mark for using the command interface correctly


class VirtualAssistant {
    private Command cmd[]; // 1 mark

    public VirtualAssistant() {
        cmd = new Command[6]; // 0.5 marks
    }
    public void setCommand(String keyword, int index, Command cmdObj) {
       cmd[index] = cmdObj;  // 1.5 marks
    }

    public void commandPressed(int index) {
        cmd[index].execute(); // 1 mark
    }
}

class MainApp {
   public static void main(String args[]) {
      MessageApp mapp = new MessageApp();
      MessageApp microsoftOutlook = new MessageApp();  // 1 mark
      SoftwarePackage Excel = new SoftwarePackage();

      MessageAppReadMessageList eae = new MessageAppReadMessageList(mapp);
      MessageAppReadMessage ear = new MessageAppReadMessage(mapp);
      MessageAppSendMessage eas = new MessageAppSendMessage(mapp); // 1.5 marks 
                              //(only 3 correct 1 mark, only 2 correct 0.5 marks)
      SoftwarePackageOpen so = new SoftwarePackageOpen(Excel);
      SoftwarePackageClose sc = new SoftwarePackageClose(Excel);
     
      VirtualAssistant va = new VirtualAssistant(); // 0.5 marks

      va.setCommand("ReadMessageList", 0, eae);
      va.setCommand("ReadMessage",1,ear);
      va.setCommand("SendMessage",2, eas); // 1 mark
      va.setCommand("Open Software",3, so);
      va.setCommand("Close Package", 4, sc);
      va.commandPressed(1);
      va.commandPressed(2); // 1 mark
      va.commandPressed(3);
   }
}

