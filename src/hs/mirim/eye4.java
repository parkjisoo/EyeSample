package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class eye4 extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex4);
        
        Button btnNext4 = (Button)findViewById(R.id.btnNext4);
        
        btnNext4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(eye4.this, eyef.class);
				startActivity(intent);
				
			}
		});

	}
}