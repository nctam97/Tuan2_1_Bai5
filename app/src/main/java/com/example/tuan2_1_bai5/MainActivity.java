package com.example.tuan2_1_bai5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt_tenkh,edt_soluongsach,edt_tongkh,edt_tongkhvip,edt_tongdt,edt_thanhtien;
    Button btn_tinhtt,btn_tiep,btn_thongke;
    CheckBox cb_isVip;
    ArrayList<HoaDon>dsHD=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_thanhtien=(EditText)findViewById(R.id.edt_thanhtien);
        edt_tenkh=(EditText)findViewById(R.id.edt_tenkh);
        edt_soluongsach=(EditText)findViewById(R.id.edt_soluongsach);
        edt_tongkh=(EditText)findViewById(R.id.edt_tongkh);
        edt_tongkhvip=(EditText)findViewById(R.id.edt_tongkhvip);
        edt_tongdt=(EditText)findViewById(R.id.edt_tongdt);
        btn_tinhtt=(Button)findViewById(R.id.btn_tinhtt);
        btn_tiep=(Button)findViewById(R.id.btn_tiep);
        btn_thongke=(Button)findViewById(R.id.btn_thongke);
        cb_isVip=(CheckBox)findViewById(R.id.cb_isVip);
        btn_tinhtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenkh = edt_tenkh.getText().toString();
                int soluongsach = 0;
                if(edt_soluongsach.getText().toString().trim().length()>0)
                    soluongsach=Integer.parseInt(edt_soluongsach.getText().toString());
                HoaDon hd = new HoaDon(tenkh,soluongsach,cb_isVip.isChecked());
                edt_thanhtien.setText(hd.thanhtien()+"");
            }
        });
        btn_tiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenkh = edt_tenkh.getText().toString();
                int soluongsach = 0;
                if(edt_soluongsach.getText().toString().trim().length()>0)
                    soluongsach=Integer.parseInt(edt_soluongsach.getText().toString());
                HoaDon hd = new HoaDon(tenkh,soluongsach,cb_isVip.isChecked());
                dsHD.add(hd);
                edt_tenkh.setText("");
                edt_soluongsach.setText("");
                edt_thanhtien.setText("");
            }
        });
        btn_thongke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_tongkh.setText(dsHD.size()+"");
                int countVip=0;
                double sumDt=0;
                for (HoaDon item:dsHD) {
                    sumDt+=item.thanhtien();
                    if(item.isVip()==true)
                        countVip++;
                }
                edt_tongkhvip.setText(countVip+"");
                edt_tongdt.setText(sumDt+"");
            }
        });
    }
}
