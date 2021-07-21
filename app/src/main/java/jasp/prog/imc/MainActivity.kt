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

        val boton = findViewById<Button>(R.id.boton)


        boton.setOnClickListener() {

            val alt = findViewById<EditText>(R.id.altura)
            val pes = findViewById<EditText>(R.id.peso)

            if (alt.text.isEmpty() || pes.text.isEmpty()) {
                Tutoast()

            }
            else {
                val altura = alt.text.toString().toDouble()
                val peso = pes.text.toString().toDouble()

                val sum = (peso / ((altura / 100) * (altura / 100)))
                val sum2 = "%.2f".format(sum)
                val resultado = findViewById<TextView>(R.id.resultado)
                resultado.setText(sum2)
            }

            }

        }

    fun Tutoast() {

        Toast.makeText(this, "Los campos no pueden estar vacios", Toast.LENGTH_LONG).show()

    }

    }