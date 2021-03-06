package edu.csc.truonglehao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView so1, so2, so3, so4, so5;
    Intent i;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        so3 = findViewById(R.id.so3);
        so4 = findViewById(R.id.so4);
        so5 = findViewById(R.id.so5);

        so1.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);

        });
        so2.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(i);

        });so3.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, ListViewMainActivity.class);
            startActivity(i);

        });
        so4.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(i);

        });
        so5.setOnClickListener(v -> {
            i = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(i);
        });
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
                i = new Intent(MainActivity.this, TTSV.class);
                startActivity(i);
                break;

            case R.id.menu2:
                i = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(i);
                //code x??? l?? khi b???m menu3
                break;
            case R.id.menu3:
                i = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(i);
                //code x??? l?? khi b???m menu3
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    public void xuLyThoat(View view) {
        //T???o ?????i t?????ng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
//Thi???t l???p ti??u ?????
        b.setTitle("X??c nh???n");
        b.setMessage("B???n c?? ?????ng ?? tho??t ch????ng tr??nh kh??ng?");
// N??t Ok
        b.setPositiveButton("?????ng ??", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
//N??t Cancel
        b.setNegativeButton("Kh??ng ?????ng ??", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
//T???o dialog
        AlertDialog al = b.create();
//Hi???n th???
        al.show();
    }
}
