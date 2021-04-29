package Profile;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.famefood.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import Utils.BottomNavigationViewHelper;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;

    private Context mContext = ProfileActivity.this;
    private Object BottomNavigationView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");

        setupBottomNavigationView();
        //setupToolbar();


    }

    
    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);
        setupToolbar();



        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d(TAG, "onMenuItemCLick: clicked menu item: " + item);
                switch (item.getItemId()){
                    case R.id.profileMenu:

                    Log.d(TAG, "onMenuItemClick: Navigating to Profile Prefrences.");
                }
                return true;
            }
        });
        
        
    }



    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, this,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
        
    }
}
