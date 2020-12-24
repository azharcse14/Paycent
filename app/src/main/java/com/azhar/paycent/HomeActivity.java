package com.azhar.paycent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity{
//public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardView = findViewById(R.id.scanCard);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Camera.class);
                startActivity(intent);
            }
        });

//        toolbar=findViewById(R.id.toolBar);
//
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        drawerLayout=findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
//        drawerLayout.addDrawerListener(toggle);
//
//        toggle.syncState();
//
//        navigationView=findViewById(R.id.navigation_view);
//        navigationView.setNavigationItemSelectedListener( this);
    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
//        if (menuitem.getItemId() == R.id.payment_methods) {
//            Intent intent =new Intent(HomeActivity.this,TermsAndCondition.class);
//            startActivity(intent);
//        }else if (menuitem.getItemId()==R.id.history){
//
//            Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT).show();
//        }
//
//
//        drawerLayout.closeDrawer(GravityCompat.START);
//        return false;
//    }
}