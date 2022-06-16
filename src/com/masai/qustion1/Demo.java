package com.masai.qustion1;

public class Demo {

    public static void main(String[] args) {
//        Student s1 = new Student(123,"raju",200,'a');
//        if(s1.getMark()>500){
//            System.out.println("Grade is A");
//        }
//        else if(s1.getMark()<500 && s1.getMark()>400){
//            System.out.println("Grade is B");
//        }
//        else{
//            System.out.println("grade is C");
//        }

        Student s2 = new Student();
        s2.setMark(356);

        if (s2.getMark()>500){
//            System.out.println("Grade is A");
            s2.setGrade('A');
        }
        else if(s2.getMark()<500 && s2.getMark()>400){
            s2.setGrade('B');
        }
        else {
            s2.setGrade('C');
        }

        s2.displayDetails();

    }
}
