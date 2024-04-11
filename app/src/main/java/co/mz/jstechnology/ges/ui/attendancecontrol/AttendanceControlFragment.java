package co.mz.jstechnology.ges.ui.attendancecontrol;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.mz.jstechnology.ges.FaceRecognitionActivity;
import co.mz.jstechnology.ges.databinding.FragmentAttendanceControlBinding;

public class AttendanceControlFragment extends Fragment {

    private AttendanceControlViewModel mViewModel;
    private FragmentAttendanceControlBinding binding;
    public static AttendanceControlFragment newInstance() {
        return new AttendanceControlFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
         binding = FragmentAttendanceControlBinding.inflate(getLayoutInflater());
         return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AttendanceControlViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonregister.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), FaceRecognitionActivity.class);
            startActivity(i);
        });

        binding.buttonrecognize.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), FaceRecognitionActivity.class);
            startActivity(i);
        });
    }
}