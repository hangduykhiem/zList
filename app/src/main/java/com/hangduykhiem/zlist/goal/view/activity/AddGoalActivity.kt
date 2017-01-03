package com.hangduykhiem.zlist.goal.view.activity

import android.content.Context
import com.hangduykhiem.zlist.R
import com.hangduykhiem.zlist.ZListApplication
import com.hangduykhiem.zlist.core.base.BaseActivity
import com.hangduykhiem.zlist.goal.presenter.AddGoalActivityPresenter
import javax.inject.Inject
import android.content.Intent
import android.support.v4.app.ActivityCompat


/**
 * Activity to add your goal

 * Created by deank on 1/2/17.
 */
class AddGoalActivity : BaseActivity<AddGoalActivityView, AddGoalActivityPresenter>(),
        AddGoalActivityView {

    companion object{
        fun launchActivity(context: Context){
            val intent = Intent(context, AddGoalActivity::class.java)
            ActivityCompat.startActivity(context, intent, null)
        }
    }

    @Inject
    lateinit var addGoalActivityPresenter: AddGoalActivityPresenter

    override fun setPresenterView() {
        addGoalActivityPresenter.view = this
    }

    override fun getMainViewId(): Int {
        return R.layout.activity_fragment_container
    }

    override fun getPresenter(): AddGoalActivityPresenter {
        return addGoalActivityPresenter
    }

    override fun onActivityInitialized() {

    }

    override fun injectDependencies() {
        ZListApplication.applicationComponent.inject(this)
    }
}


