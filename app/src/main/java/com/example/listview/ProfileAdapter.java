package com.example.listview;


import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class ProfileAdapter extends BaseAdapter {
    private ArrayList<Profile> profiles;
    private Context context;

    public ProfileAdapter(Context context, ArrayList<Profile> profiles) {
        this.context = context;
        this.profiles = profiles;
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return profiles.size();

    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return null;
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.list_item_profile, parent, false);
        }

        Profile currentProfile = profiles.get(position);

        TextView textViewName = listItemView.findViewById(R.id.textViewName);
        TextView textViewAge = listItemView.findViewById(R.id.textViewAge);
        TextView textViewEmail = listItemView.findViewById(R.id.textViewEmail);
        TextView textViewPhoneNumber = listItemView.findViewById(R.id.textViewPhoneNumber);
        TextView textViewAddress = listItemView.findViewById(R.id.textViewAddress);

        int resourceId = context.getResources().getIdentifier(currentProfile.getImage(), "drawable", context.getPackageName());
        textViewName.setText(currentProfile.getName());
        textViewAge.setText( currentProfile.getAge());
        textViewEmail.setText( currentProfile.getEmail());
        textViewPhoneNumber.setText(currentProfile.getPhoneNumber());
        textViewAddress.setText(currentProfile.getAddress());

        return listItemView;
    }
}
