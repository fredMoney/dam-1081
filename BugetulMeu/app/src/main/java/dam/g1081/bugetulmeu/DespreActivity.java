package dam.g1081.bugetulmeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DespreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despre);
        Button butonok=findViewById(R.id.fabOk);
        butonok.setOnClickListener(view -> {finish();});
    }
}