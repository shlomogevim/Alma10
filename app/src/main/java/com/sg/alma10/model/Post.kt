package com.sg.alma10.model

data class Post(
    var postId:String="",
    var postNum:Int=1,
    var lineNum: Int =1,
    var imageUri:String="",

    var postText: ArrayList<String> = arrayListOf<String>(),

    var postMargin: Array<ArrayList<Int>> = arrayOf<ArrayList<Int>>(),
    var postBackground:String="",
    var postTransparency:Int=0,
    var postTextSize:Array<Int> = arrayOf<Int>(),
    var postPadding: Array<Int> = arrayOf<Int>(),
    var postTextColor: Array<String> = arrayOf<String>(),
    var postFontFamily:Int=0,
    var postRadiuas:Int=0
)



