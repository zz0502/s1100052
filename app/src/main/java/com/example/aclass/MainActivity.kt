package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count:Int = 0
    var word:String = ""
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun AddOne(v:View) {
        if(v.id == R.id.btn) {
            count++
            if(count==1) {
                word = "大家好，我叫蔡榮宏，我是屏東人，從屏榮高中畢業後就讀靜宜大學資管系" +
                        "，目前大二"
            }
            if(count==2) {
                word = "我是個個性比較內向的人，從以前開始就不太會跟別人聊天，\n" +
                        "也導致我從以前開始社交能力就很差，所以希望上大學後可以\n" +
                        "認識更多人，交更多朋友"
            }
            if(count==3) {
                word = "我平常的興趣是看劇、打遊戲，所以平時很少出門運動，\n" +
                        "平時喜歡自己一個人\n"
            }
            if(count==4) {
                word = "在大學這兩年期間，學到了許多東西，而讓我最感興趣的是寫\n" +
                        "程式、網頁製作，也希望自己能夠學得更多，對未來工作有幫助\n"
            }
        }
        else{
            count = 0
            word = "我的介紹的這，謝謝大家"
        }
        txv.text = word

    }

}