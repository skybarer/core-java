
import java.io.FileInputStream;
import java.io.IOException;

import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;

public class UploadFile {

 public static void main(String[] args) throws IOException {
  String existingBucketName = "apssdcdigilocker";
  String keyName = "intro.mp4";
  
  String filePath = "E:/html/intro.mp4";
  String amazonFileUploadLocationOriginal=existingBucketName+"/";
  

  @SuppressWarnings("deprecation")
AmazonS3 s3Client = new AmazonS3Client(new PropertiesCredentials(UploadFile.class.getResourceAsStream("AwsCredentials.properties")));
  //AmazonS3 s3Client = new AmazonS3Client(new ProfileCredentialsProvider());        
 // s3Client.putObject(new PutObjectRequest(existingBucketName, keyName, filePath));

  FileInputStream stream = new FileInputStream(filePath);
  ObjectMetadata objectMetadata = new ObjectMetadata();
  PutObjectRequest putObjectRequest = new PutObjectRequest(amazonFileUploadLocationOriginal, keyName, stream, objectMetadata);
  PutObjectResult result = s3Client.putObject(putObjectRequest);
  System.out.println("Etag:" + result.getETag() + "-->" + result);

 }
 
}