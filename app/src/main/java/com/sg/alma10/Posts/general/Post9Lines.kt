package com.sg.alma10.Posts.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma10.Posts.PostGeneratorNew
import com.sg.alma10.R
import com.sg.alma10.model.Post
import com.sg.alma10.utilities.CONSTANT_COLOR
import com.sg.alma10.utilities.Utility

class Post9Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val postCreatorNew = PostGeneratorNew(context, layout)
    private val util = Utility()


    fun post900() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2017/02/06/11/58/desert-2042738_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 900
            lineNum = 9
            imageUri = "https://cdn.pixabay.com/photo/2017/02/06/11/58/desert-2042738_1280.jpg"
            postText = arrayListOf(
                "זה שהסתדרת עם השנים זה לא אומר שאתה מסודר,",
                "זה שאתה עסוק כל הזמן זה לא אומר שאתה עושה משהו,",
                "זה שאתה אוכל כל הזמן זה לא אומר שאתה שבע,",
                "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
                "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
                "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
                "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
                "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
                "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
            )
            postBackground = "a9dce3"
            postTransparency = 9
            val di = 0
            val dd = -80
            postMargin = arrayOf(
                arrayOf(0, -1 + di, 0, 560 + dd),
                arrayOf(0, -1 + di, 0, 500 + dd),
                arrayOf(0, -1 + di, 0, 440 + dd),
                arrayOf(0, -1 + di, 0, 380 + dd),
                arrayOf(0, -1 + di, 0, 320 + dd),
                arrayOf(0, -1 + di, 0, 260 + dd),
                arrayOf(0, -1 + di, 0, 200 + dd),
                arrayOf(0, -1 + di, 0, 140 + dd),
                arrayOf(0, -1 + di, 0, 80 + dd)
            )
            val size1 = 16
            val size2 = 0
            postTextSize = arrayOf(0, size1, size2)
            postPadding = arrayOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
}

 /*
        זה שאתה יודע הרבה על דיכאונות ואיך לצאת מהם זה לא אומר שאתה לא מדוכא
זה שאתה יועץ נישואים זה לא אומר שהזוגיות שלך מוצלחת
זה שאתה פסיכולוג זה לא אומר שאתה נמצא באופן שיגרתי לפני התמוטטות עצבים
זה שאתה יודע הרבה על החיים זה לא אומר שאתה חי בטוב
*/