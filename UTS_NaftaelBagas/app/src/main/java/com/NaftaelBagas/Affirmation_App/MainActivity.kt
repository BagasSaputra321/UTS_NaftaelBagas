package com.NaftaelBagas.Affirmation_App

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.NaftaelBagas.Affirmation_App.Adapter.ItemAdapter
import com.NaftaelBagas.affirmation_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Data=com.NaftaelBagas.Affirmation_App.Data.DataSource().loadAfirmasi()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, Data)
        recyclerView.setHasFixedSize(true)
    }
}