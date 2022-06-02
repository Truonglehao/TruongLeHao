package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Số 5");
        actionBar.setDisplayHomeAsUpEnabled(true);
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
}