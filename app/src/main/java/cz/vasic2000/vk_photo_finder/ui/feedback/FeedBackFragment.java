package cz.vasic2000.vk_photo_finder.ui.feedback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import cz.vasic2000.vk_photo_finder.R;

public class FeedBackFragment extends Fragment {

    private FeedBackViewModel feedBackViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        feedBackViewModel =
                ViewModelProviders.of(this).get(FeedBackViewModel.class);
        View root = inflater.inflate(R.layout.fragment_feedback, container, false);
        final TextView textView = root.findViewById(R.id.text_feedback);
        feedBackViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}