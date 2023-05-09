package com.vaibhavmojidra.androidkotlindemo2recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PhoneRecyclerViewAdapter(private val phoneList:List<Phone>,private val clickListener:(phone:Phone)->Unit):RecyclerView.Adapter<PhoneRecyclerViewAdapter.PhoneRecyclerViewHolder>() {

    class PhoneRecyclerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        private var name:TextView=itemView.findViewById(R.id.phone_name)
        fun bind(phone:Phone,onClickListener:(phone:Phone)->Unit){
            name.text=phone.name
            itemView.setOnClickListener {
                onClickListener(phone)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneRecyclerViewHolder
    = PhoneRecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.phone_list_item,parent,false))


    override fun getItemCount(): Int = phoneList.size


    override fun onBindViewHolder(holder: PhoneRecyclerViewHolder, position: Int)=holder.bind(phoneList[position],clickListener)

}