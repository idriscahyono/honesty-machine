package com.example.mesinkejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    View view;
    EditText editText;
    Button button;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_satu, container, false);
        editText = view.findViewById(R.id.edit1);
        button = view.findViewById(R.id.btn1);
        textView = view.findViewById(R.id.view1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                String result = "";
                input = input.toLowerCase();
                String [] arrayInput = input.split(" ");

                for (int i = arrayInput.length - 1; i>0; i--)
                {
                    if(arrayInput[i].equals("bohong"))
                    {
                        arrayInput[i-1]=kembali(arrayInput[i-1]);
                    }
                }
                result = arrayInput[0];
                textView.setText(result);
            }
        });
        return view;
    }

    public String kembali(String masukan)
    {
        String hasil = "";
        if (masukan.equals("bohong"))
        {
            hasil = "jujur";
        }
        else {
            hasil = "bohong";
        }
        return hasil;
    }
}
