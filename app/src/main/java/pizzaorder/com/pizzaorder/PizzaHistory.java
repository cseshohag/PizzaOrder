package pizzaorder.com.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PizzaHistory extends AppCompatActivity {

    int firstPizzaValue;
    int secondPizzaValue;
    int thirdPizzaValue;
    int fourthPizzaValue;
    int a;

    TextView vauleOfFirstPizza;
    TextView vauleOfSecondPizza;
    TextView vauleOfThirdPizza;
    TextView vauleOfFourthPizza;
    TextView valueOfTotalPizzaBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_history);
        //firstFizzaValue = getIntent().getStringExtra("firstFizzaValue");
        vauleOfFirstPizza = (TextView) findViewById(R.id.valueOfFirstPizza);
        firstPizzaValue= getIntent().getIntExtra("firstPizzaValue",firstPizzaValue);
        vauleOfFirstPizza.setText(""+ firstPizzaValue+"("+firstPizzaValue*499+")");

        vauleOfSecondPizza = (TextView) findViewById(R.id.valueOfSecondPizza);
        secondPizzaValue = getIntent().getIntExtra("secondPizzaValue",secondPizzaValue);
        vauleOfSecondPizza.setText(""+ secondPizzaValue+"("+secondPizzaValue*850+")");

        vauleOfThirdPizza = (TextView) findViewById(R.id.valueOfThirdPizza);
        thirdPizzaValue = getIntent().getIntExtra("thirdPizzaValue",thirdPizzaValue);
        vauleOfThirdPizza.setText(""+ thirdPizzaValue+"("+thirdPizzaValue*1299+")");

        vauleOfFourthPizza = (TextView) findViewById(R.id.valueOfFourthPizza);
        fourthPizzaValue = getIntent().getIntExtra("fourthPizzaValue",fourthPizzaValue);
        vauleOfFourthPizza.setText(""+ fourthPizzaValue+"("+fourthPizzaValue*999+")");

        valueOfTotalPizzaBill = (TextView) findViewById(R.id.valueOfTotalPizzaBill);
        valueOfTotalPizzaBill.setText(""+ getIntent().getIntExtra("valueOfTotalPizzaBill",thirdPizzaValue));

    }
}
