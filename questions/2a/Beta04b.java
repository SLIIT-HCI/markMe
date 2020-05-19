
class EmailApp { // 0.5 marks
   public void ReadEmailList() {  // 0.5 marks
      System.out.println("Read email ..");
   }
   public void SendEmail() {  // 0.5 marks
      System.out.println("Send email ..");
   }
   public void ReadEmail() { // 0.5 marks
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
class EmailAppReadEmailList implements Command {
    EmailApp myApp; 

    public EmailAppReadEmailList(EmailApp myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.ReadEmailList();
    }
}

// 1.5 marks for class
class EmailAppSendEmail implements Command {
    EmailApp myApp;

    public EmailAppSendEmail(EmailApp myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.SendEmail();
    }
}

// 1.5 marks for class
class EmailAppReadEmail implements Command {
    EmailApp myApp;

    public EmailAppReadEmail(EmailApp myApp) {
       this.myApp = myApp;
    }
    public void execute() {
       myApp.ReadEmail();
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
/

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
      EmailApp mapp = new EmailApp();
      EmailApp microsoftOutlook = new EmailApp();  // 1 mark
      SoftwarePackage Excel = new SoftwarePackage();

      EmailAppReadEmailList eae = new EmailAppReadEmailList(mapp);
      EmailAppReadEmail ear = new EmailAppReadEmail(mapp);
      EmailAppSendEmail eas = new EmailAppSendEmail(mapp); // 1.5 marks 
                              //(only 3 correct 1 mark, only 2 correct 0.5 marks)
      SoftwarePackageOpen so = new SoftwarePackageOpen(Excel);
      SoftwarePackageClose sc = new SoftwarePackageClose(Excel);
     
      VirtualAssistant va = new VirtualAssistant(); // 0.5 marks

      va.setCommand("ReadEmailList", 0, eae);
      va.setCommand("ReadEmail",1,ear);
      va.setCommand("SendEmail",2, eas); // 1 mark
      va.setCommand("Open Software",3, so);
      va.setCommand("Close Package", 4, sc);
      va.commandPressed(1);
      va.commandPressed(2); // 1 mark
      va.commandPressed(3);
   }
}

