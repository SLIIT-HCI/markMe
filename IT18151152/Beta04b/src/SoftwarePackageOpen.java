
public class SoftwarePackageOpen implements Command{

	SoftwarePackage software;

	public SoftwarePackageOpen(SoftwarePackage software) {
		super();
		this.software = software;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		software.Open();
	}
	
	
}
