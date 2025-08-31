package com.example.endoftermhomework;

import static com.example.endoftermhomework.R.color.black;
import static com.example.endoftermhomework.R.color.green;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

import com.example.endoftermhomework.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ActivityMainBinding mainBinding;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());


        initview();
        initEvent();


    }

    @SuppressLint("ResourceAsColor")
    private void initEvent() {
        mainBinding.llNav.ivHome.setSelected(true);
        mainBinding.llNav.tvHome.setTextColor(getResources().getColor(green));

    }

    private void initview() {

        mainBinding.llNav.ivHome.setOnClickListener(this);
        mainBinding.llNav.ivMoney.setOnClickListener(this);
        mainBinding.llNav.ivCount.setOnClickListener(this);
        mainBinding.llNav.ivMy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id= view.getId();

        if(id == R.id.iv_home){


            mainBinding.llNav.ivHome.setSelected(true);
            mainBinding.llNav.tvHome.setTextColor(getResources().getColor(green));


            mainBinding.llNav.ivMoney.setSelected(false);
            mainBinding.llNav.tvMoney.setTextColor(getResources().getColor(black));

            mainBinding.llNav.ivCount.setSelected(false);
            mainBinding.llNav.tvCount.setTextColor(getResources().getColor(black));


            mainBinding.llNav.ivMy.setSelected(false);
            mainBinding.llNav.tvMy.setTextColor(getResources().getColor(black));


            BlankFragment BlankFragment = new BlankFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcv_container,BlankFragment).commit();
        }
        if(id == R.id.iv_money){


            mainBinding.llNav.ivHome.setSelected(false);
            mainBinding.llNav.tvHome.setTextColor(getResources().getColor(black));


            mainBinding.llNav.ivMoney.setSelected(true);
            mainBinding.llNav.tvMoney.setTextColor(getResources().getColor(green));

            mainBinding.llNav.ivCount.setSelected(false);
            mainBinding.llNav.tvCount.setTextColor(getResources().getColor(black));


            mainBinding.llNav.ivMy.setSelected(false);
            mainBinding.llNav.tvMy.setTextColor(getResources().getColor(black));


            headFragment headFragment = new headFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcv_container,headFragment).commit();
        }
        if(id == R.id.iv_count){


            mainBinding.llNav.ivHome.setSelected(false);
            mainBinding.llNav.tvHome.setTextColor(getResources().getColor(black));


            mainBinding.llNav.ivMoney.setSelected(false);
            mainBinding.llNav.tvMoney.setTextColor(getResources().getColor(black));

            mainBinding.llNav.ivCount.setSelected(true);
            mainBinding.llNav.tvCount.setTextColor(getResources().getColor(green));


            mainBinding.llNav.ivMy.setSelected(false);
            mainBinding.llNav.tvMy.setTextColor(getResources().getColor(black));


            TurnFragment turnFragment = new TurnFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcv_container,turnFragment).commit();
        }
        if(id == R.id.iv_my){


            mainBinding.llNav.ivHome.setSelected(false);
            mainBinding.llNav.tvHome.setTextColor(getResources().getColor(black));


            mainBinding.llNav.ivMoney.setSelected(false);
            mainBinding.llNav.tvMoney.setTextColor(getResources().getColor(black));

            mainBinding.llNav.ivCount.setSelected(false);
            mainBinding.llNav.tvCount.setTextColor(getResources().getColor(black));


            mainBinding.llNav.ivMy.setSelected(true);
            mainBinding.llNav.tvMy.setTextColor(getResources().getColor(green));



            myFragment myFragment = new myFragment();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcv_container,myFragment).commit();
        }



    }
}