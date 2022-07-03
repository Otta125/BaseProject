package com.otherlogic.baseproject.Adapters

import Table
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.otherlogic.baseproject.R



class TablesAdapter(
    private val mCtx: Context,
    private val tables: List<Table>,
    private val Lang: String
) : RecyclerView.Adapter<TablesAdapter.TablesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TablesViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.table_row, parent, false)

        return TablesViewHolder(view)
    }

    override fun onBindViewHolder(holder: TablesViewHolder, position: Int) {
        val orderHistoryItem = tables[position]
        holder.tableNameTxt?.text = orderHistoryItem.table_name
        holder.ordersNumTxt?.text = orderHistoryItem.orders_items
        holder.card?.setOnClickListener {

      /*      val intent = Intent(mCtx, OrderDetailsActivity::class.java)
            intent.putExtra(ORDERS_INTENT, orderHistoryItem)
            mCtx.startActivity(intent)*/
        }

    }

    override fun getItemCount(): Int {
        var size = 0
        size = tables.size
        return size
    }

    class TablesViewHolder(itemview: View?) : RecyclerView.ViewHolder(itemview!!) {

        var card: CardView? = itemView.findViewById(R.id.table_card_id)
        val tableNameTxt: TextView? = itemView.findViewById(R.id.table_name_id)
        val ordersNumTxt: TextView? = itemView.findViewById(R.id.table_order_no_id)


    }
}