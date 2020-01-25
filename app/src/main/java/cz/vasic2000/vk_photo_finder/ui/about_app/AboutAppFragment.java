package cz.vasic2000.vk_photo_finder.ui.about_app;

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

public class AboutAppFragment extends Fragment {

    private AboutAppViewModel aboutAppViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aboutAppViewModel =
                ViewModelProviders.of(this).get(AboutAppViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about_app, container, false);
        final TextView textView = root.findViewById(R.id.text_aboutApp);
        aboutAppViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}