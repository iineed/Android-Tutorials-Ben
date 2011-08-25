package com.iineed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
 
import com.iineed.model.Need;
import com.iineed.model.NeedController;
 
public class PostNeedActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.post_need);
 
    Button btn = (Button) findViewById(R.id.postNeedNow);
    btn.setOnClickListener(new OnClickListener() {
 
        @Override
        public void onClick(View v) {
            postNeed();
        }
    });
    }
 
    final void postNeed()
    {
    final Thread checkUpdate = new Thread() {
        public void run() {
        EditText title = (EditText) findViewById(R.id.needTitle);
        EditText description = (EditText) findViewById(R.id.needDescription);
        EditText price = (EditText) findViewById(R.id.needPrice);
      
        Need u = new Need();
        u.setTitle(title.getText().toString());
        u.setDescription(description.getText().toString());
        u.setPrice(price.getText().toString());
       
        final NeedController uc = new NeedController();
        try {
            uc.create(u);
        } catch (Exception e) {
            return;
        }
        final Intent intent = new Intent(PostNeedActivity.this,
        		IineedActivity.class);
        startActivity(intent);
        }
    };
    checkUpdate.start();
    }
}
