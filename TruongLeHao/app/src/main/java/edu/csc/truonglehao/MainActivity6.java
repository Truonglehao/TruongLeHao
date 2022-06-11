package edu.csc.truonglehao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import adapter.QuocGiaAdapter;
import model.Contact;
import model.Product;
import model.QuocGia;
import model.SaleManager;
import model.SaleQuocGia;

public class MainActivity6 extends AppCompatActivity {
    ListView lvQuocGia;
    Intent i;
    QuocGiaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Quốc Gia");
        actionBar.setDisplayHomeAsUpEnabled(true);
        addControls();


        SaleQuocGia saleQuocGia=SaleQuocGia.get();
        saleQuocGia.generateQuocGia();
        ArrayList quocgia=saleQuocGia.getQuocGia();
        adapter=new QuocGiaAdapter(MainActivity6.this,quocgia);
        lvQuocGia.setAdapter(adapter);
        lvQuocGia.setOnItemLongClickListener(new ItemLongClickRemove());


    }

    private void fakeDaTa() {
        adapter.add(new QuocGia(R.mipmap.vn, "Việt Nam", 98000000));
        adapter.add(new QuocGia(R.mipmap.usa, "Mỹ", 320000000));
        adapter.add(new QuocGia(R.mipmap.kor, "Hàn Quốc", 82000000));
        adapter.add(new QuocGia(R.mipmap.nga, "Liên Bang Nga", 142000000));
        adapter.add(new QuocGia(R.mipmap.jp, "Nhật Bản", 54000000));
        adapter.add(new QuocGia(R.mipmap.phap, "Pháp", 254000000));



    }

    private void addEvents() {
       lvQuocGia.setOnItemClickListener((adapterView, view, position, id) -> {

       });



    }



    private void addControls() {
        lvQuocGia = findViewById(R.id.QuocGia);
        //adapter = new QuocGiaAdapter(MainActivity6.this, R.layout.item_new);
     //  lvQuocGia.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menun_new, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;  case R.id.btnNew:
                //Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                //Them san pham
                openMyCustom();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }



    private class ItemLongClickRemove implements AdapterView.OnItemLongClickListener {
        @Override
        public boolean onItemLongClick(AdapterView parent, View view, final int position, long id) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity6.this);
            alertDialogBuilder.setMessage("Bạn có muốn xóa sản phẩm này!");
            alertDialogBuilder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // xóa sp đang nhấn giữ
                    SaleQuocGia.get().getQuocGia().remove(position);
                    //cập nhật lại listview
                    adapter.notifyDataSetChanged();

                }
            });
            alertDialogBuilder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //không làm gì
                }
            });
            alertDialogBuilder.show();
            return true;
        }
    }
    private void openMyCustom() {
//

    }




}




