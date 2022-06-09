package adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import edu.csc.truonglehao.R;
import model.TraiCay;

public class TraiCayAdapter extends ArrayAdapter<TraiCay> {
    Activity context;
    int resource;
    public TraiCayAdapter(Activity context, int resource) {
        super(context,resource);
        this.context=context;
        this.resource=resource;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View customView=inflater.inflate(this.resource,null);
        ImageView imgHinh= customView.findViewById(R.id.imgHinh);
        TextView txtTen= customView.findViewById(R.id.txtTen);
        TextView txtGia= customView.findViewById(R.id.txtGia);

        TraiCay tc=getItem(position);
        imgHinh.setImageResource(tc.getHinh());
        txtTen.setText(tc.getTen());
        txtGia.setText(tc.getGia()+" VNĐ");

        return customView;
    }

}
