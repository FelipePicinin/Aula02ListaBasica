import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.picinin_vaio.aula02_listabasica.R

class DetalheContato : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_contato )
        val intent = intent
        if (intent != null ) {
            val contato = intent.getSerializableExtra( "contato" ) as Contato
            val nomecontato = findViewById<TextView>(R.id.nomecontato )
            nomecontato. text = contato. nome
        }
    }
}