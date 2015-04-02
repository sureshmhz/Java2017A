package com.company;
/*
Loadshedding Nepal App
*/

public class Main {

    public static void main(String[] args) {
        DisplayGroup group = new DisplayGroup();
        group.displayGroup();//displays group

        DisplayWeek week = new DisplayWeek();
        week.displayWeek(); //display week

        SearchGroup sgroup = new SearchGroup();
        sgroup.searchGroup(); //search group

        GetTime time = new GetTime();
        time.startTime();//gives startTime
        time.endTime();  //gives endTime

         GetMap map = new GetMap();
        map.getMap(); //gives map location
    }
}
