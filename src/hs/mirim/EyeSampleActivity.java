package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EyeSampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnNeck = (Button)findViewById(R.id.btnNeck);
        Button btnExer = (Button)findViewById(R.id.btnExcer);
        Button btnExit = (Button)findViewById(R.id.btnExit);
        
        btnNeck.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(EyeSampleActivity.this, Neck.class);
				startActivity(intent);
				
			}
		});
        
        btnExer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(EyeSampleActivity.this, eye.class);
				startActivity(intent);
			}
		});
        btnExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
    }
}