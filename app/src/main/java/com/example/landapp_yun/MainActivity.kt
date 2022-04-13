package com.example.landapp_yun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp_yun.adapters.RoomAdapter
import com.example.landapp_yun.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( Room(7500,"서울시 동대문구", 8, "동대문구의 8층 7500만원 방입니다."))
        mRoomList.add( Room(24500,"서울시 서대문구", 0, "서대문구의 반지하 2억 4500만원 방입니다."))
        mRoomList.add( Room(8500,"서울시 동작구", 0, "동작구의 반지하 8500만원 방입니다."))
        mRoomList.add( Room(4500,"서울시 은평구", -2, "은평구의 지하2층 4500만원 방입니다."))
        mRoomList.add( Room(182500,"서울시 중랑구", 5, "중랑구의 5층 18억 2500만원 방입니다."))
        mRoomList.add( Room(235000,"서울시 도봉구", 7, "도봉구의 7층 23억 5000만원 방입니다."))
        mRoomList.add( Room(24000,"서울시 강남구", 19, "강남구의 19층 2억 4000만원 방입니다."))
        mRoomList.add( Room(3700,"서울시 서초구", -1, "서초구의 지하 1층 3700만원 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRoomList[position]
            val myIntent = Intent(this,ViewRoomDetailActivity::class.java)
//            myIntent.putExtra("roomPrice", clickedRoom.price)+층수, 행정구역 등 각각의 목록을 각각 넘겨줘야
//            하는 상황이 되므로 아래의 함수로 통째로 넘겨준다.
//           그런데 myIntent등으로 putExtra 를 할 때  우리가 만든 데이터 클래스 등을 넘기면 putExtra가 오류가 남.
//            => 그래서 상속을 받는것 처럼 만들어주는 것이 Serializable
//            받아서 사용할때는 getSerializableExtra 로 받아서 데이터 활용.
//            => 받아낸 데이터를 [as 데이터 클래스] 로 캐스팅 해줘야 정상활동 가능

            myIntent.putExtra("room",clickedRoom)
            startActivity(myIntent)

        }

    }
}