package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;
    Intent i;

    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.chuyendoi);
        textView=findViewById(R.id.amlich);
        editText=findViewById(R.id.duonglich);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can []={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","Kỷ"};
                String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mão","Thìn","Tỵ","Ngọ","Mùi"};
                String di = editText.getText().toString();
                int m = Integer.parseInt(di);
                String am= can[m%10] + " " +chi[m%12];
                textView.setText(am);
            }
        });
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Số 2");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                i = new Intent(MainActivity3.this, TTSV.class);
                startActivity(i);
                break;

            case R.id.menu2:
                i = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            case R.id.menu3:
                i = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

}
