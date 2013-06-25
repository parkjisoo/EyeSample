package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class eye3 extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3);
        
        Button btnNext3 = (Button)findViewById(R.id.btnNext3);
        
        btnNext3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(eye3.this, eye4.class);
				startActivity(intent);
				
			}
		});
        
	}
}