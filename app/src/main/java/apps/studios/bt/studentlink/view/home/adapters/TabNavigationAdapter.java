package apps.studios.bt.studentlink.view.home.adapters;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

import apps.studios.bt.studentlink.view.groups.GroupUI;
import apps.studios.bt.studentlink.view.profile.ProfileUI;

/**
 * Created by Lesedi on 2017/07/06. :D
 */

public class TabNavigationAdapter extends FragmentPagerAdapter {

    private static final String[] TITLES = new String[]{"Groups", "Profile"};

    public TabNavigationAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        return super.instantiateItem(container, position);
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 0:
                f = GroupUI.newInstance();
                break;

            case 1:
                f = ProfileUI.newInstance();
                break;

        }
        return f;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}