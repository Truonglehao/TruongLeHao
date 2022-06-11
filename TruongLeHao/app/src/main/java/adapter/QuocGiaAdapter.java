package adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;
import java.util.ArrayList;

import edu.csc.truonglehao.R;
import model.Product;
import model.QuocGia;
import model.TraiCay;

public class QuocGiaAdapter extends ArrayAdapter{
    Activity activity;

    public QuocGiaAdapter(Activity activity, ArrayList quocgia) {
        super(activity,0,quocgia);
        this.activity=activity;

    }
    @NonNull
    @Override
    public View getView(int position, View customView, ViewGroup parent) {
        if (customView==null)
        {
            LayoutInflater inflater= activity.getLayoutInflater();
            customView=inflater.inflate(R.layout.item_new,null);
        }
        ImageView imgHinh= customView.findViewById(R.id.txtImg);
        TextView txtTen= customView.findViewById(R.id.txtName);
        TextView txtGia= customView.findViewById(R.id.txtDan);

        QuocGia tc= (QuocGia) getItem(position);
        imgHinh.setImageResource(tc.getImg());
        txtTen.setText(tc.getName());
        txtGia.setText(tc.getDan()+" Population");

        return customView;
    }

}




