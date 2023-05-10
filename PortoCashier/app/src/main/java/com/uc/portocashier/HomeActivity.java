package com.uc.portocashier;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.uc.portocashier.directory.AdapterUser;
import com.uc.portocashier.model.User;

import java.util.ArrayList;

import static com.uc.portocashier.model.SimpanData.list;

public class HomeActivity extends AppCompatActivity {
    FloatingActionButton button;
    ArrayList <User> listUsers = list;
    ArrayList<Integer> out  ;
    private static String Penjualantotal;
    TextView noData,totalpenjualan;
    RecyclerView rv;
    String test1,total2,beli1;
    int test2,beli2,kembalian;
    int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rv = findViewById(R.id.recycler_view);
        noData = findViewById(R.id.no_data);
        button = findViewById(R.id.button);
        totalpenjualan =findViewById(R.id.total_harga);
        ActionBar actionBar = getSupportActionBar();

        Intent intent = getIntent();
        test1=intent.getStringExtra("total beli");
        beli1=intent.getStringExtra("pembeli");
        if (!TextUtils.isEmpty(test1) && TextUtils.isDigitsOnly(test1)) {
            test2 = Integer.parseInt(test1);
        } else {
            test2= 0;
        }
        if (!TextUtils.isEmpty(Penjualantotal) && TextUtils.isDigitsOnly(Penjualantotal)){
            total = Integer.parseInt(Penjualantotal);
        } else {
            total= 0;
        }
        if (!TextUtils.isEmpty(beli1) && TextUtils.isDigitsOnly(beli1)){
            beli2 = Integer.parseInt(beli1);
        } else {
            beli2= 0;
        }
        if(Penjualantotal != null) {
            if (beli2 > test2) {
                kembalian = beli2 - test2;
            }
        }

        if(Penjualantotal != null) {
            total = total + beli2 - kembalian;
        }else{
            total = total + test2 - kembalian;
        }

        Penjualantotal = String.valueOf(total);
        totalpenjualan.setText(Penjualantotal);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AddUserActivity.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this);
                startActivity(intent, options.toBundle());

            }
        });

        if(listUsers.isEmpty()){
            noData.setVisibility(View.VISIBLE);
        }else{
            noData.setVisibility(View.INVISIBLE);
            showUsers(listUsers);
        }
    }

    private void showUsers(ArrayList<User> listUsers) {
        rv.setAdapter(null);
        rv.setLayoutManager(new LinearLayoutManager(HomeActivity.this));
        AdapterUser adapter = new AdapterUser(HomeActivity.this);
        adapter.setListUser(list);
        rv.setAdapter(adapter);

    }

    public boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            Intent b = new Intent(Intent.ACTION_MAIN);
            b.addCategory(Intent.CATEGORY_HOME);
            b.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(b);
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(HomeActivity.this, "Press back once more to close the apps!", Toast.LENGTH_SHORT).show();
    }
}


