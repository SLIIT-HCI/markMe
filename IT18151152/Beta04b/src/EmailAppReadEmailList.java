
public class EmailAppReadEmailList implements Command{

	EmailApp e;

	public EmailAppReadEmailList(EmailApp e) {
		super();
		this.e = e;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		e.ReadEmailList();
	}
	
	
	
}
