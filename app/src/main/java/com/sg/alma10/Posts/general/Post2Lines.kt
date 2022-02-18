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

class Post2Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
   private val postCreatorNew = PostGeneratorNew(context, layout)
    private val util=Utility()
    fun post200() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 200
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg"
            postText = arrayListOf(
                "אין בעיות בעולם",
                "חוץ מאלה שאצלך בראש."
            )
            val di = 20
            val du=0
            postMargin =  arrayOf(
                arrayOf(0, -1+du, 0, 32+di),
                arrayOf(0, -1+du, 0, 0+di)
            )
            postBackground = "000000"
            postTransparency = 6
            val size1=24
            postTextSize = arrayOf(0, size1)
            postPadding = arrayOf(0, 0, 0, 0)
            val col =  "#ffffff"
            postTextColor = arrayOf(CONSTANT_COLOR, col)
            postFontFamily =430
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post201() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2017/11/04/14/25/pinocchio-2917652_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 201
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/11/04/14/25/pinocchio-2917652_1280.jpg"
            postText = arrayListOf(
                "  לאמת פנים רבות  ",
                "  אחד מהם הוא השקר."
            )
            val di = 0
            val du=0
            postMargin =  arrayOf(
                arrayOf(0, 10+du, 0, -1+di),
                arrayOf(0, 50+du, 0, -1+di)
            )
            postBackground = "263238"
            postTransparency = 2
            val size1=26
            postTextSize = arrayOf(0, size1)
            postPadding = arrayOf(0, 0, 0, 0)
            val col = "#a7aba8"
            postTextColor = arrayOf(CONSTANT_COLOR, col)
            postFontFamily =100
            postRadiuas = 5
        }
        postCreatorNew.createPost(post)
    }
    fun post202() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2019/03/31/07/37/black-hole-4092609_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 202
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2019/03/31/07/37/black-hole-4092609_1280.jpg"
            postText = arrayListOf(
                "העתיד הוא ההיסטוריה",
                "רק עם תאריך אחר."
            )
            val di = 0
            val du=0
            postMargin =  arrayOf(
                arrayOf(0, -1+du, 0, 55+di),
                arrayOf(0, -1+du, 0, 10+di)
            )
            postBackground = "263238"
            postTransparency =0
            val size1=29
            postTextSize = arrayOf(0, size1)
            postPadding = arrayOf(0, 0, 0, 0)
            val col ="#b3b7b4"
            postTextColor = arrayOf(CONSTANT_COLOR, col)
            postFontFamily =509
            postRadiuas = 5
        }
        postCreatorNew.createPost(post)
    }
    fun post203() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 203
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg"
            postText = arrayListOf(
                "ונתתי את האור וחושך לפניך",
                "ובחרת באור."
            )
            val di = 0
            val du=0
            postMargin =  arrayOf(
                arrayOf(0, -1+du, 0, 45+di),
                arrayOf(0, -1+du, 0, 10+di)
            )
            postBackground = "263238"
            postTransparency =4
            val size1=25
            postTextSize = arrayOf(0, size1)
            postPadding = arrayOf(0, 0, 0, 0)
            val col ="#f6ff03"
            postTextColor = arrayOf(CONSTANT_COLOR, col)
            postFontFamily =501
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }

    fun post204() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 204
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg"
            postText = arrayListOf(
                "אם אתה לא יכול להטיב את המצב",
                "אז על תתערב."
            )
            val di = 20
            postMargin = arrayOf(
                arrayOf(0, 0 + di, 0, -1),
                arrayOf(0, 75 + di, 0, -1)
            )
            postBackground = "004d40"
            postTransparency = 0
            postTextSize = arrayOf(0, 29)
            postPadding = arrayOf(10, 0, 10, 0)
            val col = "#99eedf"
            val col1 = "#ffffff"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily = 600
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post205() {
        val imageUri1 = "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 205
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg"
            postText =  arrayListOf(
                "אי עשייה גוררת  אי עשייה ,",
                "עשייה גוררת  עשייה."
            )
            val di = 20
            postMargin = arrayOf(
                arrayOf(0, 0+di, 0, -1),
                arrayOf(0, 45+di, 0, -1)
            )
            postBackground = "004d40"
            postTransparency = 0
            postTextSize =  arrayOf(0, 26)
            postPadding = arrayOf(10, 0, 10, 0)
            val col = "#ffffff"
            val col1 = "#ffffff"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily = 4
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post206() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 206
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_1280.jpg"
            postText =  arrayListOf(
                "ככל  שהחיים נעשים שבירים יותר,",
                "כך הם  מובנים יותר."
            )
            val di=40
            postMargin = arrayOf(
                arrayOf(0, 0+di, 0, -1),
                arrayOf(0, 110+di, 0, -1)
            )
            postBackground = "757575"
            postTransparency = 0
            postTextSize =  arrayOf(0, 26)
            postPadding = arrayOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#ffffff"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =541
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post207() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 207
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
            postText = arrayListOf(
                " האלוהים ברא את היצירה ",
                " האדם  את  הביקורת. "
            )
            val di=0
            postMargin = arrayOf(
                arrayOf(0, 0+di, 0, -1),
                arrayOf(0, 87+di, 0, -1)
            )
            postBackground = "757575"
            postTransparency = 4
            postTextSize =  arrayOf(0, 30)
            postPadding = arrayOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#ffffff"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =110
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post208() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2016/11/22/22/21/adventure-1850912_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 208
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
            postText = arrayListOf(
                "אתה בוחר מן הסתם להגיע למקומות מסוימים,",
                "אבל החיים בוחרים לך את סוג החוויה שם."
            )
            val di=0
            val dd=0
            postMargin = arrayOf(
                arrayOf(0,0+di, 0, -1+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground = "757575"
            postTransparency = 6
            postTextSize =  arrayOf(0, 28)
            postPadding =  arrayOf(5, 0, 5, 0)
            val col = "#ffffff"
            //val col1 = "#4dd0e1"
           // val col1 = "#1de9b6"
           val col1 = "#64dd17"
           // val col1 = "#ff6d00"
            postTextColor = arrayOf(NOT_CONSTANT_COLOR, col, col1, col1)
            postFontFamily =4
            postRadiuas = 15
        }
  postCreatorNew.createPost(post)
    }
    fun post209() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2019/09/26/17/39/pensioner-4506621_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 209
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2019/09/26/17/39/pensioner-4506621_1280.jpg"
            postText =  arrayListOf(
                "אם אין לך דרך אחרת זמינה טובה יותר,",
                "אין טעם לקטר על הדרך בה אתה הולך."
            )
            val di=0
            val dd=0
            postMargin = arrayOf(
                arrayOf(0,0+di, 0, -1+dd),
                arrayOf(0, 105+di, 0, -1+dd)
            )
            postBackground =  "008970"
            postTransparency = 10
            postTextSize =  arrayOf(0, 28)
            postPadding =  arrayOf(5, 0, 5, 0)
            val col = "#64ffda"
           val col1 = "#4dd0e1"
             postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =4
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post210() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2016/06/23/21/04/fool-1476189_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 210
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/06/23/21/04/fool-1476189_1280.jpg"
            postText =  arrayListOf(
                "זה שאתה מאמין בהבלים",
                "זה לא עושה אותם פחות הבלים."
            )
            val di=0
            val dd=10
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0, 110+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground = "030e4f"
            postTransparency = 7
            val size1=30
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(5, 0, 5, 0)
            val col = "#f49f1c"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =4
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post211() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2015/08/09/19/29/people-882078_1280.jpg"
        image.load(imageUri1)
        image.scaleType=ImageView.ScaleType.CENTER_CROP
        val post = Post()
        with(post) {
            postNum = 211
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/08/09/19/29/people-882078_1280.jpg"
            postText =   arrayListOf(
                    "חכם לא עושה דברים",
            "שטיפש סובל מהם על בסיס קבוע."
            )
            val di=0
            val dd=10
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,100+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground = "efc9af"
            postTransparency =8
            val size1=30
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(5, 0, 5, 0)
            val col = "#1f8ac0"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post212() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2017/08/16/03/04/chimp-2646308_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 212
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/08/16/03/04/chimp-2646308_1280.jpg"
            postText = arrayListOf(
                    "הטיפש בטוח בחכמתו",
            "החכם בטוח בטיפשוטו."
            )
            val di=0
            val dd=10
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,85+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground = "efc9af"
            postTransparency =8
            val size1=25
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(5, 0, 5, 0)
            val col ="#1f8ac0"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post213() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2018/02/21/16/59/human-3170876_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 213
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/21/16/59/human-3170876_1280.jpg"
            postText = arrayListOf(
                "   להיתפס כטמבל בעיני עצמך   ",
                "זה הרבה יותר גרוע מלהיות טמבל."
            )
            val di=0
            val dd=10
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,90+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground ="e64a19"
            postTransparency =8
            val size1=24
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#ffe25f"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =4
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post214() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2016/09/21/04/46/barley-field-1684052_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 214
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/09/21/04/46/barley-field-1684052_1280.jpg"
            postText = arrayListOf(
                "אתה לא יכול להרוויח משהו אמיתי בחיים האלה,",
                "פרט לזכות הזאת לחיות את הרגע הזה."
            )
            val di=0
            val dd=10
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,110+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground ="e64a19"
            postTransparency =0
            val size1=24
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#ffe25f"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =1
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post215() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2018/09/22/11/34/board-3695073_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 215
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/09/22/11/34/board-3695073_1280.jpg"
            postText = arrayListOf(
                "ההצלחה שלך נמדדת",
                "רק לפי האמונה שבך שאתה מצליח."
            )
            val di=0
            val dd=20
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,68+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground ="e64a19"
            postTransparency =0
            val size1=22
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#ff5722"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =1
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post216() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2021/11/12/04/50/donkey-6787990_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 216
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2021/11/12/04/50/donkey-6787990_1280.jpg"
            postText = arrayListOf(
                "החיים האלה דורשים ממך להתנהל בהגיון,",
                "למרות שהם עצמם ממש לא הגיוניים."
            )
            val di=0
            val dd=20
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,70+dd),
                arrayOf(0, -1+di, 0, 0+dd)
            )
            postBackground ="4ac4e2"
            postTransparency =0
            val size1=22
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =1
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }
    fun post217() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2020/02/19/09/34/health-4861815_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 217
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/02/19/09/34/health-4861815_1280.jpg"
            postText  = arrayListOf(
                "אתה לא מספיק טוב",
                "כדי להבין כמה טוב."
            )
            val di=0
            val dd=20
            postMargin = arrayOf(
                arrayOf(0,-1+di, 0,40+dd),
                arrayOf(0,-1+di, 0, 0+dd)
            )
            postBackground ="4ac4e2"
            postTransparency =0
            val size1=30
            val size2=0
            postTextSize =  arrayOf(0, size1,size2)
            postPadding =  arrayOf(0, 0,0, 0)
            val col = "#84ffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayOf(CONSTANT_COLOR, col, col1, col1)
            postFontFamily =530
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)
    }

}
