/**
 * 
 */
package beta04a;

/**
 * @author oop17
 *
 */
public class SecurityDoorValidator {

	public static SecurityDoorValidator s;
	
	
	public SecurityDoorValidator(){}
	
	public static SecurityDoorValidator getInstance(){
	if(s == null){
		s = new SecurityDoorValidator();
	}
	
		return s;
	}
	
	public boolean validateDoorPin(int pin){
		int remainder = pin % 97;
		
		if(s.validateDoorPin(remainder = 0)){
			return true;
		}
		else
		return false;
	}
}
