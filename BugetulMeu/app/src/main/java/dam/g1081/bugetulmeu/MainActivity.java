package dam.g1081.bugetulmeu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabAdauga = findViewById(R.id.fab_adauga);

        fabAdauga.setOnClickListener(view -> {
            //de scris secventa de invocare a activitatii adauga


                Intent intent1 = new Intent(this,AdaugaActivity.class);
                startActivity(intent1);

        });
        //FloatingActionButton fabInchide=findViewById(R.id.fabOk);
        //fabInchide.setOnClickListener(view->finish());
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       if(item.getItemId()==R.id.action_despre){
           Intent intent = new Intent(this,DespreActivity.class);
           startActivity(intent);

           return true;
       }
        //tema de invocat si activitatea adauga
        if(item.getItemId()==R.id.action_adauga){
            Intent intent1 = new Intent(this,AdaugaActivity.class);
            startActivity(intent1);

            return true;
        }
        if(item.getItemId()==R.id.action_tranzactie){
            Intent intent2 = new Intent(this, TranzactieActivity.class);
            startActivity(intent2);

            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
//clasa tranzactie
//edit text inputtype numbeer decimal double suma
//date picker date/local date data date
//date picker dialog
//
//descriere edit text string
//tip spinner enum venit cheltuieli
//valuta radiogroup euro/ron enum

//de proiectat interfata