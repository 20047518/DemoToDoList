package sg.edu.rp.c346.id20047518.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layout_id;
    ArrayList<ToDoItem> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super( context, resource, objects );
        this.context = context;
        this.layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate( layout_id, parent, false );
        TextView tvTitle = rowView.findViewById( R.id.tvTitle );
        TextView tvDate = rowView.findViewById( R.id.tvDate );

        ToDoItem currentVersion = versionList.get(position);
        tvTitle.setText( currentVersion.getTitle() );
        tvDate.setText( currentVersion.toString() );

        return  rowView;
    }
}
