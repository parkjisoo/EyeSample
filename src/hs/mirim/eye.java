package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class eye extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1);
        
        Button btnNext1 = (Button)findViewById(R.id.btnNext1);
        btnNext1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(eye.this, eye2.class);
				startActivity(intent);
				
			}
		});
        
	}
}
