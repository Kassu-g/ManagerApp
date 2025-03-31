package com.example.managerapp;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsAdapter extends FragmentPagerAdapter {
    private final Context konteksti;

    public SectionsAdapter(Context konteksti, FragmentManager fm) {
        super(fm);
        this.konteksti = konteksti;
    }
    @Override
    public Fragment getItem(int indeksi) {
        switch (indeksi) {
            case 0:
                return new JoukkueFragment();
            case 1:
                return new PelaajaFragment();
            case 2:
                return new OtteluFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int indeksi) {
        switch (indeksi) {
            case 0:
                return "Joukkueet";
            case 1:
                return "Pelaajat";
            case 2:
                return "Ottelut";
        }
        return null;
    }
}

