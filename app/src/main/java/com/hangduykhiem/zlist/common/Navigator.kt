package com.hangduykhiem.zlist.common

import android.content.Context
import com.hangduykhiem.zlist.goal.view.activity.AddGoalActivity

/**
 * Object to help with in app navigation
 *
 * Created by deank on 1/2/17.
 */
object Navigator{

    fun navigateToHomeAcitivty(context: Context){

    }

    fun navigateToAddGoalActivity(context: Context){
        AddGoalActivity.launchActivity(context)
    }
}