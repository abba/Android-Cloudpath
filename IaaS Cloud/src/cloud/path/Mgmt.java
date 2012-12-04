package cloud.path;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Mgmt extends Activity implements OnClickListener
{

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.login);
	
	    // TODO Auto-generated method stub
	}

	
	public void onClick(View v) {
        switch (v.getId()) {
        case R.id.button1:
           Intent vm = new Intent(this, IaaS.class);
           startActivity(vm);
           break;
        case R.id.button2:
        	Intent m = new Intent (this, Mgmt.class);
        	startActivity(m);
        	break;
}
}
}