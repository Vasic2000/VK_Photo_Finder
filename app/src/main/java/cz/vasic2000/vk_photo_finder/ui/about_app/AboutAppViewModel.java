package cz.vasic2000.vk_photo_finder.ui.about_app;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutAppViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutAppViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is about App fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}