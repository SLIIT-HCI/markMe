
public class EmailAppSendEmail implements Command{

	EmailApp e;

	public EmailAppSendEmail(EmailApp e) {
		super();
		this.e = e;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		e.SendEmail();
	}
}
