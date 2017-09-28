package grails.lab

class Student {

    String firstName
    String lastName
    String email
    Date born
    Boolean isActive

    static belongsTo = Teacher
    static hasMany = [teachers: Teacher]

    static constraints = {
        firstName maxSize: 255
        lastName maxSize: 255
        email maxSize: 255
    }
}
