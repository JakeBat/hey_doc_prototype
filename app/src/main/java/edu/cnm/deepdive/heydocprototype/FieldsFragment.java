package edu.cnm.deepdive.heydocprototype;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class FieldsFragment extends Fragment {

  private ListView fields;
  private ArrayAdapter listAdapter;

  public FieldsFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_fields, container, false);

    fields = view.findViewById(R.id.fields);
    String[] fieldsArray = {"Dermatology", "Allergy"};
    ArrayList<String> fieldsList = new ArrayList<>();
    fieldsList.addAll(Arrays.asList(fieldsArray));
    listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, fieldsList);
    fields.setAdapter(listAdapter);

    return view;
  }

}
