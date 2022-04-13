package com.example.landapp_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp_yun.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

//        메인에서 보내준 데이터 받기
        val roomData = intent.getSerializableExtra("room") as Room

        priceTxt.text = roomData.getFormmatedPrice()

        descriptionTxt.text = roomData.descripsion

        addressTxt.text = roomData.address

        floorTxt.text = roomData.formmatedFloor()
// 깃허브 확인용 입니다.
    }
}