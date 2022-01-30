package KaylowProduction.praypal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bible extends AppCompatActivity {
    String items[] = new String [] {"ENGLISH BIBLE", "SPANISH BIBLE", "PORTUGUESE BIBLE","GERMAN BIBLE","FRENCH BIBLE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);
        
        ListView listView = (ListView) findViewById(R.id.listbible);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String str= listView.getAdapter().getItem(position).toString();
                Intent intent = new Intent(getApplicationContext(),Bible2.class);
                intent.putExtra("key-position",position);
                intent.putExtra("bible",str);
                startActivity(intent);
            }
        });
    }
}