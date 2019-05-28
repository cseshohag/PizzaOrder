package pizzaorder.com.pizzaorder;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int firstPizza;
    int secondPizza;
    int thirdPizza;
    int fourthPizza;
    int totalBill;
    int pizzaCounter;
    int first = 0,second = 0, third = 0, fourth = 0;
    int x,y,z,w;
    String abc = "Hello";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView topHeader = (TextView) findViewById(R.id.topHeader);
        topHeader.setPaintFlags(topHeader.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView fCounter = (ImageView) findViewById(R.id.imageView);

        final TextView textView6 = (TextView) findViewById(R.id.textView6);
        final TextView PizzaCounter = (TextView) findViewById(R.id.PizzaCounter);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        totalBill = 0;
        pizzaCounter = 0;
        //countPIzza.setText(countFizza);
        PizzaCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PizzaHistory.class);
                intent.putExtra("firstPizzaValue", first);
                intent.putExtra("secondPizzaValue", second);
                intent.putExtra("thirdPizzaValue", third);
                intent.putExtra("fourthPizzaValue", fourth);
                intent.putExtra("valueOfTotalPizzaBill", totalBill);
                startActivity(intent);
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PizzaHistory.class);
                intent.putExtra("firstPizzaValue", first);
                intent.putExtra("secondPizzaValue", second);
                intent.putExtra("thirdPizzaValue", third);
                intent.putExtra("fourthPizzaValue", fourth);
                intent.putExtra("valueOfTotalPizzaBill", totalBill);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizzaCounter++;
                first++;
                //countFizza = countFizza + x;
                firstPizza = 499;
                totalBill = totalBill + firstPizza;
                textView6.setText(totalBill + " TK");
                PizzaCounter.setText("" + pizzaCounter);

                //countFIzza.setText(countFizza);



            }
        });



        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizzaCounter++;
                second++;
                //countFizza = countFizza +  y;
                secondPizza = 850;
                totalBill = totalBill + secondPizza;
                textView6.setText(totalBill + " TK");

//                countFizza = countFizza + 1;
                PizzaCounter.setText("" + pizzaCounter);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizzaCounter++;
                third++;
                //countFizza = countFizza + z;
                thirdPizza = 1299;
                totalBill = totalBill + thirdPizza;
                textView6.setText(totalBill + " TK");
                //countFizza++;
//                countFizza = countFizza + 1;
                PizzaCounter.setText("" + pizzaCounter);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizzaCounter++;
                fourth++;
                //countFizza = countFizza + w;
                fourthPizza = 999;
                totalBill = totalBill + fourthPizza;
                textView6.setText(totalBill + " TK");
                //countFizza++;
//                countFizza = countFizza + 1;
                PizzaCounter.setText("" + pizzaCounter);
            }
        });

        //countFIzza.setText(countFizza);

    }
}
