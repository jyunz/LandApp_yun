package com.example.landapp_yun.datas

class Room (
    val price: Int,
    val address:String,
    val floor: Int,
    val descripsion: String) {
    
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