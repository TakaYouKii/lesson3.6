package com.example.lesson3_6
import java.io.Serializable

data class Music(val name:String? = "Неизвестное название",val author:String? = "Незвестный исполнитель",val plays:String? = "0", val duration:String? = "0:00"):Serializable

