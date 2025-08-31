package com.example.endoftermhomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtRegister;
    private EditText mEAccount,mEtPassword1,mEtPassword2;
    private MySQLiteOpenHelper mySQLiteOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll);
        mySQLiteOpenHelper = new MySQLiteOpenHelper(this);
        initView();
    }

    private void initView(){
        mBtRegister = findViewById(R.id.btn_confirm);
        mEAccount = findViewById(R.id.et_account);
        mEtPassword1 = findViewById(R.id.et_password);
        mEtPassword2 = findViewById(R.id.et_password2);

        mBtRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id==R.id.btn_confirm){
            UserBean userBean = getUserBeanInfo();
            boolean b = mySQLiteOpenHelper.register(userBean);
            if(b){
                Toast.makeText(this,"信息已添加",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,loginActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(this,"信息添加失败",Toast.LENGTH_SHORT).show();
            }
        }
    }
    private UserBean getUserBeanInfo(){
        UserBean userBean = new UserBean();
        String account = mEAccount.getText().toString().trim();
        String password = mEtPassword2.getText().toString().trim();
        userBean.setAccount(account);
        userBean.setPassword(password);
        return userBean;
    }
}