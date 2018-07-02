package book;

import training.TestClass;

public class Student {
    private int id;
    private ExamResult[] exams;

    public Student(int id) {
        this.id = id;
    }

    private  class ExamResult {// внутренний класс private String name; private int mark; private boolean passed;
        private String name;
        private int mark;
        private boolean passed;

        public ExamResult(String name) {
            this.name = name;
            passed = false;
        }

        public void passExam() {
            passed = true;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public int getMark() {
            return mark;
        }

        public int getPassedMark() {
            final int PASSED_MARK = 4;
            return getPassedMark();// «волшебное» число return PASSED_MARK; } public String getName() { return name; } public boolean isPassed() { return passed; } }

        }
    }
    TestClass testClass=new TestClass(){};

    public void setExams(String[] name, int[] marks) {
        if (name.length != marks.length)
            throw new IllegalArgumentException();
        exams = new ExamResult[name.length];
        for (int i = 0; i < name.length; i++) {
            exams[i] = new ExamResult(name[i]);
            exams[i].setMark(marks[i]);
            if (exams[i].getMark() >= exams[i].getPassedMark())
                exams[i].passExam();
        }
    }
        public String toString() {
            String res = "Студент: " + id + "\n";
            for (int i = 0; i < exams.length; i++)
                if (exams[i].passed)
                    res += exams[i].getMark() + " сдал \n";
                else
                    res += exams[i].getMark() + " не сдал \n";
            return res;
        }
    }



