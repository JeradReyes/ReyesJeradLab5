package jerad.reyes.com.reyesjeradlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i =  new Intent(this, myCustomService.class);
        startService(i);
    }


    public void process(View view) {
        Intent i = null, chooser = null;
        if (view.getId() == R.id.btnActivity1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

       } else if (view.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.610306, 120.991873"));
            chooser = Intent.createChooser(i,"Choose a Map App");
            startActivity(chooser);
        }
    }
}