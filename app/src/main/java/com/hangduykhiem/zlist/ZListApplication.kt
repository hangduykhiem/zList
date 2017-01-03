package com.hangduykhiem.zlist

import android.app.Application
import com.hangduykhiem.zlist.common.di.ApplicationComponent
import com.hangduykhiem.zlist.common.di.DaggerApplicationComponent

/**
 * [Application] implementation for this application
 *
 * Created by deank on 12/26/16.
 */
class ZListApplication : Application() {

    companion object {
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
