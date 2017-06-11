package apps.busra.com.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView) findViewById(R.id.lv1);
        final ArrayList <String> ulkeler = new ArrayList<>();

        ulkeler.add("Hürriyet");
        ulkeler.add("Milliyet");
        ulkeler.add("Sabah");
        ulkeler.add("Sözcü");
        ulkeler.add("HaberTürk");

        ArrayList <String> gazeteUrl = new ArrayList<>();
        gazeteUrl.add("http://www.hurriyet.com.tr/");
        gazeteUrl.add("http://www.gazeteoku.org/ulusal-gazeteler/milliyet-gazetesi");
        gazeteUrl.add("http://www.sabah.com.tr/");
        gazeteUrl.add("http://www.sozcu.com.tr/");
        gazeteUrl.add("http://www.haberturk.com/");

        ArrayAdapter <String> veriAdaptoru = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1,ulkeler);

        lv1.setAdapter(veriAdaptoru);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = String.valueOf(lv1.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,"selected:"+item, Toast.LENGTH_SHORT).show();

                Bundle bundle = new Bundle();
                bundle.putString("url",ulkeler.get(i));

                Intent ıntent = new Intent (getApplicationContext(),WebViewPage.class);
                ıntent.putExtras(bundle);
                startActivity(ıntent);

            }
        });
        }





    }

