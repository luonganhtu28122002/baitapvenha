package model;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> list;
    private int lenght;

    public StudentList() {
        list = new ArrayList<Student>();
    }
    public ArrayList<Student> findByName(String name) {
        boolean found = false;
        ArrayList<Student> marches = new ArrayList<>();
        for(Student s: list) {
            String fullName = new String(s.getFirstName() + " " + s.getLastName()). toLowerCase();
            if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                marches.add(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        return marches;
    }
    public Student findById(int id) {
        for (Student s:list){
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void add(Student s) {
        list.add(s);
    }
    public void remove(int id){
        boolean found = false;
        for (Student s: list) {
            if (s.getId() == id) {
                int choice = 1;
                System.out.println("Are you sure deleting this student? (1.Yes  2.No");
                if (choice == 1)
                    list.remove(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Can not find student with id " + id);
        }
    }
    public void sortByMark() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return new Double(o2.getMark()).compareTo(o1.getMark());
            }
        });
    }
    public  void showList() {
        for (Student s: list) {
            s.printInfo();
        }
    }
    public void showList(ArrayList<Student> slist) {
        for (Student s: slist) {
            s.printInfo();
        }
    }
}

