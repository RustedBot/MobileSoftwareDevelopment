package ie.theglassboard.mobiledevelopmentsample;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ie.theglassboard.mobiledevelopmentsample.list.ContactListActivity;

public class MainActivity extends ListActivity {

    private String[] sections = {"List"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the sections view
        //ListView sectionsList = (ListView) findViewById(R.id.sections_list);

        // Pass the sections array to the list with the built in list item layout
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sections));
    }

    // Launch the correct activity based on which item is clicked
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (sections[position]) {
            case "List":
                startActivity(new Intent(MainActivity.this, ContactListActivity.class));
                break;
            default:
                break;
        }
    }
}
