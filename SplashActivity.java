package in.apssdc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.yesbank.Registration;

import in.apssdc.common.SessionManager;

public class SplashActivity extends AppCompatActivity {

    protected static final String TAG = SplashActivity.class.getName();
    SessionManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        manager=new SessionManager();

        /****** Create Thread *************/
        Thread background = new Thread()
        {
            public void run()
            {

                try {
                    // Thread will sleep for 2 seconds
                    sleep(2*1000);

                    String virtualAddress = manager.getPreferences(SplashActivity.this, "virtualAddress");
                    String logUser = manager.getPreferences(SplashActivity.this, "logUser");
                    if(virtualAddress != null && !virtualAddress.isEmpty() && virtualAddress.length() > 3 && logUser!=null && !logUser.isEmpty() && logUser.length() > 3)
                    {
                        Intent i=new Intent(SplashActivity.this,MainActivity.class);
                        startActivity(i);
                    }else if(virtualAddress != null && !virtualAddress.isEmpty() && virtualAddress.length() > 3){
                        Intent i=new Intent(SplashActivity.this,LoginActivity.class);
                        startActivity(i);
                    }else{
                        Intent i=new Intent(SplashActivity.this,RegistrationActivity.class);
                        startActivity(i);
                    }


                    //Remove activity
                    finish();

                } catch (Exception e) {
                    Log.d(TAG + "- Exception", e.getMessage());
                }
            }
        };

        // start thread
        background.start();
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
        startActivity(intent);
        finish();
        System.exit(0);
    }
}
