package dam.g1081.bugetulmeu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // se apeleaza automat la init meniului
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // deserializeaza fisierul .xml si creaza meniul
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_despre) {
            // Intent(componenta_invocatoare, clasa_de_tip_activitate)
            Intent intent = new Intent(this, DespreActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
