package com.example.picinin_vaio.aula02_listabasica

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListaBasica : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_basica )
        val adapter = ArrayAdapter( this , android.R.layout.simple_list_item_1 ,
                contatos)
        var lista = findViewById(R.id.lstcontatos ) as ListView
        lista.adapter = adapter
        lista.setOnItemClickListener {parent, view, position, id ->
            Toast.makeText( this , "Clicked item : $ position " ,Toast.LENGTH_SHORT ).show()
        }
    }
    companion object {
        internal val contatos = arrayOf ( "Alline" , "Lucas" , "Rafael" , "Gabriela" ,
                "Silvana" )
    }
}