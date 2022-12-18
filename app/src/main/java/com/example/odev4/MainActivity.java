package com.example.odev4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.example.odev4.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Gorsel> gorselArrayList;

    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Gorsel samsung = new Gorsel("Samsung LC34J791WTRXUF",1,R.drawable.samsunguw);
        Gorsel gigabyte = new Gorsel("Gigabyte M34WQ",2,R.drawable.gigabuyeuw);
        Gorsel msi = new Gorsel("MSI Optix MEG381CQR Plus",3,R.drawable.msiuw);
        Gorsel asus = new Gorsel("Asus ProArt PA348CGV",4,R.drawable.asusuw);
        Gorsel huawei = new Gorsel("Huawei MateView GT 34",5,R.drawable.huaweiuw);

        gorselArrayList = new ArrayList<>();

        gorselArrayList.add(samsung);
        gorselArrayList.add(gigabyte);
        gorselArrayList.add(msi);
        gorselArrayList.add(asus);
        gorselArrayList.add(huawei);

        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textViewBilgi.setText("Hakkında : " + gorselArrayList.get(0).bilgi);
        seciliSiraNo=0;
    }

    public void geriGelme(View view) {
        if(seciliSiraNo>0) {
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Hakkında : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void ileriGitme(View view) {
        if(seciliSiraNo<gorselArrayList.size()-1) {
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Hakkında : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }



}