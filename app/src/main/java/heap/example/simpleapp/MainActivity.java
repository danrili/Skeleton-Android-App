package heap.example.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.heapanalytics.android.Heap;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Heap.init(getApplicationContext(), "3320806168");
    setContentView(R.layout.activity_main);
  }

  public void onButtonClick(View v) {
    Toast toast = Toast.makeText(getApplicationContext(), "clicked!", Toast.LENGTH_SHORT);
    toast.show();
  }
}
