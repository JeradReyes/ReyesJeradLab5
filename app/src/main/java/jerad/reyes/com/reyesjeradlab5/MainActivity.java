package jerad.reyes.com.reyesjeradlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i =  new Intent(this, myCustomService.class);
        startService(i);
    }

    public void process1(View view) {
        Intent i = null, chooser = null;
        if (view.getId() == R.id.btnAct) {
            i = new Intent(this, Activity_2.class);
            startActivity(i);
        } else if (view.getId() == R.id.btnMap2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.518824, 121.019779"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}
