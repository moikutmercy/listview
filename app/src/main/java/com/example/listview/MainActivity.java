package com.example.listview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ListView reference
        ListView listViewProfiles = findViewById(R.id.listViewProfiles);

        // Create an ArrayList to hold multiple profiles
        ArrayList<Profile> profiles = new ArrayList<>();

        // Add six profile instances (replace with your data and images)
        profiles.add(new Profile("cartoon", "John Doe", "30", "johndoe@example.com", "+1234567890", "123 Main St, City, Country"));
        profiles.add(new Profile("cat", "Jane Smith", "25", "janesmith@example.com", "+9876543210", "456 Park Ave, Town, Country"));
        profiles.add(new Profile("happy", "Michael Johnson", "35", "michaeljohnson@example.com", "+9876543210", "789 Beach Rd, Village, Country"));
        profiles.add(new Profile("sad", "Emily Williams", "28", "emilywilliams@example.com", "+1234567890", "456 Main St, City, Country"));
        profiles.add(new Profile("love", "Daniel Brown", "32", "danielbrown@example.com", "+9876543210", "789 Park Ave, Town, Country"));
        profiles.add(new Profile("ann", "Sophia Davis", "29", "sophiadavis@example.com", "+9876543210", "123 Beach Rd, Village, Country"));

        // Create an adapter to bind the data to the ListView
        ProfileAdapter adapter = new ProfileAdapter(this, profiles);

        // Set the adapter to the ListView
        listViewProfiles.setAdapter(adapter);
    }
}
