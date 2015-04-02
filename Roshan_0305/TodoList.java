package com.Project.ToDolist;

/**
 * Created by Roshan on 4/2/2015.
 */
public class TodoList {
    public static void main(String[] args) {

        Notes note1=new Notes();
        note1.createNotes();
        note1.createdBy();
        note1.deleteNotes();

        Days days=new Days();
        days.selectDays();
        days.displayDays();

        Times time=new Times();
        time.createTimes();
        time.selectTimeToDisplayNote();
    }
}
