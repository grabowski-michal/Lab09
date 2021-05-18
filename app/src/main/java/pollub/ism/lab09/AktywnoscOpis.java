package pollub.ism.lab09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AktywnoscOpis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc_opis);

        TextView nazwa = (TextView) findViewById(R.id.nazwa);
        TextView opis = (TextView) findViewById(R.id.opis);
        ImageView obraz = (ImageView) findViewById(R.id.obraz);

        Intent intent = getIntent();

        if (intent != null) {
            nazwa.setText(intent.getStringExtra("nazwa"));
            opis.setText(intent.getStringExtra("opis"));

            //Wyjęcie bitmapy z intencji
            byte[] bity = intent.getByteArrayExtra("obraz");
            Bitmap bitmapa = BitmapFactory.decodeByteArray(bity, 0, bity.length);
            obraz.setImageBitmap(bitmapa);
        }
    }
}