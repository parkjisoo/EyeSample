package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class eye2 extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2);

        Button btnNext2 = (Button)findViewById(R.id.btnNext2);
        
        btnNext2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					Intent intent = new Intent(eye2.this, eye3.class);
					startActivity(intent);
				
			}
		});
        
	}
}
