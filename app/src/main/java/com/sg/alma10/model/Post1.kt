package com.sg.alma10.model

data class Post1(
    var postId:String="",
    var postNum:Int=1,
    var lineNum: Int =1,
    var imageUri:String="",

    var postText: ArrayList<String> = arrayListOf<String>(),

    var postMargin: ArrayList<String> = arrayOf<ArrayList<Int>>(),
    var postMarginString: String = arrayListOf<String>(),


    var postBackground: Int ="",
    var postTransparency: ArrayList<Int> =0,
    var postTextSize:ArrayList<Int> = arrayListOf<Int>(),
    var postPadding: ArrayList<String> = arrayListOf<Int>(),
    var postTextColor: Int = arrayListOf<String>(),
    var postFontFamily:Int=0,
    var postRadiuas:Int=0
)



