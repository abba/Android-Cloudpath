package cloud.path;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;

public class CloudPath_Main extends Activity implements OnClickListener{
	
	

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        
        
        // Set up click listeners for all the buttons
        View iaasButton = findViewById(R.id.iaas_button);
        iaasButton.setOnClickListener((OnClickListener) this);
        
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener((OnClickListener) this);
       
        View mgmtButton = findViewById(R.id.mgmt_button);
        mgmtButton.setOnClickListener((OnClickListener) this);
        
        View evaluateButton = findViewById(R.id.evaluate_button);
        evaluateButton.setOnClickListener((OnClickListener) this);
        
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener((OnClickListener) this);
    
    
    }     
        public void onClick(View v) {
            switch (v.getId()) {
            case R.id.iaas_button:
               Intent i = new Intent(this, IaaS.class);
               startActivity(i);
               break;
            case R.id.mgmt_button:
            	Intent m = new Intent (this, Mgmt.class);
            	startActivity(m);
            	break;
            	
            case R.id.evaluate_button:
            	Intent e = new Intent (this,Evaluate.class);
            	startActivity(e);
            	break;
        
               // More buttons
            case R.id.about_button:
            	Intent a = new Intent(this,About.class);
            	startActivity(a);
            	break;
            	
            	case R.id.exit_button:
               finish();
               break;
            }
            }
}