package com.example.carsheringapplication;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.EditText;

public class MyAlertDialog {

    public interface DialogDismissListener {
        void onDialogDismissed();
    }
    public static void showInputDialog(Context context, Intent intent, DialogDismissListener listener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Введите время аренды в днях");

        // Создаем поле ввода
        final EditText input = new EditText(context);
        builder.setView(input);

        // Устанавливаем кнопку "OK"
        builder.setPositiveButton("Далее", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int userInput = Integer.parseInt(input.getText().toString());
                intent.putExtra("time", userInput);
                listener.onDialogDismissed();
            }
        });
        // Устанавливаем кнопку "Отмена"
        builder.setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}