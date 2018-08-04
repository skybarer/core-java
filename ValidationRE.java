import java.util.regex.Matcher;
import java.util.regex.Pattern;
import VerhoeffAlgorithm;

class ValidationRE 
{
	
     public Boolean phoneNumberValidation( String sPhoneNumber){
	 
	 //regular expression pattern for mobile number
      Pattern pattern = Pattern.compile("^[2-9]{2}[0-9]{8}$"); 

	  Matcher matcher = pattern.matcher(sPhoneNumber);


	  if (matcher.matches()) { return true;}
      else {return false; }

	 }


	 public static boolean validateAadharNumber(String aadharNumber){
        Pattern aadharPattern = Pattern.compile("\\d{12}");
        boolean isValidAadhar = aadharPattern.matcher(aadharNumber).matches();
        if(isValidAadhar){
            isValidAadhar = VerhoeffAlgorithm.validateVerhoeff(aadharNumber);
        }
        return isValidAadhar;
    }
}
