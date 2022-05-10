package ru.mirea.tereshkin.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        ProgressDialog dialog = new ProgressDialog(getActivity(), getTheme());
        dialog.setTitle("Выполняется загрузка");
        dialog.setMessage("Пожалуйста, подождите");
        dialog.setIndeterminate(true);
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        return dialog;
    }
}
