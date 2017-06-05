package alex.moneymanager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import alex.moneymanager.R;
import alex.moneymanager.activities.AuthActivity;
import alex.moneymanager.application.MoneyManagerApplication;
import alex.moneymanager.utils.PreferenceUtil;
import alex.moneymanager.utils.SystemUtils;
import butterknife.BindView;

public class OrganizationsFragment extends BaseFragment {

    public static final String TAG = "OrganizationsFragment";

    @Inject
    SystemUtils systemUtils;
    @Inject
    PreferenceUtil preferenceUtil;

    public OrganizationsFragment() {
    }

    public static OrganizationsFragment newInstance() {
        return new OrganizationsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_organizations, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        ((AuthActivity) getActivity()).updateMenuByFragment(TAG);

        ((MoneyManagerApplication) getActivity().getApplication()).component().inject(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

//    @Override
//    public void showErrorDialog() {
//        String errorMessage;
//        if (systemUtils.isConnected()) {
//            errorMessage = "Error while loading data";
//        } else {
//            errorMessage = "No internet connection";
//        }
//
//        ErrorDialogFragment fragment = ErrorDialogFragment.newInstance(
//                errorMessage,
//                "Ok",
//                "Try again",
//                new ErrorDialogFragment.OnClickListener() {
//                    @Override
//                    public void onPositiveButtonClick() {
//                    }
//
//                    @Override
//                    public void onNegativeButtonClick() {
//
//                    }
//                }
//        );
//
//        fragment.show(getChildFragmentManager(), ErrorDialogFragment.TAG);
//    }
}