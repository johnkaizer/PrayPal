package KaylowProduction.praypal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Prayer2 extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer2);

        t1 = findViewById(R.id.textview);
        t1.setText(getIntent().getExtras().getString("name"));
    }
}