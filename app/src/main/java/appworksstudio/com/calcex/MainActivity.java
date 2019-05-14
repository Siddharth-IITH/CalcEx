package appworksstudio.com.calcex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring variables
    private Button add, sub, mult, divide;
    private TextView result_tv;
    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing variables
        add=findViewById(R.id.addition_button);
        sub=findViewById(R.id.substraction_button);
        mult=findViewById(R.id.multiply_button);
        divide=findViewById(R.id.divide_button);
        result_tv =findViewById(R.id.result_textview);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);


        //setting listeners to addition button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result =Double.parseDouble(num1.getText().toString()) +Double.parseDouble(num2.getText().toString());
                result_tv.setText(String.valueOf( result));

            }
        });

        //setting listeners to substraction button
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result =Double.parseDouble(num1.getText().toString()) -Double.parseDouble(num2.getText().toString());
                result_tv.setText(String.valueOf( result));

            }
        });

        //setting listeners to multiply button
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result =Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
                result_tv.setText(String.valueOf( result));

            }
        });

        //setting listeners to divide button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result =Double.parseDouble(num1.getText().toString())  / Double.parseDouble(num2.getText().toString());
                result_tv.setText(String.valueOf( result));

            }
        });


    }
}
