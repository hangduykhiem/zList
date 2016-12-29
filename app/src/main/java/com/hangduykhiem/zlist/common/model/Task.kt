package com.hangduykhiem.zlist.common.model

import java.util.*

/**
 * Model implementation for task
 *
 * Created by hduykhiem on 16/12/2016.
 */

data class Task(val id: Long,
                val name:String,
                val description: String,
                val date: Date,
                val deadline: Date?)
