package KaylowProduction.praypal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class Bible2 extends AppCompatActivity {
    TextView t1;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible2);

        t1 = findViewById(R.id.textviewbible);
        t1.setText(getIntent().getExtras().getString("bible"));

        pdfView = findViewById(R.id.pdfView);

        int bible_position=getIntent().getIntExtra("key-position",0);

        if (bible_position==0){
            pdfView.fromAsset("English_bible.pdf").load();
        }
        else if (bible_position==1){
            pdfView.fromAsset("Spanish_bible.pdf").load();
        }
        else if (bible_position==2){
            pdfView.fromAsset("Port_bible.pdf").load();
        }
        else if (bible_position==3){
            pdfView.fromAsset("German_bible.pdf").load();
        }
        else if (bible_position==4){
            pdfView.fromAsset("French_bible.pdf").load();
        }
    }
}