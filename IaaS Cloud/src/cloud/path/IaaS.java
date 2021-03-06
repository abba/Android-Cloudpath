

package cloud.path;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class IaaS extends Activity {
    /** Main Screen Activity Handler. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iaas);
        
        TextView hello = (TextView)findViewById(R.id.hello_txt);
        hello.setText(readTxt());
    }
    
    private String readTxt(){

    	InputStream inputStream = getResources().openRawResource(R.raw.hello);
    	
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
