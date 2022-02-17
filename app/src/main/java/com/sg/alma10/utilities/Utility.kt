package com.sg.alma10.utilities

import android.util.Log
import com.google.firebase.firestore.DocumentSnapshot
import com.sg.alma10.model.Post

class Utility {
    fun convertToPost(snap: DocumentSnapshot?): Post {
        val postId = snap?.getString(POST_ID).toString()
        val postNum = snap?.getLong(POST_NUM)!!.toInt()
        val lineNum = snap?.getLong(POST_LINE_NUM)?.toInt()
        val imageUri = snap?.getString(POST_IMAGE_URI).toString()
        val postText:Array<String> = snap?.get(POST_TEXT) as Array<String>
        val postMargin:Array<Array<Int>> = snap?.get(POST_MARGIN) as Array<Array<Int>>
        val postBackground = snap?.getString(POST_BACKGROUND).toString()
        val postTranparency = snap?.getLong(POST_TRANPARECY)!!.toInt()
        val postTextSize:Array<Int> = snap?.getString(POST_TEXT_SIZE)  as Array<Int>
        val postPadding: Array<Int> = snap?.getString(POST_PADDING) as Array<Int>
        val postTextColor: Array<String> = snap?.get(POST_TEXT_COLOR) as Array<String>
        val postFontFamily= snap?.getLong(POST_FONT_FAMILY)!!.toInt()
        val postRadius= snap?.getLong(POST_RADIUS)!!.toInt()
        val newPost=Post(postId,postNum,lineNum,imageUri,postText,postMargin,postBackground,postTranparency,postTextSize,postPadding,postTextColor,postFontFamily,postRadius )
        return newPost
    }
    fun logi(
        element1: String,
        element2: String = "",
        element3: String = "",
        element4: String = ""
    ) {
        if (element1 != "" && element2 == "" && element3 == "" && element4 == "") {
            Log.d("gg", "${element1}")
        }
        if (element1 != "" && element2 != "" && element3 == "" && element4 == "") {
            Log.d("gg", "${element1} ,${element2}")
        }
        if (element1 != "" && element2 != "" && element3 != "" && element4 == "") {
            Log.d("gg", "${element1} ,${element2} ,${element3}")
        }
        if (element1 != "" && element2 != "" && element3 != "" && element4 != "") {
            Log.d("gg", "${element1} ,${element2} ${element3},${element4}")
        }
    }
}