package cz.vasic2000.vk_photo_finder.ui.about_author;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutAuthorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutAuthorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}