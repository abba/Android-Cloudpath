package cloud.path;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Evaluate extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.evaluation); 
	  
	    
	    // Set up click listeners for all the buttons
        View submitButton = findViewById(R.id.submit_button);
       submitButton.setOnClickListener((OnClickListener) this);
	
	
     
}


	public void onClick(View v) {
		
		 switch (v.getId()) {
		 
		 case R.id.submit_button:
		  Intent i = new Intent(this, IaaS.class);
          startActivity(i);
	}

	}

}