package cloud.path;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.about);
	    
	     
        TextView about = (TextView)findViewById(R.id.about_txt);
        about.setText(readTxt());
	    
        
	
	    // TODO Auto-generated method stub
	}
	
	
	
	
	private String readTxt(){

    	InputStream inputStream = getResources().openRawResource(R.raw.about);
    	
    	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    	
    	int i;
		try {
			i = inputStream.read();
			while (i != -1)
	    	{
	    		byteArrayOutputStream.write(i);
	    		i = inputStream.read();
	    	}
	    	inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return byteArrayOutputStream.toString();

}
}