package com.example.a503_.nije1001;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Jindong extends AppCompatActivity {

    Button vibrateSound, sysSound, btnSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jindong);


        Button btnAsync = (Button)findViewById(R.id.btnAsync);
        btnAsync.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 대화상자 출력
                new AlertDialog.Builder(Jindong.this)
                        .setMessage("액티비티 종료")
                        .setTitle("대화 상자")
                        .setIcon(R.drawable.spider)
                        .setPositiveButton("프로그램 종료", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .show();

                // 토스트 출력
                Toast.makeText(Jindong.this, "토스트 맛잇음", Toast.LENGTH_LONG).show();

                // 액티비티 종료
                finish();
            }
        });


        Button btnBasic = (Button)findViewById(R.id.btnBasic);
        btnBasic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 메소드 체이닝을 이용한 생성과 출력
                new AlertDialog.Builder(Jindong.this).setMessage("기본 대화상자")
                        .setTitle("대화상자")
                        .setIcon(R.drawable.spider)
                        .setPositiveButton("거미", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Jindong.this, "거미를 눌렀다.", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("전갈", null)
                        .setNeutralButton("채찍전갈", null)
                        .setCancelable(false)
                        .show();
            }
        });


        Button btnToast = (Button)findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(Jindong.this, "히히히힣", Toast.LENGTH_LONG).show();
            }
        });


        // 버튼 찾아오기
        vibrateSound = (Button)findViewById(R.id.vibrateSound);
        sysSound = (Button)findViewById(R.id.sysSound);
        btnSound = (Button)findViewById(R.id.btnSound);

        vibrateSound.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 진동 만들기 - 1초동안 진동
                Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);
                vib.vibrate(3000);
            }
        });

        sysSound.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 시스템 사운드 만들기
                Uri sysyemsound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(),sysyemsound);
            }
        });

        btnSound.setOnClickListener(new Button.OnClickListener(){
            @Override
                // 버튼 사운드 재생
            public void onClick(View v) {
                MediaPlayer player = MediaPlayer.create(Jindong.this, R.raw.boom);
                player.start();
            }
        });


    }
}
