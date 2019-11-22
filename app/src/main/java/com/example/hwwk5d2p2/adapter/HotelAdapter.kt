package com.example.hwwk5d2p2.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hwwk5d2p2.R
import com.example.hwwk5d2p2.model.Guest
import kotlinx.android.synthetic.main.activity_main2.view.*

class HotelAdapter(val guestList: List<Guest>) :
    RecyclerView.Adapter<HotelAdapter.MyCustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main2, parent, false)
        return MyCustomViewHolder(view)

    }

    override fun getItemCount(): Int = guestList.size


    override fun onBindViewHolder(viewHolder: MyCustomViewHolder, position: Int) {

        viewHolder.apply {
            guest_nameTextView.text = guestList.get(position).guest_name
            room_numberTextView.text = guestList.get(position).room_number
            priceTextView.text = guestList.get(position).price
        }
    }


    class MyCustomViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val guest_nameTextView: TextView = itemView.findViewById(R.id.guest_name_textview)
        val room_numberTextView: TextView = itemView.findViewById(R.id.room_number_textview)
        val priceTextView: TextView = itemView.findViewById(R.id.room_price_textview)
    }
}