package KaylowProduction.praypal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Prayer extends AppCompatActivity {

    String items[] = new String [] {"STRENGTH", "HEALING", "BLESSINGS","PROTECTION","THANKSGIVING","FORGIVENESS","PROTECTION","PEACE PRAYER","LOVE PRAYER","FEAR AND ANXIETY","GUIDANCE AND WISDOM","MORNING PRAYERS","EVENING PRAYERS","BEFORE MEALS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        ListView listView = (ListView) findViewById(R.id.listprayers);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String str= listView.getAdapter().getItem(position).toString();
                Intent intent = new Intent(getApplicationContext(),Prayer2.class);
                intent.putExtra("name",str);
                startActivity(intent);
            }
        });
    }
}