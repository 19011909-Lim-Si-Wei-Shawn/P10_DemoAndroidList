package sg.edu.rp.c346.id19011909.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    //Creating Variable,
    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    //Creating Class,
    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> objects)
    {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Getting LayoutInflater Object,
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Inflating View for Each Row,
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtaining UI Components with Binding,
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

        //Obtaining Android Version Information using Position,
        AndroidVersion currentVersion = versionList.get(position);

        //Setting Value to TextView with Information,
        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getVersion());

        return rowView;
    }

}
