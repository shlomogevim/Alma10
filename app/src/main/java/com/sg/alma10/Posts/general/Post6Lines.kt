package com.sg.alma10.Posts.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma10.Posts.PostGenerator
import com.sg.alma10.R
import com.sg.alma10.utilities.CONSTANT_COLOR
import com.sg.alma10.utilities.NOT_CONSTANT_COLOR
import com.sg.alma10.utilities.Utility

class Post6Lines (val context: Context) {

    val util=Utility()

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPostNew= PostGenerator(context , layout)
    val lineNum = 6
    var radius=15
    var  fontFamily=240

    fun post600() {
        val imageUrl="https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
        image.load(imageUrl)
        val postText = arrayOf(
            "המיינד",
            "הוא כדור הרגעה",
            "מהאין סופיות של החיים,",
            "טוב להשתמש בו מידי פעם,",
            "אבל כדי לשמור קשר טוב למציאות",
            "רצוי שלא להתמכר אליו יותר מידי."
        )
        val backGround = "263238"
        val transparency = 6
        val marginA = arrayOf(
            arrayOf(150, -1, 0, 205),
            arrayOf(0, -1, 0, 173),
            arrayOf(0, -1, 0, 142),
            arrayOf(0, -1, 0, 110),
            arrayOf(0, -1, 0, 55),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(1, 30,18,18,18,18,18)
        //val textColorA = arrayOf(CONSTANT_COLOR, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#F50057"
        val textColorA = arrayOf(NOT_CONSTANT_COLOR, col1, col, col, col, col, col)
        fontFamily=240
        radius=15

       // util.logi("Post6LinesNew ==> \n marginA=${marginA}")
         nineLinesPostNew.createPost(
             lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
         )
    }
    fun post601() {
        val imageUrl="https://cdn.pixabay.com/photo/2020/01/23/05/49/woman-4786974_1280.jpg"
        image.load(imageUrl)
        //  image.load(R.drawable.bible)
        val postText = arrayOf(
            "אתה חי בתוך אגדה עתיקה",
            "גן העדן והגיהנום נמצאים כאן ועכשיו,",
            "ומי שמחליט לאיזה מחוזות תנוע בעולם הזה הוא:",
            "אתה.",
            "מה שנותר פתוח",
            "זו אותה אמונה באגדות עתיקות."
        )
        val backGround = "263238"
        val transparency = 0
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 390),
            arrayOf(0, -1, 0, 295),
            arrayOf(0, -1, 0, 200),
            arrayOf(0, -1, 0, 150),
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(1,30, 30, 30, 30, 30, 30)
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(NOT_CONSTANT_COLOR, col, col, col, col, col, col1)
        fontFamily=104
        radius=15
        nineLinesPostNew.createPost(
            lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
        )
    }
    fun post602() {
        val imageUri="https://cdn.pixabay.com/photo/2018/11/02/09/50/human-3789910_1280.jpg"
        image.load(imageUri)
        val postText = arrayOf(
            "הגאומטריה של הסבל",
            "במשולש הקיום שלך שלשה קודקודים: ",
            "מה שאתה צריך,",
            "מה שאתה רוצה",
            "ומה שיש לך,",
            "וככול ששטח המשולש קטן יותר," +
                    " אתה פחות סובל."
        )
        val marginA = arrayOf(
            arrayOf(0,20, 0, -1),
            arrayOf(0, -1, 0, 220),
            arrayOf(0, -1, 0, 180),
            arrayOf(0, -1, 0, 150),
            arrayOf(0, -1, 0, 120),
            arrayOf(0, -1, 0, 0)
        )
        val backGround = "428289"
        val transparency = 0
        val size1=32
        val size2=28
        val textSizeA = arrayOf(1,size1,size2,size2, size2,size2, size2)
        val paddingA = arrayOf(10, 0, 10, 0)
        val col = "#18FFFF"
      val col1 = "#F4611E"
        val textColorA = arrayOf(CONSTANT_COLOR, col, col1, col1, col1, col1, col1)
        fontFamily=200
        radius=15
        nineLinesPostNew.createPost(
            lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
        )
    }

    fun post603() {
        val imgeUri="https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg"
        image.load(imgeUri)
        val postText = arrayOf(
            " גן העדן והגיהנום ",
            "הם לא מקומות",
            "בעולם הבא,",
            "הם יותר צורת",
            "המחשבות שלך",
            "בעולם הזה."
        )
        val di = 30
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 40+di, 0, -1),
            arrayOf(0, 80+di, 0, -1),
            arrayOf(0, 120+di, 0, -1),
            arrayOf(0, 160+di, 0, -1),
            arrayOf(0, 200+di, 0, -1)
        )
        val backGround = "428289"
        val transparency = 0
        val size1=24
        val size2=28
        val textSizeA = arrayOf(0,size1,size2,size2, size2,size2, size2)
        val paddingA = arrayOf(0, 0, 0, 0)
        val col = "#007591"
        val col1 = "#F4611E"
        val textColorA = arrayOf(CONSTANT_COLOR, col, col1, col1, col1, col1, col1)
        fontFamily=240
        radius=15
        nineLinesPostNew.createPost(
            lineNum,postText,backGround,transparency,marginA,paddingA,textSizeA,textColorA,fontFamily,radius
        )
    }
}

