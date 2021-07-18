package jasp.prog.imc
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imc()
        Toast.makeText(this, "Introduce los valores o petará", Toast.LENGTH_SHORT).show()


    }

   public fun imc() {

      var peso = findViewById<EditText>(R.id.peso)

       var altura = findViewById<EditText>(R.id.altura)

       var boton = findViewById<Button>(R.id.boton)



            boton.setOnClickListener(){
                var a: Double = (altura.text.toString()).toDouble()
                var b: Double = (peso.text.toString()).toDouble()

                    var sum = (b/((a/100)*(a/100)))
                    //var sum2 = String.format("%.2f", sum); // molaria que fuese kotlin
                    var sum2 = "%.2f".format(sum)

                    var resultado= findViewById<TextView>(R.id.resultado)
                    resultado.setText(sum2.toString())





        }

    }


}

// Falta corregir las excepciones

