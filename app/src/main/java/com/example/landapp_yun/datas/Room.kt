package com.example.landapp_yun.datas

import java.text.NumberFormat
import java.util.*

class Room (
    val price: Int,
    val address:String,
    val floor: Int,
    val descripsion: String) {

//가격
//    1억이상  ex. 28500 =>2억 8500

    fun getFormattPrice() : String {
        if (this.price >=10000) {
            val uk = this.price / 10000  // 정수와 정수의 나눗셈은 소숫점을 버리고 몫만 남긴다.
            val rest = this.price % 10000

            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }
        else {
            //원래 8500등으로 억단위 이하의 가격만 오는 분기.
            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"
        }

    }


//층수
// 1- 이상  => ? 층. => ex.5 : 5층
// 0 반지하
// -1 이하 => 지하 ?층 =>ex.-2 :2층
// Room 클래스 안에서 작업
    fun getFormattedFloor() : String {
        if (this.floor >= 1) {
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }
    }
}