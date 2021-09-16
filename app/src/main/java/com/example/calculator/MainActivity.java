package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inchesEditText;
    private Button calculateButton;
    private TextView metersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inchesText = inchesEditText.getText().toString();
                if (inchesText.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please input a value.", Toast.LENGTH_LONG);
                } else {
                    displayResult(convertToMeters(inchesText));
                }
            }
        });
    }

    //stores the views as fields
    public void findViews(){
        inchesEditText = findViewById(R.id.edit_text_inches);
        calculateButton = findViewById(R.id.button_calculate);
        metersTextView = findViewById(R.id.text_view_meters);
    }


    public double convertToMeters(String inchesText){
        int inches = Integer.getInteger(inchesText);
        return 0.0254 * inches;
    }

    public void displayResult(double meters){
        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String metersResult = myDecimalFormatter.format(meters);

        metersTextView.setText(metersResult);
    }
}