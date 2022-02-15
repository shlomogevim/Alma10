package com.sg.alma10.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma10.Posts.NineLinePostNew
import com.sg.alma10.Posts.general.Post6LinesNew
import com.sg.alma10.databinding.ActivityAddPostBinding
import com.sg.alma10.utilities.Utility

class AddPostActivity : AppCompatActivity() {

    lateinit var binding:ActivityAddPostBinding

    lateinit var nineLinesPostNew: NineLinePostNew
    lateinit var post6LinesNew: Post6LinesNew

    val util=Utility()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddPostBinding.inflate(layoutInflater)
      setContentView(binding.root)

      /*  var arr=ArrayList<String>()
        arr= arrayListOf("loki","toti","lofi")
        val data=HashMap<String,Any>()
        data["bolo1"]=arr
        FirebaseFirestore.getInstance().collection("First try").add(data)*/

        nineLinesPostNew = NineLinePostNew(this, binding.mainLayout)

        post6LinesNew = Post6LinesNew(this)

     //  util.logi("AadPostActivity11")

          //    post6LinesNew.post600()
            // post6LinesNew.post601()
            //    post6LinesNew.post602()
        post6LinesNew.post603()

      // operateBtn()

    }













    private fun operateBtn(){
    binding.btn1.setOnClickListener {
            post6LinesNew.post600()
      }
        binding.btn2.setOnClickListener {
            post6LinesNew.post602()
        }
        binding.btn3.setOnClickListener {
            post6LinesNew.post603()
        }


    }


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
        val textColorA = arrayOf(CONSTANT_COLOR, col, col)

        nineLinesPostNew.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 240
        )
    }*/
}