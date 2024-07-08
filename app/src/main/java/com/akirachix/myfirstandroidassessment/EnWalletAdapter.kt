package com.akirachix.myfirstandroidassessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EnWalletAdapter(var walletList: List<Enwallet>): RecyclerView.Adapter<EnWalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnWalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_list_item, parent, false)
        return EnWalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EnWalletViewHolder, position: Int) {
        val wallet = walletList[position]
        holder.expense.text = wallet.expense
        holder.income.text = wallet.income
        holder.date.text = wallet.date
    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}

class EnWalletViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    var expense = itemView.findViewById<TextView>(R.id.tvExpense)
    var income = itemView.findViewById<TextView>(R.id.tvIncome)
    var date = itemView.findViewById<TextView>(R.id.tvDate)
}




