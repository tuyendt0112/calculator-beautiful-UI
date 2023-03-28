package hcmute.edu.vn.tuyendt.calculatorvol20;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9; // digit number button
    Button btnAdd,btnMinus,btnMul,btnDiv,btnDot,btnEqual,btnAC,btnC; // C: delete 1 digit // AC : clear screen
    float num1 , num2 ;

    boolean checkAdd , checkMinus ,checkMul ,checkDiv ;
    TextView mainScreen,secondScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getBtn();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"1");
                mainScreen.setText(mainScreen.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"2");
                mainScreen.setText(mainScreen.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"3");
                mainScreen.setText(mainScreen.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"4");
                mainScreen.setText(mainScreen.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"5");
                mainScreen.setText(mainScreen.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"6");
                mainScreen.setText(mainScreen.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"7");
                mainScreen.setText(mainScreen.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"8");
                mainScreen.setText(mainScreen.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"9");
                mainScreen.setText(mainScreen.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+"0");
                mainScreen.setText(mainScreen.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText(secondScreen.getText()+".");
                mainScreen.setText(mainScreen.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondScreen == null){
                    secondScreen.setText("");
                }else {
                    mainScreen.setText(mainScreen.getText()+"+");
                    num1 = Float.parseFloat(secondScreen.getText() + "");
                    checkAdd = true;
                    secondScreen.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainScreen.setText(mainScreen.getText()+"/");
                num1 = Float.parseFloat(secondScreen.getText()+"");
                checkDiv = true ;
                secondScreen.setText(null);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainScreen.setText(mainScreen.getText()+"-");
                num1 = Float.parseFloat(secondScreen.getText() + "");
                checkMinus = true ;
                secondScreen.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainScreen.setText(mainScreen.getText()+"*");
                num1 = Float.parseFloat(secondScreen.getText() + "");
                checkMul = true ;
                secondScreen.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(secondScreen.getText() + "");

                if (checkAdd == true){

                    secondScreen.setText(num1 + num2 +"");
                    checkAdd=false;
                }

                if (checkMinus == true){
                    secondScreen.setText(num1 - num2+"");
                    checkMinus=false;
                }

                if (checkMul == true){
                    secondScreen.setText(num1 * num2+"");
                    checkMul=false;
                }

                if (checkDiv == true){
                    secondScreen.setText(num1 / num2+"");
                    checkDiv=false;
                }
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText("");
                mainScreen.setText("");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = secondScreen.getText().toString();
                secondScreen.setText(text.substring(0, text.length() - 1));
                mainScreen.setText(text.substring(0, text.length() - 1));
            }
        });








}

    protected  void getBtn(){
        // number
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        // operator
        btnAdd = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMul = findViewById(R.id.btn_mul    );
        btnDiv = findViewById(R.id.btn_div);
        btnAC = findViewById(R.id.btn_ac);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equal);
        btnC =findViewById(R.id.btn_del);
        // outputscreen
        mainScreen = (TextView) findViewById(R.id.tv_input);
        secondScreen = findViewById(R.id.tv_output);
    }



}