package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression
/*Aaron Benavides Vega, UNA */
var calc : TextView?= null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calc = findViewById(R.id.dis)
        val expression = Expression("2+2")
        println("**************"+expression.calculate())
    }

    fun mostrarPantalla(texto: View){
        val button = texto as Button
        val textoButton = button.text.toString()
        if(calc?.text.toString() == "0" || calc?.text.toString() == "0.0"){
            calc?.text = ""
        }else{
            calc?.text = calc?.text.toString()
        }
        var concatenate = calc?.text.toString() + textoButton
        calc?.text =  concatenate


    }
    fun reinicio(texto: View){
        calc?.text = "0"
    }



    fun metodoResultado(texto: View){
        var resultado = Expression(calc?.text.toString())
        calc?.text = resultado.calculate().toString()
    }

    fun metodoPorcentaje(texto: View){
        var resultado = Expression(calc?.text.toString() + " / 100")
        calc?.text = resultado.calculate().toString()
    }

}