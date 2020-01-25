package cz.vasic2000.vk_photo_finder.ui.start;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import cz.vasic2000.vk_photo_finder.R;

public class StartFragment extends Fragment {

    private StartViewModel startViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        startViewModel =
                ViewModelProviders.of(this).get(StartViewModel.class);
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = root.findViewById(R.id.text_start_view);
        EditText editTextLat = root.findViewById(R.id.latitude);
        EditText editTextLon = root.findViewById(R.id.longitude);
        Button btnFind = root.findViewById(R.id.buttonFind);

        startViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}