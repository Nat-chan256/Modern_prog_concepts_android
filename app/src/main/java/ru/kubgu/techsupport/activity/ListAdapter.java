package ru.kubgu.techsupport.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import ru.kubgu.techsupport.R;

public class ListAdapter extends ArrayAdapter<String> {
    public ListAdapter(Context ctx, ArrayList<String> requestsList) {
        super(ctx, R.layout.list_item, R.id.requestField, requestsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        return super.getView(position, convertView, parent);
    }
}
