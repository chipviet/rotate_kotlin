package com.example.xuan.rotation

import android.animation.ValueAnimator
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    val adapter = GroupAdapter<ViewHolder> ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // rotate
        start_btn.setOnClickListener {

//             ValueAnimator.ofFloat(0f, 360f).apply {
//                 duration = value
//             }

//            valueAnimator.addUpdateListener {
//                val value = it.animatedValue as Float
//                // 2
//                electron_image.rotation = value
//            }

          //  valueAnimator.interpolator = LinearInterpolator()
          //  val value = speed_id.text.toString()
           // valueAnimator.duration = value
           // valueAnimator.start()
            val animation = AnimationUtils.loadAnimation(this,R.anim.anim_rotate)
            animation.duration
            electron_image.startAnimation (animation)

        }
        stop_btn.setOnClickListener{
            electron_image.clearAnimation()
        }

//        val textView: TextView? = findViewById(R.id.`speed `)
    }


}
