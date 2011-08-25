package com.iineed;

//import android.app.Activity;
import greendroid.app.GDActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import greendroid.widget.ActionBarItem;
import greendroid.widget.ActionBarItem.Type;
import greendroid.widget.QuickAction;
import greendroid.widget.QuickActionBar;
import greendroid.widget.QuickActionWidget;
import greendroid.widget.QuickActionWidget.OnQuickActionClickListener;
import android.os.Bundle;
import android.widget.Toast;

//new GDActivity



public class IineedActivity extends GDActivity {
    /** Called when the activity is first created. */
	private final int LOCATE = 0;
	private final int REFRESH = 1;
    private final int SHARE = 2;
    /*private final int SETTINGS= 2;*/
    
    private QuickActionWidget quickActions;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarContentView(R.layout.main);
        /*setContentView(R.layout.main);*/
        initActionBar();
        initQuickActionBar();
       
        
        Button postNeed = (Button) findViewById(R.id.postNeed);
        
        postNeed.setOnClickListener(new OnClickListener() {
        
        @Override
        public void onClick(View arg0) {
        Intent i = new Intent(IineedActivity.this, PostNeedActivity.class);
        startActivity(i);
        
        }
        });
        
    }
    private void initActionBar() {
    	addActionBarItem(Type.Locate, LOCATE);
    	addActionBarItem(Type.Refresh, REFRESH);
    	addActionBarItem(Type.Share, SHARE);
    	/*addActionBarItem(Type.Settings, SETTINGS);*/
    	}
    
    private void initQuickActionBar() {
        quickActions = new QuickActionBar(this);
        quickActions.addQuickAction(new QuickAction(this, R.drawable.facebook,
            "Facebook"));
        quickActions.addQuickAction(new QuickAction(this, R.drawable.twitter, "Twitter"));
        quickActions.addQuickAction(new QuickAction(this, R.drawable.mail, "Email"));
        quickActions.setOnQuickActionClickListener(new OnQuickActionClickListener() {
            public void onQuickActionClicked(QuickActionWidget widget,
                int position) {
             Toast.makeText(IineedActivity.this,
             "Item " + position + " clicked", Toast.LENGTH_SHORT)
             .show();
            }
        });
        }
    
    @Override
    public boolean onHandleActionBarItemClick(ActionBarItem item, int position) {
    switch (item.getItemId()) {
    case LOCATE:
        Toast.makeText(getApplicationContext(),
            "Vous avez cliquez sur le bouton LOCATE",
            Toast.LENGTH_SHORT).show();
        break;
 
    case REFRESH:
        Toast.makeText(getApplicationContext(),
            "Vous avez cliquez sur le bouton REFRESH",
            Toast.LENGTH_SHORT).show();
        break;
 
    case SHARE:
    	quickActions.show(item.getItemView());
    	
    	Toast.makeText(getApplicationContext(),
            "Vous avez cliquez sur le bouton SHARE",
            Toast.LENGTH_SHORT).show();
        break;
    default:
        return super.onHandleActionBarItemClick(item, position);
    }
 
    return true;
    }
    
    
}
	


