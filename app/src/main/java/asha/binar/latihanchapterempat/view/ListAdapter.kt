package asha.binar.latihanchapterempat.view

import android.app.SearchManager
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import asha.binar.latihanchapterempat.R

class ListAdapter(private val list: ArrayList<String>): RecyclerView.Adapter<ListAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder:ListViewHolder, position: Int) {
        val data = list[position]

        with(holder){
            button.text = data
            button.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                val url = "https://google.com/search?q=${data}"
                intent.putExtra(SearchManager.QUERY, url)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int = list.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val button: Button = itemView.findViewById(R.id.btnClick)
    }
}