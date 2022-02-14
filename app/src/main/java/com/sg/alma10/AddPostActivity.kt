package com.sg.alma10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.alma10.Posts.NineLinePost
import com.sg.alma10.Posts.general.Post6Lines
import com.sg.alma10.databinding.ActivityAddPostBinding
import java.util.ArrayList

class AddPostActivity : AppCompatActivity() {

    lateinit var binding:ActivityAddPostBinding

    lateinit var nineLinesPost: NineLinePost
    lateinit var post6Lines: Post6Lines


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)


      /*  var arr=ArrayList<String>()
        arr= arrayListOf("loki","toti","lofi")
        val data=HashMap<String,Any>()
        data["bolo1"]=arr
        FirebaseFirestore.getInstance().collection("First try").add(data)*/


        nineLinesPost = NineLinePost(this, binding.mainLayout)
        post6Lines = Post6Lines(this)

      operateBtn()

    }

    private fun operateBtn(){
    binding.btn1.setOnClickListener {
            post6Lines.post61()
      }
        binding.btn2.setOnClickListener {
            post6Lines.post63()
        }
        binding.btn3.setOnClickListener {
            post6Lines.post662()
        }


    }



  /*class Post6Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
    val lineNum = 6*/





   /* fun post662() {

        image.load("https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg")
        val backGround = "428289"
        val tranparency = 0
        val lineA = arrayOf(
            " גן העדן והגיהנום ",
            "הם לא מקומות",
            "בעולם הבא,",
            "הם יותר צורת",
            "המחשבות שלך",
            "בעולם הזה.",
            "" +
                    ""
        )
        val di = 60
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 40+di, 0, -1),
            arrayOf(0, 80+di, 0, -1),
            arrayOf(0, 120+di, 0, -1),
            arrayOf(0, 160+di, 0, -1),
            arrayOf(0, 200+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0,24)
        val col = "#007591"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 240
        )
    }*/
}