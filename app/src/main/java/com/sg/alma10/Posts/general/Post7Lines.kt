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
import com.sg.alma10.utilities.NOT_CONSTANT_COLOR
import com.sg.alma10.utilities.Utility

class Post7Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val postCreatorNew = PostGeneratorNew(context, layout)
    private val util=Utility()



    fun post700() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 700
            lineNum =7
            imageUri ="https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
            postText  = arrayListOf(
                "האדם שמחפש משמעות בחיים",
                "דומה לאחד שקיבל כלי מופלא",
                "והוא ממש נבוך מהמתנה הזו,",
                "מצד אחד",
                "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                "אבל מהצד השני",
                "הוא לא יודע  מה לעזאזל עושים עם זה."
            )
            postBackground ="a9dce3"
            postTransparency =9
            val di=0
            val dd=-80
            postMargin = arrayOf(
                arrayOf(0,-1+di,0,330+dd),
                arrayOf(0,-1+di, 0, 295+dd),
                arrayOf(0,-1+di, 0, 260+dd),
                arrayOf(0,-1+di, 0,225+dd),
                arrayOf(0,-1+di, 0,170+dd),
                arrayOf(0,-1+di, 0,135+dd),
                arrayOf(0,-1+di, 0,80+dd)
            )
           val size1=16
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }

    /*

        fun post71() {
            image.load(R.drawable.between_them)
            val backGround = "9e9e9e"
            val transparency = 0
            val lineA = arrayOf(
                "להגיד את הדבר הנכון",
                "במקום הלא נכון זה חוסר טקט,",
                "להגיד את הדבר הלא נכון",
                "במקום הנכון זה סתם טיפשות,",
                "החכמה",
                "להגיד את הדבר הנכון",
                "במקום הנכון."
            )
            val marginA = arrayOf(
                arrayOf(0, -1, 0, 180),
                arrayOf(0, -1, 0, 150),
                arrayOf(0, -1, 0, 120),
                arrayOf(0, -1, 0, 90),
                arrayOf(-1, -1, 5, 60),
                arrayOf(-1, -1, 60, 30),
                arrayOf(-1, -1, 200, 0)
            )

            val paddingA = arrayOf(0, 0, 0, 0)
            val textSizeA = arrayOf(0, 24, 16, 25, 25, 25, 16, 25)
            val col = "#f6ff03"
            val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col, col)

            nineLinesPost.createPost(
                lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
                radius = 17,fontFamily = 31
            )
        }
    }*/
    }


