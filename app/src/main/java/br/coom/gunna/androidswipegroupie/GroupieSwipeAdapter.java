package br.coom.gunna.androidswipegroupie;


import com.daimajia.swipe.SwipeLayout;

import com.daimajia.swipe.interfaces.SwipeAdapterInterface;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;
import com.daimajia.swipe.util.Attributes;
import com.genius.groupie.GroupAdapter;


import java.util.List;

public class GroupieSwipeAdapter extends GroupAdapter implements
        SwipeItemMangerInterface, SwipeAdapterInterface {

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return 0;
    }

    @Override
    public void openItem(int position) {

    }

    @Override
    public void closeItem(int position) {

    }

    @Override
    public void closeAllExcept(SwipeLayout layout) {

    }

    @Override
    public void closeAllItems() {

    }

    @Override
    public List<Integer> getOpenItems() {
        return null;
    }

    @Override
    public List<SwipeLayout> getOpenLayouts() {
        return null;
    }

    @Override
    public void removeShownLayouts(SwipeLayout layout) {

    }

    @Override
    public boolean isOpen(int position) {
        return false;
    }

    @Override
    public Attributes.Mode getMode() {
        return null;
    }

    @Override
    public void setMode(Attributes.Mode mode) {

    }
}
