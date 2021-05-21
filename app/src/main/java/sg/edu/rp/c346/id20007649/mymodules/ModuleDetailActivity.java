package sg.edu.rp.c346.id20007649.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay1;
    TextView tvDisplay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);



        tvDisplay1 = findViewById(R.id.tvAndroid);
        tvDisplay2 = findViewById(R.id.tviPad);


        Intent intentReceived = getIntent();

        String code = intentReceived.getStringExtra("Android Programming ");

        if ( code != null){
            tvDisplay1.setText("Module Code : C346 ");
            tvDisplay1.setText("Module Name : " + code);
            tvDisplay1.setText("Academic Year : 2020 ");
            tvDisplay1.setText("Semester : 1 ");
            tvDisplay1.setText("Module Credit : 4");
            tvDisplay1.setText("Venue : W66M ");

        }

        else{

            code = intentReceived.getStringExtra("iPad Programming");
            tvDisplay1.setText("Module Code : C349 ");
            tvDisplay1.setText("Module Name : " + code);
            tvDisplay1.setText("Academic Year : 2020 ");
            tvDisplay1.setText("Semester : 1 ");
            tvDisplay1.setText("Module Credit : 4");
            tvDisplay1.setText("Venue : W66L ");

        }
    }
}