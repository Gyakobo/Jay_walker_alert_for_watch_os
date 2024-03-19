package j2375.dsrc.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.j2375.databinding.ActivityMainBinding;


public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    // Example Commit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Example comment
        // Another example comment

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}