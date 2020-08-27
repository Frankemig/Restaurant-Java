package cl.sulcansystem.restaurante;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cl.sulcansystem.restaurante.modelo.BaseDatosEmpleados;
import cl.sulcansystem.restaurante.modelo.Empleado;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NuestroEquipo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NuestroEquipo extends Fragment {

    RecyclerView recycleEmpleado;
    List<Empleado> empleadoList = new ArrayList<>();
    EmpleadoAdapter empleadoAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NuestroEquipo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NuestroEquipo.
     */
    // TODO: Rename and change types and number of parameters
    public static NuestroEquipo newInstance(String param1, String param2) {
        NuestroEquipo fragment = new NuestroEquipo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nuestro_equipo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        empleadoList = BaseDatosEmpleados.getListaEmpleados();
        recycleEmpleado = view.findViewById(R.id.recycler_quienes_somos);
        empleadoAdapter= new EmpleadoAdapter(empleadoList);
        recycleEmpleado.setAdapter(empleadoAdapter);
    }
}