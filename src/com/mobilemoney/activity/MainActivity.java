package com.mobilemoney.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuInflater;

public class MainActivity extends SherlockActivity implements ActionBar.TabListener{
    /** Called when the activity is first created. */
	ActionBar actionbar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        actionbar =  getSupportActionBar();
        
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab mobile_tab = getSupportActionBar().newTab();
        mobile_tab.setText("Mobile");
        mobile_tab.setTabListener(this);
        getSupportActionBar().addTab(mobile_tab);
        
        ActionBar.Tab money_tab = getSupportActionBar().newTab();
        money_tab.setText("Money");
        money_tab.setTabListener(this);
        getSupportActionBar().addTab(money_tab);
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getSupportMenuInflater();
    	inflater.inflate(R.menu.main_screen_menu, menu);
		return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	switch (item.getItemId()) {
		case R.id.sub_menu_about:
			Log.i("Item 1 : ", Integer.toString(item.getItemId()));
			break;
			
		case R.id.sub_menu_settings:
			Log.i("Item 2 :",  Integer.toString(item.getItemId()));
		default:
			Log.i("default", item.toString());
			break;
		}
    	return super.onOptionsItemSelected(item);
    }

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}