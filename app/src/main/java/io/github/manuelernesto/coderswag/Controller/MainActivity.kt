package io.github.manuelernesto.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.manuelernesto.coderswag.Adapter.CategoryAdapter
import io.github.manuelernesto.coderswag.R
import io.github.manuelernesto.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
