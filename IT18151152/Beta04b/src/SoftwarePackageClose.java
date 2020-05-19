
public class SoftwarePackageClose implements Command{

	SoftwarePackage software;

	public SoftwarePackageClose(SoftwarePackage software) {
		super();
		this.software = software;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		software.Close();
	}
}
