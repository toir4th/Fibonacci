package com.erkki.fibonacci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.get_number);
        final EditText inputField = (EditText) findViewById(R.id.numberField);


        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView error = (TextView) findViewById(R.id.error_message);
                        TextView teksti = (TextView) findViewById(R.id.number);

                        int textInt = Integer.parseInt(inputField.getText().toString());

                        if (textInt < 40) {
                            FibonacciNumber fibonacciNumber = new FibonacciNumber(Integer.parseInt(inputField.getText().toString()));
                            teksti.setText("Result:  " + fibonacciNumber.getNumber());
                            error.setText(R.string.empty);
                        } else {
                            error.setText(R.string.error_message);
                        }


                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        Intent i = new Intent(this, InfoScreen.class);
        startActivity(i);
    }
}
