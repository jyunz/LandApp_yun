package com.example.landapp_yun.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.landapp_yun.R
import com.example.landapp_yun.datas.Room

// 주생성자에게서 필요한 재료를 받자. : 주 생성자에게서 받은 재료를 순서대로 부모에게 넘기자.

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

        val inflater = LayoutInflater.from(mContext)

//    getView함수를 우리가 원하는 모양대로 뿌려지게 하려고 override함.
//    gerView함수를

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.room_list_item,null)
        }

        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        return row
    }
}
//층수
// 1- 이상  => ? 층. => ex.5 : 5층
// 0 반지하
// -1 이하 => 지하 ?층 =>ex.-2 :2층
// Room 클래스 안에서 작업