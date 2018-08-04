import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
  public static void main(String[] argv) {




     public Boolean phoneNumberValidation( String sPhoneNumber){
	 
	 //regular expression pattern for mobile number
      Pattern pattern = Pattern.compile("^[2-9]{2}[0-9]{8}$"); 

	  Matcher matcher = pattern.matcher(sPhoneNumber);


	  if (matcher.matches()) {
    	 
		 return true;
      }
      else
      {
    	return false;
      }

	 
	 
	 }
      
 }
}