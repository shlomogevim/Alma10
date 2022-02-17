package com.sg.alma10.Posts.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma10.Posts.PostGenerator
import com.sg.alma10.R
import com.sg.alma10.utilities.CONSTANT_COLOR

class Post1Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost = PostGenerator(context, layout)

    fun post100() {
        val lineNum = 1
        val imageUri = "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"
        image.load(imageUri)
        val postText = arrayOf(
            "כל אחד מדבר את מה שהוא."
        )
        val dd=0
        val du=0
       val  marginA = arrayOf(arrayOf(0, 0+du, 0, -1+dd))
        val backGround = "263238"
         val transparency = 4
        val size1=30
        val size2=28
        val textSizeA = arrayOf(0,size1,size2,size2, size2,size2, size2)
        val paddingA = arrayOf(10, 0, 10, 0)
        val col = "#f6ff03"
        val col1 = "#F4611E"
        val textColorA = arrayOf(CONSTANT_COLOR, col, col1, col1, col1, col1, col1)
        val fontFamily=200
        val radius=15
        nineLinesPost.createPost(
            lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
        )
    }
    fun post101() {
        val lineNum = 1
        val imageUri = "https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
        image.load(imageUri)
        val postText = arrayOf(
            "אתה הוא האור שבו אתה חי."
        )
        val dd=0
        val du=0
        val  marginA = arrayOf(arrayOf(0, 0+du, 0,0+dd))
        val backGround = "263238"
        val transparency = 0
        val size1=30
        val size2=28
        val textSizeA = arrayOf(0,size1,size2,size2, size2,size2, size2)
        val paddingA = arrayOf(40, 0, 40, 0)
        val col = "#f6ff03"
        val col1 = "#F4611E"
        val textColorA = arrayOf(CONSTANT_COLOR, col, col1, col1, col1, col1, col1)
        val fontFamily=200
        val radius=15
        nineLinesPost.createPost(
            lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
        )
    }
    fun post102() {
        val lineNum = 1
        val imageUri = "https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
        image.load(imageUri)
        val postText = arrayOf(
            "גם מחיים שלווים לגמרי מתים בסוף."
        )
        val dd=0
        val du=0
        val  marginA = arrayOf(arrayOf(0, -1+du, 0,0+dd))
        val backGround = "263238"
        val transparency =1
        val size1=30
        val size2=28
        val textSizeA = arrayOf(0,size1,size2,size2, size2,size2, size2)
        val paddingA = arrayOf(0, 0, 0, 0)
        val col ="#f6ff03"
        val col1 = "#F4611E"
        val textColorA = arrayOf(CONSTANT_COLOR, col, col1, col1, col1, col1, col1)
        val fontFamily=200
        val radius=15
        nineLinesPost.createPost(
            lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
        )
    }


}