package unal.todosalau.consumoenergiabombillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView traditionalBulbText;
    private TextView ledBulbText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        traditionalBulbText = findViewById(R.id.traditionalBulbText);
        ledBulbText = findViewById(R.id.ledBulbText);

        // Carga una imagen de una bombilla LED desde los recursos
        imageView.setImageResource(R.drawable.led_bulb);

        // Calcula el consumo de energía de las bombillas tradicionales y las bombillas LED
        double traditionalBulbEnergy = 0;
        double ledBulbEnergy = 0;
        for (int i = 1; i <= 10; i++) {
            traditionalBulbEnergy += 0.06; // 60 vatios * 0.001 kW/vatio = 0.06 kW
            ledBulbEnergy += 0.01; // 10 vatios * 0.001 kW/vatio = 0.01 kW
        }

        // Muestra el consumo de energía de las bombillas tradicionales y las bombillas LED
        traditionalBulbText.setText(String.format("Bombilla tradicional: %.2f kWh", traditionalBulbEnergy));
        ledBulbText.setText(String.format("Bombilla LED: %.2f kWh", ledBulbEnergy));
    }

}