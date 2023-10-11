package org.oscarrecinos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subjectxteacher")
public class SubjectXTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public SubjectXTeacher() {
    }

    public SubjectXTeacher(Subject subject, Teacher teacher, Group group) {
        this.subject = subject;
        this.teacher = teacher;
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "SubjectXTeacher{" +
                "subject=" + subject.getTitle() +
                ", teacher=" + teacher.getFirstName()+ " " + teacher.getLastName() +
                ", group=" + group.getName() +
                '}';
    }
}
