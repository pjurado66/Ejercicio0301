package com.pjurado.ejercicio0301

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pjurado.ejercicio0301.databinding.ViewContactoBinding
import com.pjurado.ejercicio0301.model.Contacto

class ContactosAdapter(val contactos: List<Contacto>) :
    RecyclerView.Adapter<ContactosAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = ViewContactoBinding.bind(view)

        fun bind(contacto: Contacto){
            with(binding){
                nombre.text = contacto.nombre
                email.text = contacto.email
                telefono.text = contacto.telefono
                Glide.with(root.context)
                    .load(contacto.urlImagen)
                    .into(imagen)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_contacto, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = contactos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(contactos[position])
    }


}
