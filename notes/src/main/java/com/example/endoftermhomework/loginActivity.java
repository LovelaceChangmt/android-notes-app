package com.example.endoftermhomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class loginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtRegister1,mBtLogin;
    private EditText mEtAccount1,mEtPassword1;
    private MySQLiteOpenHelper mySQLiteOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mySQLiteOpenHelper = new MySQLiteOpenHelper(this);
        initView();

    }
    private void initView(){
        mBtRegister1 = findViewById(R.id.btn_Register);
        mBtLogin = findViewById(R.id.btn_login);
        mEtAccount1 = findViewById(R.id.et_account);
        mEtPassword1 = findViewById(R.id.et_password);

        mBtRegister1.setOnClickListener(this);
        mBtLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id==R.id.btn_login){
            String account = mEtAccount1.getText().toString();
            String password = mEtPassword1.getText().toString();
            boolean login =mySQLiteOpenHelper.login(account,password);
            if(login){
                Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
            }
        }
        if(id==R.id.btn_Register){
            Intent intent1 = new Intent(this,RegisterActivity.class);
            startActivity(intent1);
        }
    }
}
