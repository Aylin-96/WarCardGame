package com.student.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val cards = listOf(
        R.drawable.card2, R.drawable.card3, R.drawable.card4, R.drawable.card5, R.drawable.card6,
        R.drawable.card7, R.drawable.card8, R.drawable.card9, R.drawable.card10, R.drawable.card11,
        R.drawable.card12, R.drawable.card13, R.drawable.card14
    )

    var player = 0
    var cpu = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_deal.setOnClickListener{
            Log.e("H",(player+5).toString())
            if(player<20 && cpu<20){
                val leftnumber = Random.nextInt(0, 12)
                val rightnumber = Random.nextInt(0,12);

                iv_card_left.setImageResource(cards.get(leftnumber))
                iv_card_right.setImageResource(cards.get(rightnumber))

                if (leftnumber > rightnumber){
                    player += 1
                    tv_score_left.text = player.toString()
                }
                else if (leftnumber < rightnumber){
                    cpu += 1
                    tv_score_right.text = cpu.toString()
                }
                else{
                    print ("Score is equal")
                }
            }
            else{

                cpu = 0
                player = 0

                tv_score_left.text = player.toString()
                tv_score_right.text = cpu.toString()

            }
        }

    }
}
