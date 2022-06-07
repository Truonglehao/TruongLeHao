package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText edtCMND,edtPhone,edtDiaChi;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Số 1");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();

    }


    private void addControls() {
        edtCMND= (EditText) findViewById(R.id.edtCMND);
        edtPhone= (EditText) findViewById(R.id.edtPhone);
        edtDiaChi= (EditText) findViewById(R.id.edtDiaChi);
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
                Toast.makeText(this,"Bạn vừa chọn menu 1",Toast.LENGTH_LONG).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                i = new Intent(MainActivity2.this, TTSV.class);
                startActivity(i);
                break;
            case R.id.menu3:
                i = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            case R.id.menu4:
                i = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void xuLyCapNhat(View view) {
        Toast.makeText(this,"Bạn nhấn Cập nhật",Toast.LENGTH_LONG).show();
    }

    public void xulyLamLai(View view) {
        Toast.makeText(this,"Bạn nhấn làm lại",Toast.LENGTH_LONG).show();
        edtCMND.setText("");
        edtPhone.setText("");
        edtDiaChi.setText("");
        edtCMND.requestFocus();
    }
}


