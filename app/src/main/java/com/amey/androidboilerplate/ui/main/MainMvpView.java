package com.amey.androidboilerplate.ui.main;

import java.util.List;

import com.amey.androidboilerplate.data.model.Ribot;
import com.amey.androidboilerplate.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
