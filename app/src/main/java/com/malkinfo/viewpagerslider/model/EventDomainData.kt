package com.malkinfo.viewpagerslider.model

import com.malkinfo.viewpagerslider.R

data class EventDomainData(

          val title :String,
          val rating : Float,
          val desc :String,
          val imgUri:Int
)

/**
 * create Kids List
 * */

val EventDomainList = listOf(
    EventDomainData(
        "Brain Teasers",
        5.0f,
        "Welcome to Brain Teasers",
        R.drawable.image_1
    ),
    EventDomainData(
        "Idea Presentation",
        5.0f,
        "Welcome to Idea Presentation",
        R.drawable.image_2
    ),
    EventDomainData(
        "Rovers",
        5.0f,
        "Welcome to Rovers",
        R.drawable.image_3
    ),
    EventDomainData(
        "Games",
        5.0f,
        "Welcome to Games",
        R.drawable.image_4
    ),
    EventDomainData(
        "Creative",
        5.0f,
        "Welcome to Creative",
        R.drawable.image_5
    ),

)