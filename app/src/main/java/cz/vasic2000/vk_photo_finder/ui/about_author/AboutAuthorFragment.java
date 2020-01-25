package cz.vasic2000.vk_photo_finder.ui.about_author;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import cz.vasic2000.vk_photo_finder.R;

public class AboutAuthorFragment extends Fragment {

    private AboutAuthorViewModel aboutAuthorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aboutAuthorViewModel =
                ViewModelProviders.of(this).get(AboutAuthorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about_author, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        aboutAuthorViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s){
                    textView.setText(s);
            }
        });
        return root;
    }
}