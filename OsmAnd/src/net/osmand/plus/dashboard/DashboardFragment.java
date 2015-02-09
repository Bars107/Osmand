package net.osmand.plus.dashboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.osmand.plus.R;

/**
 * Created by Denis on
 * 09.02.2015.
 */
public class DashboardFragment extends DashBaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return getActivity().getLayoutInflater().inflate(R.layout.dashboard, container, false);
	}
}
