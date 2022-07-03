package com.otherlogic.baseproject.Features.Table

import Table
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.otherlogic.baseproject.Adapters.TablesAdapter
import com.otherlogic.baseproject.R
import com.otherlogic.baseproject.databinding.ActivityTablesBinding

class TablesActivity : AppCompatActivity() {
    var tablesAdapter: TablesAdapter? = null
    private lateinit var tableBinding: ActivityTablesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tables)
        tableBinding = ActivityTablesBinding.inflate(layoutInflater)
        setContentView(tableBinding.root)

        var tables = listOf(
            Table(1, "Table 1", "3 Orders", ""),
            Table(1, "Table 2", "5 Orders", ""),
            Table(1, "Table 3", "2 Orders", ""),
            Table(1, "Table 4", "9 Orders", ""),
            Table(1, "Table 5", "0 Orders", "")
        )
        tablesAdapter = TablesAdapter(this, tables, "")
        tableBinding.tablesRecyclerViewId.layoutManager = GridLayoutManager(this,2)
        tableBinding.tablesRecyclerViewId.adapter =tablesAdapter
    }
}