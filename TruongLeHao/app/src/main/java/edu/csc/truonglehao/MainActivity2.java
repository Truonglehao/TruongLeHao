package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText edtCMND,edtPhone,edtDiaChi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Số 1");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);

    }
    private void addControls() {
        edtCMND= (EditText) findViewById(R.id.edtCMND);
        edtPhone= (EditText) findViewById(R.id.edtPhone);
        edtDiaChi= (EditText) findViewById(R.id.edtDiaChi);
    }

    public void xuLyCapNhat(View view) {
        Toast.makeText(this,"Bạn nhấn Cập nhật",Toast.LENGTH_LONG).show();
    }

    public void xulyLamLai(View view) {
        edtCMND.setText("");
        edtPhone.setText("");
        edtDiaChi.setText("");
        edtCMND.requestFocus();
    }
}


