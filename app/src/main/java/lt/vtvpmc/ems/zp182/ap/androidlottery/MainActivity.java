package lt.vtvpmc.ems.zp182.ap.androidlottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView luckyNumbersListView;
    Button buttonGenerateLuckyNumbers;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        luckyNumbersListView = (ListView) findViewById(R.id.luckyNumbersListView);
        buttonGenerateLuckyNumbers = (Button) findViewById(R.id.buttonGenerateNumbers);

        buttonGenerateLuckyNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Integer> luckyNumbers = new ArrayList<>();

                for (int i = 0; i < 100; i++) {
                    luckyNumbers.add((int) (Math.random() * 100));
                }


                ArrayList<Integer> luckyNumbers2 = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    luckyNumbers2.add(luckyNumbers.get(i));
                }



                adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, luckyNumbers2);

                luckyNumbersListView.setAdapter(adapter);
            }
        });

    }
}
