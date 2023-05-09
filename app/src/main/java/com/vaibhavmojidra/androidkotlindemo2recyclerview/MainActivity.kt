package com.vaibhavmojidra.androidkotlindemo2recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var phoneList = listOf(
        Phone("iPhone 13", "Apple", 6, 128),
        Phone("Samsung Galaxy S21 Ultra 5G", "Samsung", 12, 128),
        Phone("Google Pixel 6", "Google", 8, 128),
        Phone("OnePlus 9 Pro", "OnePlus", 12, 256),
        Phone("Xiaomi Mi 11", "Xiaomi", 8, 128),
        Phone("Oppo Find X3 Pro", "Oppo", 12, 256),
        Phone("Sony Xperia 1 III", "Sony", 12, 256),
        Phone("LG Wing 5G", "LG", 8, 128),
        Phone("Motorola Moto G Power (2021)", "Motorola", 4, 64),
        Phone("Nokia X20", "Nokia", 6, 128),
        Phone("ASUS ROG Phone 5", "ASUS", 16, 256),
        Phone("Blackberry Key2 LE", "Blackberry", 4, 64)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=PhoneRecyclerViewAdapter(phoneList,{phone:Phone->onPhoneItemClick(phone)})
    }

     private fun onPhoneItemClick(phone:Phone) {
         Toast.makeText(this,"Name: ${phone.name}\nCompany: ${phone.company}",Toast.LENGTH_LONG).show()
     }
}