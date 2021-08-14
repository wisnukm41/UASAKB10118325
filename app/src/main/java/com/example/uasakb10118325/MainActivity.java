// Dibuat Tanggal 14 Agustus 2021
// Oleh Wisnu Murfadilah Rokhsan / 10118325 / IF8
package com.example.uasakb10118325;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.uasakb10118325.ui.dashboard.DashboardFragment;
import com.example.uasakb10118325.ui.home.HomeFragment;
import com.example.uasakb10118325.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
    BottomNavigationView bottomNavigationView;

    HomeFragment fragHome;
    DashboardFragment fragDashboard;
    NotificationsFragment fragNotification;

    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        setupViewPager(viewPager);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.navigation_dashboard:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.navigation_notifications:
                        viewPager.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                menuItem = bottomNavigationView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        fragHome = new HomeFragment();
        fragDashboard = new DashboardFragment();
        fragNotification = new NotificationsFragment();

        adapter.addFragment(fragHome);
        adapter.addFragment(fragDashboard);
        adapter.addFragment(fragNotification);
        viewPager.setAdapter(adapter);
    }


}