package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ListViewMainActivity extends AppCompatActivity {
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView");
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
                i = new Intent(ListViewMainActivity.this, TTSV.class);
                startActivity(i);
                break;

            case R.id.menu2:
                i = new Intent(ListViewMainActivity.this, MainActivity4.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            case R.id.menu3:
                i = new Intent(ListViewMainActivity.this, MainActivity5.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ListView1(View view) {
        i = new Intent(ListViewMainActivity.this, ListView1.class);
        startActivity(i);

    }


    public void ListView2(View view) {
        i = new Intent(ListViewMainActivity.this, ListView2.class);
        startActivity(i);
    }

    public void ListView3(View view) {
        i = new Intent(ListViewMainActivity.this, ListView3.class);
        startActivity(i);
    }

}