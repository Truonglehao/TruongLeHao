package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import adapter.TraiCayAdapter;
import model.TraiCay;

public class ListView4 extends AppCompatActivity {
    Intent i;
    ListView lvTraiCay;
    TraiCayAdapter traiCayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view4);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView Nâng Cao");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();
        addEvents();
        fakeDaTa();

    }

    private void fakeDaTa() {
        traiCayAdapter.add(new TraiCay(R.drawable.apple,"Apple",60000));
        traiCayAdapter.add(new TraiCay(R.drawable.apricot,"Apricot",50000));
        traiCayAdapter.add(new TraiCay(R.drawable.banana,"Banana",45000));
        traiCayAdapter.add(new TraiCay(R.drawable.cherry,"Cherry",100000));
        traiCayAdapter.add(new TraiCay(R.drawable.kiwi,"Kiwi",90000));
        traiCayAdapter.add(new TraiCay(R.drawable.lemon,"Lemon",25000));
        traiCayAdapter.add(new TraiCay(R.drawable.mango,"Mango",85000));
        traiCayAdapter.add(new TraiCay(R.drawable.orange,"Orange",40000));
        traiCayAdapter.add(new TraiCay(R.drawable.peach,"Peach",55000));
        traiCayAdapter.add(new TraiCay(R.drawable.pear,"Pear",51000));
        traiCayAdapter.add(new TraiCay(R.drawable.strawberry,"Strawberry",840000));
        traiCayAdapter.add(new TraiCay(R.drawable.tomato,"Tomato",10000));

    }

    private void addEvents() {
        lvTraiCay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TraiCay tc=traiCayAdapter.getItem(position);
                Toast.makeText(ListView4.this, "Bạn Chọn "+tc.getTen(), Toast.LENGTH_LONG).show();
            }
        });
    }


    private void addControls() {
        lvTraiCay=findViewById(R.id.lvNangCao);
        traiCayAdapter=new TraiCayAdapter(ListView4.this,R.layout.item);
        lvTraiCay.setAdapter(traiCayAdapter);
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
                i = new Intent(ListView4.this, TTSV.class);
                startActivity(i);
                break;

            case R.id.menu2:
                i = new Intent(ListView4.this, MainActivity4.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            case R.id.menu3:
                i = new Intent(ListView4.this, MainActivity5.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}