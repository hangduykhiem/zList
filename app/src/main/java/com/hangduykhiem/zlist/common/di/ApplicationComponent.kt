package com.hangduykhiem.zlist.common.di

import com.hangduykhiem.zlist.ZListApplication
import com.hangduykhiem.zlist.common.view.activity.HomeActivity
import dagger.Component
import dagger.Module

/**
 * Dagger Component for the Application
 *
 * Created by deank on 12/26/16.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    /**
     * Inject into HomeActivity
     */
    fun inject(homeActivity: HomeActivity)

    /**
     * Inject to Application
     */
    fun inject(application: ZListApplication)
}
