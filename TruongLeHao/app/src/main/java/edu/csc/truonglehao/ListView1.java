package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListView1 extends AppCompatActivity {
    Intent i;
    ListView ListViewData1;
    String []arrData = {"Nguyễn Trường Qúy", "Đặng Anh Kiệt", "Phạm Huỳnh Nhật Huy","Bùi Minh Thiên","Đỗ Gia Bảo", "Lê Thanh Huy", "Trần Minh Quang","Lê Phú Phúc","Huỳnh Đức Lộc","Nguyễn Văn Trung Trực","Lê Thị Bảo Trân","Huỳnh Hữu Lý","Phạm Hữu Đức ","Trần Đức Nhân","Huỳnh Tấn Đạt",
    "Lê Huế Anh", "Đinh Nguyễn Trường Hải","Chế Phương Nam","Nguyễn Chí Cường","Nguyên Trần Quang Tuyến","Nguyễn Thanh Minh Nhựt","Huỳnh Thành Đạt","Nguyễn Huỳnh Trung Tính",
    "Đặng Thụy Thanh Duy","Nguyễn Xuân Trường ","Trượng Lệ Hào","Nguyễn Thanh Tuyền","Đoàn Tường Vy","Lê Đức Lợi","Trần Hiếu Nghĩa"};
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView1");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();
        addtvents();
    }

    private void addtvents() {
        ListViewData1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView1.this, "Bạn vừa chọn " + arrData[position], Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addControls() {
        ListViewData1=findViewById(R.id.ListViewData1);
        adapter=new ArrayAdapter<String>(ListView1.this,android.R.layout.simple_list_item_1, arrData);
        ListViewData1.setAdapter(adapter);
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
                i = new Intent(ListView1.this, TTSV.class);
                startActivity(i);
                break;

            case R.id.menu2:
                i = new Intent(ListView1.this, MainActivity4.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            case R.id.menu3:
                i = new Intent(ListView1.this, MainActivity5.class);
                startActivity(i);
                //code xử lý khi bấm menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

}
