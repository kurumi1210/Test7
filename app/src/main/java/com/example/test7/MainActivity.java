package com.example.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.test7.dataModels.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewStudents;
    private ArrayList<Student> arrayListStudent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewStudents = findViewById(R.id.lvStudents);

        arrayListStudent.add(new Student("XH","1850338","DWD"));
        arrayListStudent.add(new Student("Alice","1850323","DWD"));
        arrayListStudent.add(new Student("Jane","1850345","DWD"));
        arrayListStudent.add(new Student("James","1850324","DWD"));

        StudentAdapter adapter = new StudentAdapter(arrayListStudent, this);

        listViewStudents.setAdapter(adapter);
    }
}
