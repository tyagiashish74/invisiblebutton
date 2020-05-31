package com.example.invisiblebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ainvisiblebtn,avisiblebutton;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    ainvisiblebtn = findViewById(R.id.btninvisible);
    avisiblebutton = findViewById(R.id.btnvisible);

    // First Method To show a button visibility
    /*ainvisiblebtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ainvisiblebtn.setVisibility(View.INVISIBLE);
        }
    });

    // it shows the second button "to do to do to do"

    avisiblebutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"to Do to Do to Do to Do",Toast.LENGTH_SHORT).show();
        }
    });*/
    }
    // Second Method to do same as above function.

    public void toDo (View v){
        if (v.equals(ainvisiblebtn))
            //invisibility
          v.setVisibility(View.INVISIBLE);

        if (v.equals(avisiblebutton)){
            //visible and todo list
         Toast.makeText(getApplicationContext() , "toDo toDo toDo toDo " ,Toast.LENGTH_SHORT).show();

    }
}
}

