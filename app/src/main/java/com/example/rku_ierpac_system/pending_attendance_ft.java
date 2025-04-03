package com.example.rku_ierpac_system;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pending_attendance_ft extends AppCompatActivity {

//    String[] attendanceData = {
//            "3-3-2025\nSem-IV\nA-4DCE-A1\nWeb Programming Using PHP\nLecture-1\nCOMPUTER LAB(SOE)",
//            "3-3-2025\nSem-IV\nA-4DCE-A1\nWeb Programming Using PHP\nLecture-1\nCOMPUTER LAB(SOE)",
//            "3-3-2025\nSem-IV\nA-4DCE-A1\nWeb Programming Using PHP\nLecture-1\nCOMPUTER LAB(SOE)",
//            "3-3-2025\nSem-IV\nA-4DCE-A1\nWeb Programming Using PHP\nLecture-1\nCOMPUTER LAB(SOE)"
//    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pending_attendance_ft);

//        showPendingAttendanceModal();

    }


//    private void showPendingAttendanceModal() {
//        Dialog dialog = new Dialog(this);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setContentView(R.layout.activity_pending_attendance_ft);
//        dialog.setCancelable(false);
//
//        LinearLayout attandanceList = dialog.findViewById(R.id.AttendanceList);
//        Button btncancle = dialog.findViewById(R.id.btnCancle);
//
//        for (int i = 0;i < attendanceData.length;i++){
//            LinearLayout row = new LinearLayout(this);
//            row.setOrientation(LinearLayout.HORIZONTAL);
//            row.setPadding(10,10,10,10);
//
//            TextView srNo = new TextView(this);
//            srNo.setText(String.valueOf(i + 1));
//            srNo.setLayoutParams(new LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.WRAP_CONTENT,1));
//
//            TextView lactureDetails = new TextView(this);
//            lactureDetails.setText(attendanceData[i]);
//            lactureDetails.setLayoutParams(new LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.WRAP_CONTENT,3));
//
//            row.addView(srNo);
//            row.addView(lactureDetails);
//            attandanceList.addView(row);
//        }
//    }
}