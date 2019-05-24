package khoapham.ptp.phamtanphat.builtin_function;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Math
//        double number1 = Math.random() * 3 + 1; //0 ~ 3
        //Math.floor : ham lam tron xuong
        //Math.ceil : ham lam tron len
//        double number1format = Math.floor(number1);
//        Log.d("BBB","So random " + number1);
//        Log.d("BBB", "So duoc format " + number1format );
        //Tim so lon hon

        int[] numbers = {1,2,3,4,11,6,7,8,9,10};
        int solonnhat = 0;

        for (int index = 0 ; index < numbers.length ; index++){
            solonnhat = Math.max(solonnhat, numbers[index]);
            Log.d("BB",solonnhat + "");
        }
//        int ketuqa = Math.max(a ,b);
//        Log.d("BBB",ketuqa + "");
    }
}
