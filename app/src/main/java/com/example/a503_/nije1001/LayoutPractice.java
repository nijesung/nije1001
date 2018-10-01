package com.example.a503_.nije1001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LayoutPractice extends AppCompatActivity {

    private Button btn01, btn02, btn03;
    private LinearLayout page01, page02, page03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_practice);


        // layout 에 만든 뷰 찾아오기
        btn01 = (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);
        btn03 = (Button)findViewById(R.id.btn03);
        page01 = (LinearLayout)findViewById(R.id.page01);
        page02 = (LinearLayout)findViewById(R.id.page02);
        page03 = (LinearLayout)findViewById(R.id.page03);

        // btn01 을 클릭했을 때 처리
        btn01.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                page01.setVisibility(View.VISIBLE);
                page02.setVisibility(View.INVISIBLE);
                page03.setVisibility(View.INVISIBLE);
            }
        });

        // btn02 을 클릭했을 때 처리
        btn02.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                page01.setVisibility(View.INVISIBLE);
                page02.setVisibility(View.VISIBLE);
                page03.setVisibility(View.INVISIBLE);
            }
        });

        // btn03 을 클릭했을 때 처리
        btn03.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                page01.setVisibility(View.INVISIBLE);
                page02.setVisibility(View.INVISIBLE);
                page03.setVisibility(View.VISIBLE);
            }
        });

    }
}
