package cz.vasic2000.vk_photo_finder.ui.feedback;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedBackViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FeedBackViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is feedBack fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}