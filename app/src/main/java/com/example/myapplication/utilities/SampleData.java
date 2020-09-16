package com.example.myapplication.utilities;

import com.example.myapplication.model.PunchEntity;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    private static final String DATE_1 = "September 1, 2020 18:00 - 23:00";
    private static final String DATE_2 = "September 1, 2020 18:00 - 23:00";
    private static final String DATE_3 = "September 1, 2020 18:00 - 23:00";
    private static final String DATE_4 = "October 1, 2020 18:00 - 23:00";

    private static final String BREAK_1 = "18:00 - 18:10, 23:00 - 23:10, 23:00 - 23:10";
    private static final String BREAK_2 = "18:00 - 18:10, 23:00 - 23:10";
    private static final String BREAK_3 = "18:00 - 18:10, 23:00 - 23:10";

    private static final String HOURS_1 = "6";
    private static final String HOURS_2 = "6";
    private static final String HOURS_3 = "6:30";

    public static List<PunchEntity> getData() {
        List<PunchEntity> punchEntities = new ArrayList<>();
        punchEntities.add(new PunchEntity(1, DATE_1, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(2, DATE_2, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(3, DATE_3, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(4, DATE_1, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(5, DATE_2, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(6, DATE_3, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(7, DATE_1, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(8, DATE_2, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(9, DATE_3, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(10, DATE_1, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(11, DATE_2, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(12, DATE_3, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(9, DATE_3, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(10, DATE_1, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(11, DATE_2, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(12, DATE_3, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(1, DATE_4, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(2, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(3, DATE_4, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(4, DATE_4, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(5, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(6, DATE_4, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(7, DATE_4, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(8, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(9, DATE_4, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(10, DATE_4, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(11, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(12, DATE_4, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(5, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(6, DATE_4, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(7, DATE_4, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(8, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(9, DATE_4, BREAK_3, HOURS_3));
        punchEntities.add(new PunchEntity(10, DATE_4, BREAK_1, HOURS_1));
        punchEntities.add(new PunchEntity(11, DATE_4, BREAK_2, HOURS_2));
        punchEntities.add(new PunchEntity(12, DATE_4, BREAK_3, HOURS_3));
        return punchEntities;
    }
}