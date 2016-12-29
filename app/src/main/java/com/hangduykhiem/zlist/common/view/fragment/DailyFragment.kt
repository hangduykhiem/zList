package com.hangduykhiem.zlist.common.view.fragment

import com.hangduykhiem.zlist.R
import com.hangduykhiem.zlist.ZListApplication
import com.hangduykhiem.zlist.common.presenter.DailyFragmentPresenter
import com.hangduykhiem.zlist.core.base.BaseFragment
import javax.inject.Inject

/**
 * Fragment to display daily tasks
 *
 * Created by hduykhiem on 29/12/2016.
 */
class DailyFragment : BaseFragment<DailyFragmentView, DailyFragmentPresenter>(), DailyFragmentView {

    @Inject
    lateinit var dailyFragmentPresenter: DailyFragmentPresenter

    override fun setPresenterView() {
        dailyFragmentPresenter.view = this
    }

    override fun getMainViewId(): Int {
        return R.layout.fragment_daily
    }

    override fun getPresenter(): DailyFragmentPresenter {
        return dailyFragmentPresenter
    }

    override fun onFragmentInitialized() {

    }

    override fun injectDependencies() {
        ZListApplication.ZListApplication.applicationComponent.inject(this)
    }
}
