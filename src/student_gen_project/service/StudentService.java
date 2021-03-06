package student_gen_project.service;


import student_gen_project.model.Course;
import student_gen_project.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        if (students.containsKey(studentId)) {
            return true;
        }
        return false;
    }

    public void showSummary()
    {
        System.out.println( "All Students" );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( student );
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
