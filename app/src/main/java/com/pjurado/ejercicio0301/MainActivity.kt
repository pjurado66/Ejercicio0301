package com.pjurado.ejercicio0301

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pjurado.ejercicio0301.databinding.ActivityMainBinding
import com.pjurado.ejercicio0301.model.Contacto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.adapter = ContactosAdapter(contactos)
        }




    }

    private val contactos = (1..100).map{
        Contacto(
            "Nombre $it",
            "email$it@gmail.com",
            "954$it$it$it$it$it$it",
            "https://blog.logrocket.com/wp-content/uploads/2021/12/glide-tutorial-create-android-photo-app.png"
            //"https://loremflickr.com/g/320/240?lock=$it"
        )
    }
}