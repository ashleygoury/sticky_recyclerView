package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.model.PunchEntity;
import com.example.myapplication.ui.PunchAdapter;
import com.example.myapplication.ui.RecyclerItemClickListener;
import com.example.myapplication.ui.RecyclerSectionItemDecoration;
import com.example.myapplication.utilities.SampleData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewShift;
    private List<PunchEntity> punchEntities = new ArrayList<>();
    private PunchAdapter mPunchAdapter;
    private DividerItemDecoration mDividerItemDecoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewShift);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false));

        final List<PunchEntity> punchEntities = getPunchDetails();

        RecyclerSectionItemDecoration sectionItemDecoration =
                new RecyclerSectionItemDecoration(getResources().getDimensionPixelSize(R.dimen.recycler_section_header_height),
                        true,
                        getSectionCallback(punchEntities));
        recyclerView.addItemDecoration(sectionItemDecoration);

        recyclerView.setAdapter(new PunchAdapter(getLayoutInflater(),
                punchEntities,
                R.layout.item_view));

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(MainActivity.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Hours =  " + punchEntities.get(position).getHours(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "This is long pressed!!!", Toast.LENGTH_SHORT).show();
            }
        }));
    }

    private List<PunchEntity> getPunchDetails() {
        SampleData sampleData = new SampleData();
        punchEntities = sampleData.getData();
        return punchEntities;
    }

    private RecyclerSectionItemDecoration.SectionCallback getSectionCallback(final List<PunchEntity> punchEntities) {
        return new RecyclerSectionItemDecoration.SectionCallback() {
            @Override
            public boolean isSection(int position) {
                return position == 0
                        || punchEntities.get(position)
                        .getDate()
                        .charAt(0) != punchEntities.get(position - 1)
                        .getDate()
                        .charAt(0);
            }

            @Override
            public CharSequence getSectionHeader(int position) {
                return punchEntities.get(position)
                        .getDate()
                        .subSequence(0,
                                9);
            }
        };
    }
}


//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        recyclerViewShift = findViewById(R.id.recyclerViewShift);
//        initRecyclerView();
//
//        punchEntities.addAll(SampleData.getData());
//        for (PunchEntity punchEntity : punchEntities) {
//            Log.i("Data", punchEntity.toString());
//        }
//    }
//
//    private void initRecyclerView() {
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerViewShift.setLayoutManager(layoutManager);
//        recyclerViewShift.setHasFixedSize(true);
//        mPunchAdapter = new PunchAdapter(punchEntities, this);
//        recyclerViewShift.setAdapter(mPunchAdapter);
//
//        mDividerItemDecoration = new DividerItemDecoration(recyclerViewShift.getContext(),
//                layoutManager.getOrientation());
//        recyclerViewShift.addItemDecoration(mDividerItemDecoration);
//
//    }
//}