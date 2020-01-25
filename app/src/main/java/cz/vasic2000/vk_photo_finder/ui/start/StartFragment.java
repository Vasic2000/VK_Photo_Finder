package cz.vasic2000.vk_photo_finder.ui.start;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.vasic2000.vk_photo_finder.R;

public class StartFragment extends Fragment {

    @BindView(R.id.text_start_view)
    TextView textView;
    @BindView(R.id.latitude)
    EditText editTextLat;
    @BindView(R.id.longitude)
    EditText editTextLon;
    @BindView(R.id.buttonFind)
    Button btnFind;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StartViewModel startViewModel = ViewModelProviders.of(this).get(StartViewModel.class);
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(this, root);
        startViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}