
public class EmailappReadEmail implements Command{


	EmailApp e;

	public EmailappReadEmail(EmailApp e) {
		super();
		this.e = e;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		e.ReadEmail();
	}
}
