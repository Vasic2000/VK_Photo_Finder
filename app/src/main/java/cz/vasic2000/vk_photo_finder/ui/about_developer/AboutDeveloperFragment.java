package cz.vasic2000.vk_photo_finder.ui.about_developer;

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

public class AboutDeveloperFragment extends Fragment {

    private AboutDeveloperViewModel aboutDeveloperModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aboutDeveloperModel =
                ViewModelProviders.of(this).get(AboutDeveloperViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about_developer, container, false);
        final TextView textView = root.findViewById(R.id.text_about_developer);
        aboutDeveloperModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}