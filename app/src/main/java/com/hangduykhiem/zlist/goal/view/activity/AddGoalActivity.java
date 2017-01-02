package com.hangduykhiem.zlist.goal.view.activity;

import com.hangduykhiem.zlist.R;
import com.hangduykhiem.zlist.core.base.BaseActivity;
import com.hangduykhiem.zlist.goal.presenter.AddGoalActivityPresenter;

import org.jetbrains.annotations.NotNull;

/**
 * Activity to add your goal
 *
 * Created by deank on 1/2/17.
 */
public class AddGoalActivity extends BaseActivity<AddGoalActivityView, AddGoalActivityPresenter> {

    @Override
    public void setPresenterView() {

    }

    @Override
    public int getMainViewId() {
        return R.layout.activity_fragment_container;
    }

    @NotNull
    @Override
    public AddGoalActivityPresenter getPresenter() {
        return null;
    }

    @Override
    public void onActivityInitialized() {

    }

    @Override
    public void injectDependencies() {

    }
}
