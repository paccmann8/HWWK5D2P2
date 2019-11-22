package com.example.hwwk5d2p2.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hwwk5d2p2.R
import com.example.hwwk5d2p2.adapter.HotelAdapter
import com.example.hwwk5d2p2.model.Guest
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var guestList: MutableList<Guest>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createGuests()

        setUpRecyclerView()
    }

    fun createGuests(){
        guestList = mutableListOf()
        val guest1 = Guest("John", "10", "30")
        val guest2 = Guest("Peter", "11", "30")
        val guest3 = Guest("Will", "12", "30")
        val guest4 = Guest("Tim", "13", "30")
        val guest5 = Guest("Ben", "14", "30")
        val guest6 = Guest("Andy", "15", "30")

        guestList.add(guest1)
        guestList.add(guest2)
        guestList.add(guest3)
        guestList.add(guest4)
        guestList.add(guest5)
        guestList.add(guest5)
        guestList.add(guest6)

    }

    fun setUpRecyclerView(){

        recyclerView.adapter = HotelAdapter(guestList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        (recyclerView.adapter as HotelAdapter).notifyDataSetChanged()
    }


    //override fun onResume() {
        //super.onResume()
        //readFromProvider()
    //}

   // private fun readFromProvider() {
        //val contentResolver = contentResolver
        //val contentUrl = "content://com.example.hwwk5d2.provider.hwwk5d2/guests"
        //val uri = Uri.parse(contentUrl)
        //val cursor = contentResolver.query(
           // uri, null,
            //null, null, null
        //)

       // cursor?.moveToFirst()
        //while (cursor?.moveToNext() == true) {
            //recyclerView.recyclerView = recyclerView.recyclerView.toString() + "\n" +
                    //cursor.getString(cursor.getColumnIndex("guest_name")) + "Room:" +
                    //cursor.getString(cursor.getColumnIndex(("room_number")))

            //cursor?.close()
        //}



        //cursor?.moveToFirst()
        //while (cursor?.moveToNext() == true) {
            //recyclerView.recyclerView = recyclerView.recyclerView.toString() + "\n" +
                    //cursor.getString(cursor.getColumnIndex("guest_name")) + "Room: " +
                    //cursor.getString(cursor.getColumnIndex("room_number"))

            //insertGuest()
            //clearFields()
            // my_textview.text = my_textview.text.toString()+"\n"+cursor.getColumnIndex(
            //"guest_name")) + "Room: " + cursor.getString(cursor.getColumnIndex("room_number"
            //))

       // }
        //cursor?.close()
   // }
}


