package com.example.googlelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ResultActivity extends AppCompatActivity {

    private TextView tv_result;
    private ImageView iv_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName");//mainactivity 에서 닉네임 전달 받는 코드
        String photoUrl = intent.getStringExtra("photoUrl");//이것도 메인엑티비티에서 프로필 사진 전달 받는거

        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_result.setText(nickName);

        iv_profile = (ImageView)findViewById(R.id.iv_profile);
        Glide.with(this).load(photoUrl).into(iv_profile);
    }
}