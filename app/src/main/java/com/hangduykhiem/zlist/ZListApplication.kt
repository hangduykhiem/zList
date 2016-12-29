package com.hangduykhiem.zlist

import android.app.Application
import com.hangduykhiem.zlist.ZListApplication.ZListApplication.applicationComponent
import com.hangduykhiem.zlist.common.di.ApplicationComponent
import com.hangduykhiem.zlist.common.di.DaggerApplicationComponent

/**
 * [Application] implementation for this application
 *
 * Created by deank on 12/26/16.
 */
class ZListApplication : Application() {

    object ZListApplication{
        lateinit var applicationComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    private fun initializeDagger() {
        applicationComponent = DaggerApplicationComponent.create()
    }
}
